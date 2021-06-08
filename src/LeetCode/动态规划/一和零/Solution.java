package LeetCode.动态规划.一和零;

/**
 * @Author WiKunZ
 * @Date 2021/6/6-10:17
 */
public class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int length = strs.length;
        int[][] record = new int[length][2];
        for (int i = 0; i < length; i++) {
            int one = 0;
            int zero = 0;
            for (char c : strs[i].toCharArray()) {
                if (c == '0') {
                    zero++;
                } else {
                    one++;
                }
            }
            record[i] = new int[]{zero, one};
        }
        int[][][] dp = new int[length][m+1][n+1];
        for(int i = 0;i<=m;i++){
            for(int j = 0;j<=n;j++){
                dp[0][i][j] = record[0][0]<=i&&record[0][1]<=j?1:0;
            }
        }
        for(int l = 1;l<length;l++){
            int zero = record[l][0],one = record[l][1];
            for(int i = 0;i<=m;i++){
                for(int j = 0;j<=n;j++){
                    //保持不变
                    int keep = dp[l-1][i][j];
                    //放入背包
                    int upper = (i>=zero&&j>=one)?dp[l-1][i-record[l][0]][j-record[l][1]]+1:0;
                    dp[l][i][j] = Math.max(keep,upper);
                }
            }
        }
        return dp[length-1][m][n];
    }

    public static void main(String[] args) {

    }
}
