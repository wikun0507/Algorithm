package LeetCode.剑.对称的二叉树;

import LeetCode.树.TreeNode;

/**
 * @Author WiKunZ
 * @Date 2021/5/28-22:02
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        return dfs(root.left,root.right);
    }

    public boolean dfs(TreeNode left,TreeNode right){
        if(left==null&&right==null){
            return true;
        }
        if(left==null||right==null||left.val!=right.val){
            return false;
        }
        return dfs(left.left,right.right)&&dfs(right.left,left.right);
    }

}
