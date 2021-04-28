package LeetCode.数组.判断是否存在重复元素;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

    }
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
}
}
