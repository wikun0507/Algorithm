package LeetCode.树.对称二叉树;

import LeetCode.树.TreeNode;

public class Solution {
//    public static boolean isSymmetric(TreeNode root) {
//        if (root==null||root.left==null||root.right==null)
//            return true;
//        Queue<TreeNode> queueL = new LinkedList<TreeNode>();
//        Queue<TreeNode> queueR = new LinkedList<TreeNode>();
//        queueL.offer(root);
//        queueR.offer(root);
//        while(!queueL.isEmpty()&&!queueR.isEmpty()){
//            TreeNode left = queueL.poll();
//            TreeNode right = queueR.poll();
//            if(left==null&&right==null)
//               continue;
//            if(left == null ^ right == null)
//                return false;
//            if(left.val!=right.val)
//                return false;
//            queueL.offer(left.left);
//            queueL.offer(left.right);
//            queueR.offer(right.right);
//            queueR.offer(right.left);
//        }
//        return true;
//    }
    public static boolean isSymmetric(TreeNode root){
        if(root==null)
            return true;
        return isSymmetric(root.left,root.right);
    }
    public static boolean isSymmetric(TreeNode left,TreeNode right){
        if(left==null&&right==null)
            return true;
        if(left==null||right==null||left.val!=right.val)
            return false;
        return isSymmetric(left.left,right.right)&&isSymmetric(left.right,right.left);
    }

    public static void main(String[] args) {
        TreeNode r1RR = new TreeNode(3,null,null);
        TreeNode r1LR = new TreeNode(3,null,null);
        TreeNode r1L = new TreeNode(2,null,r1LR);
        TreeNode r1R = new TreeNode(2,null,r1RR);
        TreeNode root = new TreeNode(1,r1L,r1R);
//        TreeNode root = new TreeNode();
//        root = root.arrayToBTree(new int[]{1,2,2,3,4,4,3});
        System.out.println(isSymmetric(root));
    }
}
