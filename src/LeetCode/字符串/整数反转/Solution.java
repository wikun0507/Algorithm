package LeetCode.字符串.整数反转;

public class Solution {
    public static int reverse(int x) {
        long result = 0;
        int tmp;
        while(x!=0){
            tmp = x%10;
            x /= 10;
            result =(result+tmp)*10;
        }
        result = result/10l;
        return (int)result==result? (int) result/10 :0;

    }
    public static void main(String[] args) {
        int x = -2147483412;
        System.out.println(reverse(x));
    }
}
