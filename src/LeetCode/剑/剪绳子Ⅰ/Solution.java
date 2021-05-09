package LeetCode.剑.剪绳子Ⅰ;

/**
 * @Author WiKunZ
 * @Date 2021/5/8-23:05
 */
public class Solution {
    public static int cuttingRope(int n) {
        /**
         * 动态规划方式
         */
//        if(n<=3)
//            return n-1;
//        int[] dp = new int[n+1];
//        dp[2] = 1;
//        for(int i = 3;i<n+1;i++)
//            for(int j = 2;j<i;j++)
//                dp[i] = Math.max(dp[i],Math.max(j*(i-j),j*dp[i-j]));
//        return dp[n];
        /**
         * 数学公式：3越多越好，
         */
        if(n<=3)
            return n-1;
        int a = n/3,b = n%3;
        if(b==0) return (int)Math.pow(3,a);
        else if(b==1) return (int)Math.pow(3,a-1)*4;
        else return (int)Math.pow(3,a)*2;
    }
    public static void main(String[] args) {
        System.out.println(cuttingRope(7));
    }

}
