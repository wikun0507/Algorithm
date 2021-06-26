package LeetCode.动态规划.完全平方数;

import java.util.Arrays;

/**
 * @Author WiKunZ
 * @Date 2021/6/11-10:58
 */
public class Solution {
    public static int numSquares(int n) {
        int row =(int)Math.sqrt(n)+1;
        int col = n+1;
        int[][] dp = new int[row][col];
        for(int i = 1;i<=n;i++){
            dp[1][i] = i;
        }

        for(int i = 2;i<row;i++){
            int square = i*i;
            for(int j = 1;j<=n;j++){
                int sub = j-square;
                if(sub>=0){
                    dp[i][j] = Math.min(dp[i][sub]+1,dp[i-1][j]);
                }else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        for(int i = 0;i<row;i++){
            System.out.println(Arrays.toString(dp[i]));
        }
        int result = Integer.MAX_VALUE;
        for(int i = 1;i<row;i++){
            result = Math.min(dp[i][n],result);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(numSquares(12));
    }
}
