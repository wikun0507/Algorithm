package LeetCode.树.二叉树的堂兄弟节点;

import LeetCode.树.TreeNode;

/**
 * @Author WiKunZ
 * @Date 2021/5/17-12:13
 */
public class Solution {
    int[] parent= new int[2];
    public boolean isCousins(TreeNode root, int x, int y) {
        int depth1 = dfs(root,1,x,0);
        int depth2 = dfs(root,1,y,1);
        return depth1==depth2&&parent[0]!=parent[1];
    }
    public int dfs(TreeNode root, int depth,int target,int parentId){
        if(root==null){
            return 0;
        }else if((root.left!=null&&root.left.val==target)||(root.right!=null&&root.right.val==target)){
            parent[parentId] = root.val;
            return depth+1;
        }else{
            return dfs(root.left,depth+1,target,parentId)+dfs(root.right,depth+1,target,parentId);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        TreeNode rLL = new TreeNode(4,null,null);
//
//        TreeNode rL = new TreeNode(2,rLL,null);
//        TreeNode rR = new TreeNode(3,null,null);
//
//        TreeNode r = new TreeNode(1,rL,rR);
//
//        System.out.println(solution.isCousins(r, 4, 3));

//        TreeNode rLR = new TreeNode(4,null,null);
//        TreeNode rRR = new TreeNode(5,null,null);
//
//        TreeNode rL = new TreeNode(2,null,rLR);
//        TreeNode rR = new TreeNode(3,null,rRR);
//
//        TreeNode r = new TreeNode(1,rL,rR);

//        System.out.println(solution.isCousins(r, 5, 4));
        TreeNode rR = new TreeNode(3,null,null);
        TreeNode rL = new TreeNode(2,null,null);
        TreeNode r = new TreeNode(1,rL,rR);
        System.out.println(solution.isCousins(r,3,2));
    }
}
