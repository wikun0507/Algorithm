package LeetCode.数学.你能在你最喜欢的那天吃到你最喜欢的糖果吗;

import java.util.Arrays;

/**
 * @Author WiKunZ
 * @Date 2021/6/1-10:06
 *
 * 注意数据溢出，用long型保存
 */
public class Solution {
    public static boolean[] canEat(int[] candiesCount, int[][] queries) {
        boolean[] result = new boolean[queries.length];
        long[] pre = new long[candiesCount.length];
        pre[0] = candiesCount[0];
        for(int i = 1;i<candiesCount.length;i++){
            pre[i] = pre[i-1]+(long)candiesCount[i];
        }
        for(int j = 0;j< queries.length;j++){
            //一天吃一颗
            if(queries[j][1]>=pre[queries[j][0]])
                result[j] = false;
            else{//一天吃满
                if(queries[j][0]==0){
                    result[j] = true;
                    continue;
                }
                long maxEat = (long)(queries[j][1]+1)*(long)(queries[j][2]);
                if(maxEat<=pre[queries[j][0]-1]){
                    result[j] = false;
                }else{
                    result[j] = true;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        int[] candy = {5,2,6,4,1};
//        int[][] q = {{3, 1, 2}, {4, 10, 3}, {3, 10, 100},{4, 100, 30},{1, 3, 1},{0,0,0}};
//        System.out.println(Arrays.toString(canEat(candy, q)));
//        int[] candy2 = {16,38,8,41,30,31,14,45,3,2,24,23,38,30,31,17,35,4,9,42,28,18,37,18,14,46,11,13,19,3,5,39,24,48,20,29,4,19,36,11,28,49,38,16,23,24,4,22,29,35,45,38,37,40,2,37,8,41,33,8,40,27,13,4,33,5,8,14,19,35,31,8,8};
//        int[][] q1 = {{43, 1054, 49}};
//        System.out.println(Arrays.toString(canEat(candy2,q)));
        int[] candy3 = {5215,14414,67303,93431,44959,34974,22935,64205,28863,3436,45640,34940,38519,5705,14594,30510,4418,87954,8423,65872,79062,83736,47851,64523,15639,19173,88996,97578,1106,17767,63298,8620,67281,76666,50386,97303,26476,95239,21967,31606,3943,33752,29634,35981,42216,88584,2774,3839,81067,59193,225,8289,9295,9268,4762,2276,7641,3542,3415,1372,5538,878,5051,7631,1394,5372,2384,2050,6766,3616,7181,7605,3718,8498,7065,1369,1967,2781,7598,6562,7150,8132,1276,6656,1868,8584,9442,8762,6210,6963,4068,1605,2780,556,6825,4961,4041,4923,8660,4114};
        int[][] q2 = {{91, 244597, 840227137}};
        System.out.println(Arrays.toString(canEat(candy3,q2)));
    }
}
