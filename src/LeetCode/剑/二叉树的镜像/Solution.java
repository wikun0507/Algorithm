package LeetCode.剑.二叉树的镜像;

import LeetCode.树.TreeNode;

import javax.naming.LinkRef;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Author WiKunZ
 * @Date 2021/5/28-20:50
 */
public class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null)
            return null;
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.left != null) stack.add(node.left);
            if (node.right != null) stack.add(node.right);
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
        }
        return root;
    }


    public static void main(String[] args) {

    }
}
