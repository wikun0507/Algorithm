package LeetCode.其他.汉明距离总和;

/**
 * @Author WiKunZ
 * @Date 2021/5/28-0:16
 */
public class Solution {
    public int totalHammingDistance(int[] nums) {
        int result = 0;
        for(int i = 30;i>=0;i--){       //逐位计算
            int countOne = 0;
            for(int n:nums){
                countOne += (n>>i)&1;
            }
            result += (nums.length-countOne)*countOne;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.totalHammingDistance(new int[]{4,14,2}));
    }
}
