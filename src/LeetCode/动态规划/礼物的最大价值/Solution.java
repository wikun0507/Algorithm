package LeetCode.动态规划.礼物的最大价值;

import java.util.Arrays;

/**
 * @Author WiKunZ
 * @Date 2021/6/12-11:13
 */
public class Solution {
    public static int maxValue(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] dp = new int[row + 1][col + 1];
//        dp[1][1] = grid[0][0];
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                dp[i][j] = Math.max(dp[i - 1][j] + grid[i - 1][j - 1], dp[i][j - 1] + grid[i - 1][j - 1]);
            }
        }
//        for (int i = 0; i <= row; i++) {
//            System.out.println(Arrays.toString(dp[i]));
//        }
        return dp[row][col];
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int[][] grid2 = new int[][]{{1}};
        System.out.println(maxValue(grid));
        System.out.println(maxValue(grid2));
    }
}
