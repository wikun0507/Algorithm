package LeetCode.剑.螺旋矩阵II;

import java.util.Arrays;

/**
 * @Author WiKunZ
 * @Date 2021/5/25-21:58
 */
public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int count = 1;
        int i = 0,j = 0;
        int round = 0;
        while(count<=n*n){

            //向右
            while(j<n-round){
                result[i][j++] = count++;
            }
            j -= 1;
            i += 1;
            //向下
            while(i<n-round){
                result[i][j] = count++;
                i++;
            }
            i -= 1;
            j -= 1;
            //向左
            while(j>=round){
                result[i][j--] = count++;
            }
            j += 1;
            i -= 1;
            //向上
            while (i>round){
                result[i--][j] = count++;
            }
            round++;
            i = round;
            j = round;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 20;
        int[][] tmp = solution.generateMatrix(n);
        for(int i = 0;i<n;i++){
            System.out.println(Arrays.toString(tmp[i]));
        }
    }
}
