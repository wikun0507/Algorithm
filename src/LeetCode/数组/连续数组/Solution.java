package LeetCode.数组.连续数组;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author WiKunZ
 * @Date 2021/6/3-9:19
 * 给定一个二进制数组 nums , 找到含有相同数量的 0 和 1 的最长连续子数组，并返回该子数组的长度。
 * 0 0 1 0 1 1  0 0 1 1 0
 */

public class Solution {
    public static int findMaxLength(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int result = 0;
        map.put(0,-1);
        for(int i = 0;i< nums.length;i++){
            if(nums[i]==0){
                sum--;
            }else{
                sum++;
            }
            if(map.containsKey(sum)){
                result = Math.max(result,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a = {0,0,1,0,1,1,0,1};
        int[] b = {0,1,0,0};
        System.out.println(findMaxLength(a));
        System.out.println(findMaxLength(b));
    }
}

