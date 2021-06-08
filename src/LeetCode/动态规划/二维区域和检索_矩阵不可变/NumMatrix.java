package LeetCode.动态规划.二维区域和检索_矩阵不可变;

import java.util.Arrays;

/**
 * @Author WiKunZ
 * @Date 2021/5/29-12:56
 */
class NumMatrix {
    int[][] map;
    /*前缀和方式*/
//    public NumMatrix(int[][] matrix) {
//        int n = matrix.length;
//        if(n>0){
//            int m = matrix[0].length;
//            map = new int[m+1][n+1];
//            for(int i = 1;i<n+1;i++){
//                for(int j = 1;j<m+1;j++){
//                    map[i][j] += matrix[i-1][j-1]+map[i][j-1];
//                }
//            }
//        }
//
//    }
//
//    public int sumRegion(int row1, int col1, int row2, int col2) {
//        int sum = 0;
//        for(int i = row1+1;i<=row2+1;i++){
//            sum += map[i][col2+1];
//            sum -= map[i][col1];
//        }
//        return sum;
//    }
    /* 二维数组方式*/
    public NumMatrix(int[][] matrix) {
        int n = matrix.length;
        if(n>0){
            int m = matrix[0].length;
            map = new int[n+1][m+1];
            for(int i = 1;i<=n;i++){
                for(int j = 1;j<=m;j++){
                    map[i][j] = map[i][j-1]+map[i-1][j]-map[i-1][j-1]+matrix[i-1][j-1];
                }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1++;col1++;row2++;col2++;
        return map[row2][col2]-map[row2][col1-1]-map[row1-1][col2]+map[row1-1][col1-1];
    }


    public static void main(String[] args) {
        int[][] a = {{3, 0, 1, 4, 2},{5, 6, 3, 2, 1},{1, 2, 0, 1, 5},{4, 1, 0, 1, 7},{1, 0, 3, 0, 5}};
        int[][] b = {{1,2,3},{4,5,6},{7,8,9}};
        NumMatrix numMatrix = new NumMatrix(a);
        System.out.println(numMatrix.sumRegion(2, 1, 4, 3));
        System.out.println(numMatrix.sumRegion(1, 1, 2, 2));
        System.out.println(numMatrix.sumRegion(1, 2, 2, 4));

    }
}
