package LeetCode.剑.数组中数字出现的次数;

/**
 * @Author WiKunZ
 * @Date 2021/5/27-9:25
 */
public class Solution {
    public int[] singleNumbers(int[] nums) {
        int tmp = 0;
        for(int i = 0;i<nums.length;i++){
            tmp ^=nums[i];
        }
        int mask = tmp^(-tmp);
        int a = 0,b = 0;
        for(int i:nums){
            if((i&mask)==0)
                a^=i;
            else
                b^=i;
        }
        return new int[]{a,b};
    }

    public static void main(String[] args) {

    }
}
