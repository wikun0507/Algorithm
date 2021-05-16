package LeetCode.数组.数组中两个数的最大异或值;

import LeetCode.树.TreeNode;

/**
 * @Author WiKunZ
 * @Date 2021/5/16-16:03
 */
public class Solution {
    /**
     * 无脑暴力
     */
//    public int findMaximumXOR(int[] nums) {
//        if(nums.length==1){
//            return 0;
//        }
//        int result = 0;
//        for(int i = 0;i<nums.length;i++){
//            for(int j = i+1;j< nums.length;j++){
//                int tmp = nums[i]^nums[j];
//                result = Math.max(tmp, result);
//            }
//        }
//        return result;
//    }

    /**
     * 字典树
     */
    int depth = 30;//树的深度。
    public int findMaximumXOR(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int max = 0;
        DicTree dicTree = new DicTree(0,null,null);
        for(int i = 0;i< nums.length;i++) {
            buildDicTree(dicTree, nums[i]);
        }
        for(int i = 0;i<nums.length;i++){
            max = Math.max(max,dfs(dicTree,nums[i]));
        }
        System.out.println(max);
        return 0;
    }
    public int dfs(DicTree dicTree,int num){
        int result = 0;
        for(int i = depth;i>=0;i--){
            int bit = (num>>i)&1;
            if(bit==0){
                if(dicTree.right!=null){
                    dicTree = dicTree.right;
                    result = 2*result+1;
                }else{
                    dicTree = dicTree.left;
                    result = result*2;
                }
            }else{
                if(dicTree.left!=null){
                    dicTree = dicTree.left;
                    result = result*2+1;
                }else {
                    dicTree = dicTree.right;
                    result = 2*result;
                }
            }
        }
        return result;
    }
    public void buildDicTree(DicTree dicTree,int num){
        for(int i = depth;i>=0;i--){
            int bit = (num>>i)&1;
            if(bit==0){
                if(dicTree.left==null){
                    dicTree.left = new DicTree(bit,null,null);
                    dicTree = dicTree.left;
                }else{
                    dicTree = dicTree.left;
                }
            }else {
                if(dicTree.right==null){
                    dicTree.right = new DicTree(bit,null,null);
                    dicTree = dicTree.right;
                }else{
                    dicTree = dicTree.right;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {8,10,2};
        int[] b = {14,70,53,83,49,91,36,80,92,51,66,70};
        int[] c = {3,10,5,25,2,8};
        //System.out.println(Integer.toBinaryString(2));
        Solution solution = new Solution();
        System.out.println(solution.findMaximumXOR(a));
        System.out.println(solution.findMaximumXOR(b));
        System.out.println(solution.findMaximumXOR(c));
    }
}
