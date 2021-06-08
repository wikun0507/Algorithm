package LeetCode.树.二叉树层序遍历;

import LeetCode.树.TreeNode;
import LeetCode.链表.ListNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    //    public List<List<Integer>> levelOrder(TreeNode root) {
//        if(root==null)
//            return new ArrayList<>();
//        List<List<Integer>> result = new ArrayList<>();
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while(!queue.isEmpty()){
//            int level = queue.size();//当前层数的节点数量
//            List<Integer> tmp = new ArrayList<>();
//            for(int i = 0;i<level;i++){
//                TreeNode treeNode = queue.poll();
//                tmp.add(treeNode.val);
//                if(treeNode.left!=null)
//                    queue.offer(treeNode.left);
//                if(treeNode.right!=null)
//                    queue.offer(treeNode.right);
//            }
//            result.add(tmp);
//        }
//        return result;
//    }
    public int[] levelOrder(TreeNode root) {
        if(root==null)
            return new int[0];
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty()){
            TreeNode tmp = qu.poll();
            list.add(tmp.val);
            if (tmp.left!=null)
                qu.add(tmp.left);
            if (tmp.right!=null)
                qu.add(tmp.right);
        }
        int[] result = new int[list.size()];
        for(int i = 0;i< result.length;i++){
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
