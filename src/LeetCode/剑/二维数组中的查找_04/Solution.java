package LeetCode.剑.二维数组中的查找_04;

/**
 * @Author WiKunZ
 * @Date 2021/5/1-23:01
 * 提示：二叉搜索树
 */
public class Solution {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length==0||matrix[0].length==0)
            return false;
        int totalRow = matrix.length;
        int row = 0;//行
        int col = matrix[0].length-1;//列
        while(col>=0 && row<=(matrix.length-1)){
            if(target==matrix[row][col]){
                return true;
            }
            if(target>matrix[row][col]){
                row++;
            }else if(target<matrix[row][col]){
                col--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2},{3,4},{5,6},{7,8}};
        int[][] matrix2 = {{},{},{}};
        int[][] matrix3 = {{-1,3}};//1 2 0 1
        int[][] matrix4 = {{-5}};
        int[][] matrix5 = {{1,1}};
        int[][] matrix6 = {{1,3,5}};
        System.out.println(findNumberIn2DArray(matrix,4));//T
        System.out.println(findNumberIn2DArray(matrix2,2));//F
        System.out.println(findNumberIn2DArray(matrix3,-1));//T
        System.out.println(findNumberIn2DArray(matrix4,-5));//T
        System.out.println(findNumberIn2DArray(matrix5,2));//F
        System.out.println(findNumberIn2DArray(matrix6,4));//F
    }
}
