package LeetCode.数组.找出第K大的异或坐标值;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @Author WiKunZ
 * @Date 2021/5/19-9:28
 */
public class Solution {
    /**
     * 朴素做法
     */
//    public int kthLargestValue(int[][] matrix, int k) {
//        int row = matrix.length;
//        int col = matrix[0].length;
//        ArrayList<Integer> list = new ArrayList<>();
//        int[][] map = new int[row][col];
//        map[0][0] = matrix[0][0];
//        list.add(map[0][0]);
//        for(int i = 1;i<col;i++){
//            map[0][i] = matrix[0][i]^map[0][i-1];
//            list.add(map[0][i]);
//        }
//        for(int i = 1;i<row;i++){
//            map[i][0] = matrix[i][0]^map[i-1][0];
//            list.add(map[i][0]);
//        }
//        for(int i = 1;i<row;i++){
//            for(int j = 1;j<col;j++){
//                map[i][j] = map[i-1][j]^map[i][j-1]^map[i-1][j-1]^matrix[i][j];
//                list.add(map[i][j]);
//            }
//        }
//        Integer[] result = new Integer[row*col];
//        list.toArray(result);
//        Arrays.sort(result);
//        return result[row*col-k];
//    }

    /**
     * 用小根堆优化排序过程
     */
    public int kthLargestValue2(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] sum = new int[m+1][n+1];
        PriorityQueue<Integer> q = new PriorityQueue<>(k, Comparator.comparingInt(a -> a));
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                sum[i][j] = sum[i - 1][j] ^ sum[i][j - 1] ^ sum[i - 1][j - 1] ^ matrix[i - 1][j - 1];
                //System.out.println(sum[i][j]);
//                System.out.println("判断前:"+q+"size:"+q.size());
                if (q.size() < k) {
                    q.add(sum[i][j]);
//                    System.out.println("直接加:"+q+"size:"+q.size());
                } else {
                    if (sum[i][j] > q.peek()) {
                        q.poll();
                        q.add(sum[i][j]);
//                        System.out.println("peek后加:"+q+"size:"+q.size());
                    }
                }

            }
        }
        return q.peek();
    }

//    public int kthLargestValue2(int[][] matrix, int k) {
//        int m = matrix.length;
//        int n = matrix[0].length;
//        int[][] sum = new int[m+1][n+1];
//        PriorityQueue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1-o2;
//            }
//        });
//        for (int i = 1; i <= m; i++) {
//            for (int j = 1; j <= n; j++) {
//                sum[i][j] = sum[i - 1][j] ^ sum[i][j - 1] ^ sum[i - 1][j - 1] ^ matrix[i - 1][j - 1];
//                //System.out.println(sum[i][j]);
////                System.out.println("判断前:"+q+"size:"+q.size());
//                q.add(sum[i][j]);
//                if (q.size()>k){
//                    q.poll();
//                }
//
//            }
//        }
//        return q.peek();
//    }

    public static void main(String[] args) {
        int[][] a = {{5,2},{1,6}};
        int[][] b = {{0,1,2,3},{4,5,6,7},{8,9,10,11}};
        int[][] c = {{1}};
        int[][] d = {{10,9,5},{2,0,4},{1,0,9},{3,4,8}};
        Solution solution = new Solution();
        System.out.println(solution.kthLargestValue2(a, 3));
        System.out.println(solution.kthLargestValue2(b, 1));
        System.out.println(solution.kthLargestValue2(c, 1));
        System.out.println(solution.kthLargestValue2(d, 3));
    }
}
