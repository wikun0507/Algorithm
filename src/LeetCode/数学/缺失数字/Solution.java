package LeetCode.数学.缺失数字;

/**
 * @Author WiKunZ
 * @Date 2021/4/29-23:29
 */
public class Solution {
    public static int missingNumber(int[] nums) {
        int result = getSum(nums.length+1);
        for(int i = 0;i<nums.length;i++){
            result -= nums[i];
        }
        return result;
    }

    public static int getSum(int num){
        return (num*(num-1))/2;
    }
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
        System.out.println(missingNumber(new int[]{3,0,1}));
        System.out.println(missingNumber(new int[]{0,1}));
        System.out.println(missingNumber(new int[]{0}));
    }
}
