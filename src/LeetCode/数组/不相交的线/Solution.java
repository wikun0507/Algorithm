package LeetCode.数组.不相交的线;

import java.util.Arrays;

/**
 * @Author WiKunZ
 * @Date 2021/5/21-10:49
 */
public class Solution {
    public static int maxUncrossedLines(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[][] dp = new int[m+1][n+1];
        for(int i = 1;i<=m;i++){
            for(int j = 1;j<=n;j++){
                if (nums1[i-1]==nums2[j-1])
                    dp[i][j] = dp[i-1][j-1]+1;      //保证了连线不相交
                else
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]); //保留了先前dp的数据
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        int[] a = {2,5,1,2,5};
        int[] b = {10,5,2,1,5,2};
        System.out.println(maxUncrossedLines(a, b));
    }
}
