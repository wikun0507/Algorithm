package LeetCode.数组.连续的子数组和;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author WiKunZ
 * @Date 2021/6/2-10:20
 */
public class Solution {
    public static boolean checkSubarraySum(int[] nums, int k) {
        int pre = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for (int i = 0; i < nums.length; i++) {
            pre += nums[i];
            int tmp = pre%k;
            if(map.containsKey(tmp)){
                if((i-map.get(tmp))>=2)
                    return true;
            }else{
                map.put(tmp,i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] num1 = {23, 2, 4, 6, 7};
        int[] num2 = {23, 2, 6, 4, 7};
        int[] num3 = {0, 1, 0, 3, 0, 4, 0, 4, 0};
        int[] num4 = {0, 0};
        int[] num5 = {1,2,3};
        System.out.println(checkSubarraySum(num1, 6));
        System.out.println(checkSubarraySum(num2, 13));
        System.out.println(checkSubarraySum(num3, 5));
        System.out.println(checkSubarraySum(num4, 1));
        System.out.println(checkSubarraySum(num5, 5));

    }
}
