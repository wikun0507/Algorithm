package LeetCode.动态规划.零钱兑换;

import java.util.Arrays;

/**
 * @Author WiKunZ
 * @Date 2021/6/10-16:39
 */
public class Solution {
    public static int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length+1][amount+1];
        dp[0][0] = 1;
        //初始化基本状态
        for (int k = 0; k < coins.length + 1; k++){
            dp[k][0] = 1;       //金额为0时，只有一种方案，那就是不选
        }

        for(int i = 1;i<=coins.length;i++){
            for(int j = 1;j<=amount;j++){
                if(coins[i-1]>j){
                    dp[i][j] = dp[i-1][j];  //硬币比金额还大就不使用第i个硬币
                }else{      //硬币比金额小就使用第i个硬币,使用第i个硬币就得找到第i行中值为金额-i的方案数加上去
                    dp[i][j] = dp[i-1][j]+dp[i][j-coins[i-1]];
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }

        return dp[coins.length][amount];
    }

    /**
     * 优化成一维数组
     */
    public static int change2(int amount, int[] coins) {
        int[] dp = new int[amount+1];   //代表能凑成金额i的方案数
        dp[0] = 1;
        for(int i = 0;i< coins.length;i++){
            for(int j = 1;j<=amount;j++){
                if(coins[i]<=j){
                    dp[j] += dp[j-coins[i]];
                }
            }
            System.out.println(Arrays.toString(dp));
        }
        return dp[amount];
    }
    public static void main(String[] args) {
//        System.out.println(change(5, new int[]{1, 2, 5}));
        System.out.println(change2(5, new int[]{1, 2, 5}));
    }
}
