package LeetCode.数组.只出现一次的数字;

import java.util.*;

public class Solution {
    /**
     * 该方式只能解决重复元素成对出现的情况
     */
    public static void main(String[] args) {
        int[] a = {1, 1, 1, 1, 2, 2, 3};
        int[] b = {1, 1, 1, 2};
        int[] c = {0,1,0,1,0,1,99};
        //System.out.println("结果:" + singleNumber(a));
        //System.out.println("结果:" + singleNumber2(b));
        System.out.println("结果:" + singleNumber3(b));
    }

    public static int singleNumber2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else if (map.containsKey(nums[i])) {
                map.replace(nums[i], map.get(nums[i]) + 1);
            }
        }

        for (int x : map.keySet()) {
            if (map.get(x) == 1) return x;
        }
        return result;
    }
    public static int singleNumber3(int[] nums) {
        int one = 0, two = 0;
        for(int x : nums){
            one = one ^ x & ~two;
            System.out.print("one = " + Integer.toBinaryString(one));;
            two = two ^ x & ~one;
            System.out.println("  two = " + Integer.toBinaryString(two));
        }
        return one;
    }


    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
