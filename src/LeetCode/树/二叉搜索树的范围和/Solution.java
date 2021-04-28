package LeetCode.树.二叉搜索树的范围和;

import LeetCode.树.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author ZWG
 */
public class Solution {
    /**
     * 递归方法
     * @param args
     */
//    public static int rangeSumBST(TreeNode root, int low, int high) {
//
//        if (root == null) {
//            return 0;
//        }
//        if (root.val > high) {
//            return rangeSumBST(root.left, low, high);
//        }
//        if (root.val < low) {
//            return rangeSumBST(root.right, low, high);
//        }
//        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
//
//    }

    /**
     * 迭代方法
     */
    public static int rangeSumBST(TreeNode root, int low, int high) {
        int ans = 0;
        Deque<TreeNode> d = new ArrayDeque<>();
        while (root != null || !d.isEmpty()) {
            while (root != null) {
                d.addLast(root);
                root = root.left;
            }
            root = d.pollLast();
            if (low <= root.val && root.val <= high) {
                ans += root.val;
            }
            root = root.right;
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode rLLR = new TreeNode(4,null,null);
        TreeNode rRR = new TreeNode(18,null,null);
        TreeNode rLR = new TreeNode(7,null,null);
        TreeNode rLL = new TreeNode(3,null,rLLR);
        TreeNode rR = new TreeNode(15,null,rRR);
        TreeNode rL = new TreeNode(5,rLL,rLR);
        TreeNode root = new TreeNode(10,rL,rR);

//        TreeNode rLRL1 = new TreeNode(6,null,null);
//        TreeNode rLLL1 = new TreeNode(1,null,null);
//
//        TreeNode rRL1 = new TreeNode(13,null,null);
//        TreeNode rRR1 = new TreeNode(18,null,null);
//
//        TreeNode rLR1 = new TreeNode(7,rLRL1,null);
//        TreeNode rLL1 = new TreeNode(3,rLLL1,null);
//
//        TreeNode rR1 = new TreeNode(15,rRL1,rRR1);
//        TreeNode rL1 = new TreeNode(5,rLL1,rLR1);
//
//        TreeNode root1 = new TreeNode(10,rL1,rR1);

//        System.out.println(rangeSumBST(root,7,15));

        System.out.println(rangeSumBST(root,7,15));


        System.out.println(root.in0rder(root));
        System.out.println(root.pre0rder(root));
    }



}
