package LeetCode.数组.只出现一次的数字;

public class Solution {
    /**
     * 该方式只能解决重复元素成对出现的情况
     */
    public static void main(String[] args) {
        int a[] = {1,1,1,1,2,2,3};
        System.out.println("结果:"+singleNumber(a));
    }
    public static int singleNumber(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++){
            result^=nums[i];
            System.out.println(result);
        }
        return result;
    }
}
