package LeetCode.数组.最大子序和;

public class Solution {
    public static int maxSubArray(int[] nums) {
//        if(nums.length==1){
//            return nums[0];
//        }
//        int[][] dp = new int[nums.length][1];
//        dp[0][0] = nums[0];
//        int max = 0;
//        for(int i = 1;i<nums.length;i++){
//            if(dp[i-1][0]>0){
//                dp[i][0] = nums[i]+dp[i-1][0];
//            }else{
//                dp[i][0] = nums[i];
//            }
//            max = Math.max(dp[i][0],max);
//        }
//        return max;
        int n = nums.length;
        if(n==0){
            return 0;
        }
        // 定义 dp[i][的含义为 nums[i]为结尾的数组为最大子序列
        // 初始值 dp[0] = num[0]
        // 关系式：本身最大，或者本身+上一次最大dp[i-1]
        int[] dp = new int[n];
        dp[0] = nums[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(nums[i],nums[i] + dp[i-1]);
        }
        // 再到dp数组中找到最大值即可
        int max = dp[0];
        for (int i : dp) {
            if(max<i){
                max = i;
            }
        }
        return max;


    }
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
