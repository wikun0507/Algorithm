package LeetCode.其他.青蛙过河;

/**
 * @Author WiKunZ
 * @Date 2021/4/29-12:09
 */
public class Solution {
    public static boolean canCross(int[] stones) {
        boolean[][] dp = new boolean[stones.length][stones.length+1];
        dp[0][1] = true;
        for(int i = 1;i< stones.length;i++){
            boolean flag = false;
            for(int j = i-1;j>=0;j--){
                int k = stones[i]-stones[j];
                if(k > i){
                    break;
                }
                if(dp[j][k]){
                    dp[i][k] = true;
                    dp[i][k+1] = true;
                    dp[i][k-1] = true;
                    flag = true;
                }
            }
            if(i == stones.length-1 && !flag){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,8,9,11};
        int[] b = {0,1,3,5,6,8,12,17};
        System.out.println(canCross(b));
    }
}
