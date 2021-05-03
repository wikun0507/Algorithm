package LeetCode.其他.反转数字;

/**
 * @Author WiKunZ
 * @Date 2021/5/3-11:10
 */
public class Solution {
    public static int reverse(int x) {
        long result = 0;
        long y = Math.abs(x);
        int flag = x>0?1:-1;
        while(y>0){
            result = result*10+y%10;
            y /= 10;
        }
        return (result==(int)result)?(int)result*flag:0;
    }
    public static void main(String[] args) {
        System.out.println(reverse(-321));
        System.out.println(reverse(-0));
    }
}
