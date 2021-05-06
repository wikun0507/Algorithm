package LeetCode.剑.青蛙跳台阶;

/**
 * @Author WiKunZ
 * @Date 2021/5/6-16:44
 */
public class Solution {

    public static int numWays(int n) {
        /**
         * 递归超时
         */
//        if(n<0)
//            return 0;
//        else if(n==1||n==0)
//            return 1;
//        else if(n==2)
//            return 2;
//        return (numWays(n-1)+numWays(n-2))%(1000000007);

        int a = 1;
        int b = 1;
        int sum = 1;
        for(int i = 1;i<n;i++){
            sum = (sum+a)%1000000007;
            a = b;
            b = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(numWays(43));
        System.out.println(numWays(1));
        System.out.println(numWays(0));
        System.out.println(numWays(2));
    }
}
