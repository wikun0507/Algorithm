package LeetCode.动态规划.目标和;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author WiKunZ
 * @Date 2021/6/7-12:20
 */
public class Solution {
    public int findTargetSumWays(int[] nums, int target) {

        return dfs(nums, target, 0, 0);
    }
    /*记忆化搜索*/
    Map<String, Integer> map = new HashMap<>();

    public int dfs(int[] nums, int target, int current, int index) {
        String key = index + "_" + current;
        if(map.containsKey(key)){
            return map.get(key);
        }
        if(index== nums.length){
            map.put(key,target==current?1:0);
            return map.get(key);
        }
        int add = dfs(nums,target,current+nums[index],index+1);
        int sub = dfs(nums,target,current-nums[index],index+1);
        map.put(key,add+sub);
        return map.get(key);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1, 1, 1, 1, 1};
        System.out.println(solution.findTargetSumWays(a, 3));
    }
}
