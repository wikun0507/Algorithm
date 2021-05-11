package LeetCode.动态规划.不同路径;

/**
 * @Author WiKunZ
 * @Date 2021/5/9-21:42
 */
public class Solution {
    public static int uniquePaths(int m, int n) {
        int[][] map = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0||j==0)
                    map[i][j] = 1;
                else
                    map[i][j] = map[i-1][j]+map[i][j-1];
            }
        }
        return map[m-1][n-1];
    }
    public static void main(String[] args) {
        System.out.println(uniquePaths(1,100));
    }
}
