package LeetCode.剑.机器人的运动范围;

/**
 * @Author WiKunZ
 * @Date 2021/5/8-13:20
 */
public class Solution {
    public int movingCount(int m, int n, int k) {
        boolean[][] map = new boolean[m][n];
        return dfs(map,0,0,k,0);
    }

    public int dfs(boolean[][] map,int x,int y,int k,int count){
        if(x == map.length || y==map[0].length || map[x][y]){
            return 0;
        }
        if(k<getSum(x,y)){
            return 0;
        }
        map[x][y] = true;
        return 1+dfs(map,x+1,y,k,count)+dfs(map,x,y+1,k,count);
    }

    public int getSum(int x,int y){
        int Sum = 0;
        while(x>0||y>0){
            Sum +=x%10 + y%10;
            x /= 10;
            y /= 10;
        }
        return Sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.movingCount(2,3,1));
        System.out.println(solution.movingCount(3,1,0));
        System.out.println(solution.movingCount(36,11,15));

    }
}
