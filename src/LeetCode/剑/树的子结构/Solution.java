package LeetCode.剑.树的子结构;

import LeetCode.树.TreeNode;

/**
 * @Author WiKunZ
 * @Date 2021/5/22-20:35
 */
public class Solution {
    public static boolean isSubStructure(TreeNode A, TreeNode B) {
        TreeNode start = getSame(A,B);
        //System.out.println(start.val);
        if(start==null){
            return false;
        }
        return travel(start,B);
    }

    public static TreeNode getSame(TreeNode A,TreeNode B){
        if(A==null){
            return null;
        }else if(A.val == B.val){
            if(travel(A,B))
                return A;
            else
                return getSame(A.left,B)==null?getSame(A.right,B):getSame(A.left,B);
        }
        return getSame(A.left,B)==null?getSame(A.right,B):getSame(A.left,B);
    }

    public static boolean travel(TreeNode A,TreeNode B){
        if(B==null){
            return true;
        }
        if(A==null || A.val != B.val){
            return false;
        }
        return travel(A.left,B.left)&&travel(A.right,B.right);
    }

    public static void main(String[] args) {
        TreeNode ALLR = new TreeNode(9,null,null);
        TreeNode ALLL = new TreeNode(8,null,null);
        TreeNode ARR = new TreeNode(7,null,null);
        TreeNode ARL = new TreeNode(6,null,null);
        TreeNode ALR = new TreeNode(5,null,null);
        TreeNode ALL = new TreeNode(4,ALLL,ALLR);
        TreeNode AR = new TreeNode(3,ARL,ARR);
        TreeNode AL = new TreeNode(2,ALL,ALR);
        TreeNode A = new TreeNode(4,AL,AR);

        TreeNode BR = new TreeNode(9,null,null);
        TreeNode BL = new TreeNode(7,null,null);
        TreeNode B = new TreeNode(4,BL,BR);
        System.out.println(isSubStructure(A, B));
    }
}
