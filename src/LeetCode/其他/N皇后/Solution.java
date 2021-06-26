package LeetCode.其他.N皇后;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author WiKunZ
 * @Date 2021/5/7-10:32
 */
public class Solution {

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] chars = new char[n][n];
        for(int i = 0;i<n;i++){
            Arrays.fill(chars[i],'.');
        }

        backTrace(result,chars,0);
        return result;
    }

    public static void backTrace(List<List<String>> result,char[][] tmp,int row){
        if(row == tmp.length){  //注意该行
            result.add(buildString(tmp));
            System.out.println(result);
            return;
        }
        for(int col = 0;col<tmp[0].length;col++){
            if(isValid(tmp,row,col)){   //注意该行
                tmp[row][col] = 'Q';
                backTrace(result,tmp,row+1);
                tmp[row][col] = '.';
            }
        }
    }
    //判断皇后的位置是否可行，不可行就回溯
    public static boolean isValid(char[][] tmp,int row,int col){
        //坐标位置的上面有没有皇后
        //下段代码漏写
        for (int i = 0; i < row; i++) {
            if (tmp[i][col] == 'Q') {
                return false;
            }
        }
        //检查右上角
        for(int i = row-1,j = col+1;i >= 0 && j< tmp[0].length;i--,j++){
            if(tmp[i][j]=='Q')
                return false;
        }
        //检查左上角
        for(int i = row-1,j = col-1;i >= 0 && j >= 0;i--,j--){
            if (tmp[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static List<String> buildString(char[][] tmp){
        List<String> result = new ArrayList<>();
        for(int i = 0;i< tmp.length;i++){
            result.add(new String(tmp[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solveNQueens(4).size()); //显示N皇后有几个解
//        System.out.println(solveNQueens(5).size());
    }

}
