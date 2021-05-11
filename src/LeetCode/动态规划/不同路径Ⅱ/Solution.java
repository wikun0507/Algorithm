package LeetCode.动态规划.不同路径Ⅱ;

import javafx.util.Pair;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author WiKunZ
 * @Date 2021/5/9-22:43
 */
public class Solution {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        /**
         * 动态规划
         */
//        int row = obstacleGrid.length;
//        int col = obstacleGrid[0].length;
//        if(obstacleGrid[0][0]==1){
//            return 0;
//        }
//        int[][] result = new int[row][col];
//        result[0][0] = 1;
//        for(int i = 0 ;i<row;i++){
//            for (int j = 0; j < col; j++) {
//                if(i==0&&j==0){
//                    continue;
//                }
//                if(obstacleGrid[i][j]!=1&&i>0&&j>0){
//                    result[i][j] = result[i-1][j]+result[i][j-1];
//                }else if(obstacleGrid[i][j]!=1&&i==0){
//                    result[i][j] = result[i][j-1];
//                }else if(obstacleGrid[i][j]!=1&&j==0){
//                    result[i][j] = result[i-1][j];
//                }else {
//                    result[i][j] = 0;
//                }
//            }
//        }
//        return result[row-1][col-1];
        /**
         * DFS
         */
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        if (obstacleGrid[0][0]==1||obstacleGrid[row-1][col-1]==1)
            return 0;
        return DFS(new HashMap<Pair,Integer>(),obstacleGrid,0,0);
    }
    public static int DFS(Map<Pair,Integer> cache, int[][] map, int i, int j){
        Pair pair = new Pair(i,j);
        if(cache.containsKey(pair)){
            return cache.get(pair);
        }
        if(i == map.length||j==map[0].length)
            return 0;
        if(i == map.length-1&&j==map[0].length-1){
            return 1;
        }
        if(map[i][j]==1)
            return 0;
        int result = DFS(cache,map,i+1,j)+DFS(cache,map,i,j+1);
        cache.put(pair,result);
        return result;

    }

    public static void main(String[] args) {
        int[][] map = {{0,0,0},{0,1,0},{0,0,0}};
        int[][] map2 = {{0,1},{0,0}};
        int[][] map3 = {{0,0,0,0,0},{0,0,1,0,0},{0,0,0,0,0}};
        System.out.println(uniquePathsWithObstacles(map));
        System.out.println(uniquePathsWithObstacles(map2));
        System.out.println(uniquePathsWithObstacles(map3));
    }
}
