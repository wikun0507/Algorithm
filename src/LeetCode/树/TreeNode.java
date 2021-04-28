package LeetCode.树;

import java.util.*;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode arrayToBTree(int[] arrs) {
        if (arrs == null || arrs.length == 0) {
            return new TreeNode();
        }

        List<TreeNode> nodes = new ArrayList<>(arrs.length);
        for (int obj : arrs) {
            TreeNode treeNode = new TreeNode();
            treeNode.val = obj;
            nodes.add(treeNode);
        }

        for (int i = 0; i < arrs.length/2 - 1; i++) {
            TreeNode node = nodes.get(i);
            node.left = nodes.get(i*2 + 1);
            node.right = nodes.get(i*2 + 2);
        }
        // 只有当总节点数是奇数时，最后一个父节点才有右子节点
        int lastPNodeIndex = arrs.length/2 - 1;
        TreeNode lastPNode = nodes.get(lastPNodeIndex);
        lastPNode.left = nodes.get(lastPNodeIndex*2 + 1);
        if (arrs.length%2 != 0) {
            lastPNode.right = nodes.get(lastPNodeIndex*2 + 2);
        }

        return nodes.get(0);
    }

    /**
     * 中序遍历首先遍历左子树，然后访问根结点，最后遍历右子树
     * 迭代实现:先将左子树全部放到栈中
     * @param root
     * @return
     */
    public List<Integer> in0rder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        while(root!=null||!stack.empty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            list.add(root.val);
            root = root.right;
        }
        return list;
    }
    /**
     * 前序遍历二叉树迭代实现
     */
    public List<Integer> pre0rder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        stack.push(root);
        while(!stack.empty()){
            root = stack.pop();
            list.add(root.val);
            if (root.right!=null) {
                stack.push(root.right);
            }
            if(root.left!=null) {
                stack.push(root.left);
            }
        }
        return list;
    }



 }