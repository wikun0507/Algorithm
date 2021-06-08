package LeetCode.困难.元素和为目标值的子矩阵数量;

/**
 * @Author WiKunZ
 * @Date 2021/5/29-12:49
 */
public class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] sum = new int[n+1][m+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + matrix[i - 1][j - 1];
            }
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                for (int p = 1; p <= i; p++) {
                    for (int q = 1; q <= j; q++) {
                        if (sum[i][j] - sum[p - 1][j] - sum[i][q - 1] + sum[p - 1][q - 1] == target) ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] a = {{0,1,0},{1,1,1},{0,1,0}};
        Solution solution = new Solution();
        System.out.println(solution.numSubmatrixSumTarget(a,0));
    }

}
