package LeetCode.剑.数组中出现次数超过一半的数字;

import java.util.Arrays;

/**
 * @Author WiKunZ
 * @Date 2021/5/25-21:42
 */
public class Solution {
    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length/2];
        /**
         * 摩尔投票法
         */
        int vote = 1;
        int x = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(vote==0){
                x = nums[i];
                vote = 1;
                continue;
            }
            if(nums[i]!=x){
                vote--;
            }else{
                vote++;
            }
        }
        return x;
    }
}
