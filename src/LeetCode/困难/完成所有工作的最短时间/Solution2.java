package LeetCode.困难.完成所有工作的最短时间;

import java.util.Arrays;

/**
 * @Author WiKunZ
 * @Date 2021/5/8-11:49
 */
public class Solution2 {
    int[] jobs;
    int n, k;
    int ans = 0x3f3f3f3f;
    public int minimumTimeRequired(int[] _jobs, int _k) {
        jobs = _jobs;
        n = jobs.length;
        k = _k;
        int[] sum = new int[k];
        dfs(0, sum, 0);
        return ans;
    }
    /**
     * u   : 当前处理到那个 job
     * sum : 工人的分配情况          例如：sum[0] = x 代表 0 号工人工作量为 x
     * max : 当前的「最大工作时间」
     */
    void dfs(int u, int[] sum, int max) {
        if (max >= ans) return;
        if (u == n) {
            System.out.println("我要回溯了！\n");
            ans = max;
            return;
        }
        for (int i = 0; i < k; i++) {
            sum[i] += jobs[u];
            System.out.println("当前的Jobs："+jobs[u]+" 当前的工人"+i);
            System.out.println(Arrays.toString(sum));
            dfs(u + 1, sum, Math.max(sum[i], max));
            sum[i] -= jobs[u];
        }
    }
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        //int[] a = {254,256,256,254,251,256,254,253,255,251,251,255};
        int[] b ={1,2,4,7,8};
        //System.out.println(solution.minimumTimeRequired(a,10));
        System.out.println(solution.minimumTimeRequired(b,2));
    }
}
