package LeetCode.剑.数组中重复的数字_03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author WiKunZ
 * @Date 2021/5/1-22:25
 */
public class Solution {
    public static int findRepeatNumber(int[] nums) {
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int i = 0;i<nums.length;i++){
//            if(!map.containsKey(nums[i])){
//                map.put(nums[i],1);
//            }else if(map.containsKey(nums[i])){
//                return nums[i];
//            }
//        }
//        return -1;
        /**
         * HashSet方式
         */
        Set<Integer> dic = new HashSet<>();
        for(int num : nums) {
            if(dic.contains(num)) return num;
            dic.add(num);
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] a = {2, 3, 1, 0, 2, 5, 3};
        int[] b = {0, 1, 2, 3, 4, 11, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println(findRepeatNumber(a));
        System.out.println(findRepeatNumber(b));
    }
}
