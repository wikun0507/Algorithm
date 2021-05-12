package LeetCode.数组.树状数组;

import java.util.Arrays;

/**
 * @Author WiKunZ
 * @Date 2021/5/12-11:06
 */
public class TreeArray {
    int[] tree;
    int lowbit(int x) {
        return x & -x;
    }
    int query(int x) {
        int ans = 0;
        for (int i = x; i > 0; i -= lowbit(i)){
            System.out.println("tree["+i+"] = "+tree[i]);
            ans += tree[i];
        }
        return ans;
    }
    void add(int x, int u) {
        //System.out.print("i的变化为:");
        for (int i = x; i <= n; i += lowbit(i)){
            System.out.print(i+" ");
            System.out.print("lowbit(i)= "+lowbit(i)+" ");
            tree[i] += u;
        }
        //System.out.println(Arrays.toString(tree));
    }

    int[] nums;
    int n;
    public TreeArray(int[] _nums) {
        nums = _nums;
        n = nums.length;
        tree = new int[n + 1];
        System.out.println("构建树状数组↓");
        for (int i = 0; i < n; i++){
            add(i + 1, nums[i]);
        }
        System.out.println("树状数组的最终结果↓");
        System.out.println(Arrays.toString(tree));
    }

    public void update(int i, int val) {
        add(i + 1, val - nums[i]);
        nums[i] = val;
    }

    public int sumRange(int l, int r) {
        return query(r + 1) - query(l);
    }

    public static void main(String[] args) {
//        TreeArray treeArray = new TreeArray(new int[]{1,2,3,4,5,6});
//        System.out.println("n="+treeArray.n);
//        System.out.println(treeArray.sumRange(1,5));
//        treeArray.update(2,4);
//        System.out.println(Arrays.toString(treeArray.tree));


    }

}
