package LeetCode.剑.矩阵中的路径;

/**
 * @Author WiKunZ
 * @Date 2021/5/6-17:05
 */
public class Solution {
    public static boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();
        for(int i = 0;i< board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(dfs(board,chars,i,j,0))
                    return true;
            }
        }
        return false;
    }

    public static boolean dfs(char[][] board,char[] word,int i,int j,int k){
        if(i<0||j<0||i> board.length||j>board[0].length||board[i][j]!=word[k])
            return false;
        if(k == word.length-1)
            return true;
        board[i][j] = '\0';
        boolean res = dfs(board,word,i+1,j,k+1)||dfs(board,word,i,j-1,k+1)
                ||dfs(board,word,i-1,j,k+1)||dfs(board,word,i,j+1,k+1);//下左上右
        board[i][j] = word[k];
        return res;
    }
    public static void main(String[] args) {
    }
}
