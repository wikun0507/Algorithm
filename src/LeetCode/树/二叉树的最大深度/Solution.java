package LeetCode.树.二叉树的最大深度;

import LeetCode.树.TreeNode;

public class Solution {
    public static int maxDepth(TreeNode root) {
        return root==null?0:Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }

//    public static int maxDepth(TreeNode root) {
//        if (root == null)
//            return 0;
//        //创建一个队列
//        Deque<TreeNode> deque = new LinkedList<>();
//        deque.push(root);
//        int count = 0;
//        while (!deque.isEmpty()) {
//            //每一层的个数
//            int size = deque.size();    //队列中数据的个数1-
//            while (size-- > 0) {
//                TreeNode cur = deque.pop();
//                if (cur.left != null)
//                    deque.addLast(cur.left);
//                if (cur.right != null)
//                    deque.addLast(cur.right);
//            }
//            count++;
//        }
//        return count;
//    }

    public static void main(String[] args) {
//        TreeNode r1RR = new TreeNode(7,null,null);
//        TreeNode r1RL = new TreeNode(15,null,null);
//        TreeNode r1L = new TreeNode(9,null,null);
//        TreeNode r1R = new TreeNode(20,r1RL,r1RR);
//        TreeNode root = new TreeNode(3,r1L,r1R);
        TreeNode root = new TreeNode();
        root = root.arrayToBTree(new int[] {1,2,3,4});
        System.out.println(maxDepth(root));
    }
}
