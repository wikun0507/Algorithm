package LeetCode.动态规划.停在原地的方案数;

/**
 * @Author WiKunZ
 * @Date 2021/5/13-8:33
 */
public class Solution {
    int Sstep;
    int Sposition;

    /**
     * 递归
     */
//    public int numWays(int steps, int arrLen) {
//        Sstep = steps;
//        Sposition = Math.min(steps,arrLen);
//        return dfs(0,0);
//    }
//
//    public int dfs(int step,int position){
//        if(step==Sstep){
//            return position==0?1:0;
//        }
//        int result = 0;
//        if(position<Sposition-1){
//            result += dfs(step+1,position+1);
//        }
//        if(position>0){
//            result += dfs(step+1,position-1);
//        }
//        result += dfs(step+1,position);
//        return result;
//    }

    /**
     * 动态规划
     * 从0，0开始
     */
//    public int numWays(int steps, int arrLen) {
//        final int mod = 1_000_000_007;
//        int maxLen = Math.min(steps,arrLen);
//        long[][] dp = new long[steps+1][maxLen+1];//dp[i][j]表示移动i步，走到的数组位置为j的方案数
//        dp[1][0] = 1;
//        dp[1][1] = 1;
//        for (int i = 1;i<=steps;i++){
//            for(int j = 0;j<maxLen;j++){
//                dp[i][j] += dp[i-1][j];//原地停留
//                dp[i][j] += dp[i-1][j+1];//从右边来的
//                if(j>0)
//                    dp[i][j] += dp[i-1][j-1];//从左边来的
//                dp[i][j] %= mod;
//            }
//        }
//        return (int)dp[steps][0];
//    }

    /**
     * 动态规划
     * dp[][]代表代表当前剩余操作数为 i，所在位置为 j 的所有方案数。
     * 该方式可折半步数，因为如果一直向右超过了一半的arrlen就回不来了
     * dp[step][0] = 1
     */
    public int numWays(int steps, int arrLen) {
        final int mod = 1_000_000_007;
        int maxLen = Math.min(steps/2,arrLen-1);
        long[][] map = new long[steps+1][maxLen+1];
        map[steps][0] = 1;
        for(int i = steps-1;i>=0;i--){
            int canTo = Math.min(i,maxLen);
            for(int j = 0;j<=canTo;j++){
                map[i][j] += map[i+1][j];
                if(j-1>=0) map[i][j] += map[i+1][j-1];
                if(j+1<=maxLen) map[i][j] += map[i+1][j+1];
                map[i][j] %=mod;
            }
        }
        return (int)map[0][0];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().numWays(3,2));
        System.out.println("change");
    }


}
