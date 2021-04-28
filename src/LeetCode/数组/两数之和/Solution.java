package LeetCode.数组.两数之和;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int index=0;
        int length = nums.length;

        for(int i = 0;i<length;i++){
            for(int j = i+1;j<length;j++){
                if(nums[i]+nums[j] == target){
                    result[index++] = i;
                    result[index] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int[] result = twoSum(nums,6);
        for(int i:result){
            System.out.print(i);
        }
    }
}
