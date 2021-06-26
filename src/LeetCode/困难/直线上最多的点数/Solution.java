package LeetCode.困难.直线上最多的点数;

import java.util.HashMap;

/**
 * @Author WiKunZ
 * @Date 2021/6/24-22:43
 */
public class Solution {
    public int maxPoints(int[][] points) {
        int row = points.length;
        int result = 0;
        for (int i = 0; i < row; i++) {
            /* 记录当前节点作为起点时，每个斜率的个数 */
            HashMap<String,Integer> record = new HashMap<>();
            /* 记录当前节点作为起点时，某个斜率的最多“点”个数 */
            int maxLength = 0;
            for(int j = i+1;j<row;j++){
                int x = points[j][0]-points[i][0];
                int y = points[j][1]-points[i][1];
                int maxGongyue = gcd(x,y);
                String k = (x/maxGongyue)+"_"+(y/maxGongyue);
                record.put(k, record.getOrDefault(k,0)+1);
                maxLength = Math.max(record.get(k),maxLength);
            }
            /* 加1是因为maxLength没有加上起点 */
            result = Math.max(result,maxLength+1);
        }
        return result;
    }
    /*  获取a和b的最大公约数 */
    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
//        float a = 6,b = 4;
//        System.out.println(a/b);
//        a = 3;
//        b = 2;
//        System.out.println(a/b);
//        System.out.println();
//        System.out.println(solution.gcd(6, 4));
//        System.out.println(solution.gcd(2, 3));

        int[][] points = {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        System.out.println(solution.maxPoints(points));
    }
}
