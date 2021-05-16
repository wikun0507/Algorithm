package LeetCode.数组.删除排序数组中的重复项;

import java.util.Arrays;

/**
 * @Author WiKunZ
 * @Date 2021/5/14-23:47
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }else if(nums.length==1){
            return 1;
        }
        int i = 0;
        int j = 1;
        while(j < nums.length){
            if(nums[i]==nums[j]){
                j++;
            }else if(nums[i]!=nums[j]){
                nums[++i] = nums[j++];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1,1,2};
        int[] b = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(solution.removeDuplicates(b));
    }
}
