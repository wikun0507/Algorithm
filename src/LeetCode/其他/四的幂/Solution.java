package LeetCode.其他.四的幂;

/**
 * @Author WiKunZ
 * @Date 2021/5/31-19:43
 */
public class Solution {
    public static boolean isPowerOfFour(int n) {
        if(n<=0)
            return false;
        while(n%4==0){
            n /=4;
        }
        return n==1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(0));
        System.out.println(isPowerOfFour(6));
        System.out.println(isPowerOfFour(8));
        System.out.println(isPowerOfFour(7));
        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(256));
    }
}
