package LeetCode.数组.旋转图像;

/**
 * 整体思路是先上下交换，然后对角线交换
 */
public class Solution {
    public static void rotate(int[][] matrix) {
        int i,j;
        int tmp;
        int index = matrix.length-1;
        for(i = 0;i < matrix.length/2;i++){
            for(j = 0;j< matrix.length;j++){
                tmp = matrix[i][j];
                matrix[i][j] = matrix[index][j];
                matrix[index][j] = tmp;
            }
            index--;
        }

        for(i = 0;i< matrix.length;i++){
            for(j = i+1;j<matrix.length;j++){
                tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {
                {5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16}
        };
        int[][] matrix2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        rotate(matrix);
    }
}
