package LeetCode.其他.删除并获得点数;

import java.util.Arrays;

/**
 * @Author WiKunZ
 * @Date 2021/5/5-13:26
 */


/**
 * 与打家劫舍题目类似
 */
public class Solution {
    public static int deleteAndEarn(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }else if(nums.length==0){
            return 0;
        }
        int max = nums[0];
        for(int num:nums){
            max = Math.max(max,num);
        }
        int[] count = new int[max+1];
        for(int num:nums){
            count[num] +=1;
        }
        return rob(count);
    }

    public static int rob(int[] nums){
        int[] dp = new int[nums.length];
        dp[1] = nums[1];
        dp[2] = nums[2]*2;
        for(int i = 2;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]*i);
        }
        return dp[nums.length-1];
    }
    public static void main(String[] args) {
//        int[] a = {3,4,2};
//        int[] b = {2,2,3,3,3,4};
//        int[] c = {1,2,3,4,5};
        int[] d = {1,1,1,2,4,5,5,5,6};
//        System.out.println(deleteAndEarn(a));
//        System.out.println(deleteAndEarn(b));
//        System.out.println(deleteAndEarn(c));
        System.out.println(deleteAndEarn(d));
    }
}
