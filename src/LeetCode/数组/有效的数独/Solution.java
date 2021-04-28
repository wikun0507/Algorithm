package LeetCode.数组.有效的数独;

public class Solution {
    public static boolean isValidSudoku(String[][] board) {
        int length = board.length;
        int[][] line = new int[length][length];
        int[][] row = new int[length][length];
        int[][] cell = new int[length][length];
        int i,j;
        for(i = 0;i<length;i++){
            for(j = 0;j<length;j++){
                if(board[i][j].equals("."))
                    continue;
                int num = Integer.parseInt(board[i][j])-1;  //数字
                int tmp = (i/3)*3+j/3;  //第tmp个单元格
                if(line[i][num] == 1 || row[j][num] == 1 || cell[tmp][num] == 1)
                    return false;
                line[i][num] = 1;
                row[j][num] = 1;
                cell[tmp][num] = 1;
            }
        }
        return true;

    }


    public static void main(String[] args) {
        String[][] ch = {{"8","3",".",".","7",".",".",".","."}
                        ,{"6",".",".","1","9","5",".",".","."}
                        ,{".","9","8",".",".",".",".","6","."}
                        ,{"8",".",".",".","6",".",".",".","3"}
                        ,{"4",".",".","8",".","3",".",".","1"}
                        ,{"7",".",".",".","2",".",".",".","6"}
                        ,{".","6",".",".",".",".","2","8","."}
                        ,{".",".",".","4","1","9",".",".","5"}
                        ,{".",".",".",".","8",".",".","7","9"}
                         };
        boolean result = isValidSudoku(ch);
        System.out.println(result);
//        char[][] ch = {{'1','2'}};
//        int num = ch[0][0] - '0' - 1;
//        System.out.println(num);
    }
}
