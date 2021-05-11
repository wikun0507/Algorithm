package LeetCode.树.叶子相似的树;

import LeetCode.树.TreeNode;

import java.util.*;

/**
 * @Author WiKunZ
 * @Date 2021/5/10-20:11
 */
public class Solution {
    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> array1 = new ArrayList<>();
        List<Integer> array2 = new ArrayList<>();
        DFS(array1,root1);
        DFS(array2,root2);
        if (array1.size() == array2.size()) {
            for (int i = 0; i < array1.size(); i++) {
                if (!array1.get(i).equals(array2.get(i))) return false;
            }
            return true;
        }
        return false;
    }

    public static void DFS(List<Integer> array, TreeNode root){
        if(root==null)
            return;
        if(root.left==null&&root.right==null){
            array.add(root.val);
            return;
        }
        DFS(array, root.left);
        DFS(array,root.right);
    }
    public static void main(String[] args) {
        TreeNode root2RRL = new TreeNode(9,null,null);
        TreeNode root2RRR = new TreeNode(8,null,null);

        TreeNode root2LL = new TreeNode(6,null,null);
        TreeNode root2LR = new TreeNode(7,null,null);
        TreeNode root2RL = new TreeNode(4,null,null);
        TreeNode root2RR = new TreeNode(2,root2RRL,root2RRR);

        TreeNode root1LRL = new TreeNode(7,null,null);
        TreeNode root1LRR = new TreeNode(4,null,null);

        TreeNode root1LL = new TreeNode(6,null,null);
        TreeNode root1LR = new TreeNode(2,root1LRL,root1LRR);
        TreeNode root1RL = new TreeNode(9,null,null);
        TreeNode root1RR = new TreeNode(8,null,null);


        TreeNode root1L = new TreeNode(5,root1LL,root1LR);
        TreeNode root1R = new TreeNode(1,root1RL,root1RR);
        TreeNode root2L = new TreeNode(5,root2LL,root2LR);
        TreeNode root2R = new TreeNode(1,root2RL,root2RR);

        TreeNode root1 = new TreeNode(3,root1L,root1R);
        TreeNode root2 = new TreeNode(3,root2L,root2R);


//        TreeNode root1 = new TreeNode(1,new TreeNode(2,null,null),null);
//        TreeNode root2 = new TreeNode(2,new TreeNode(2,null,null),null);
        System.out.println(leafSimilar(root1,root2));
    }
}
