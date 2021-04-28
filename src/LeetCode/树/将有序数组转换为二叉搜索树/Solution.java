package LeetCode.树.将有序数组转换为二叉搜索树;

import LeetCode.树.TreeNode;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length==0)
            return null;
        return sortedArrayToBST(nums,0,nums.length-1 );
    }
    public TreeNode sortedArrayToBST(int[] nums,int start,int end) {
        if (start>end)
            return null;
        int middle = (start+end)>>1;
        TreeNode root = new TreeNode(nums[middle]);
        root.right = sortedArrayToBST(nums,0,middle-1);
        root.left = sortedArrayToBST(nums,middle+1,end);
        return root;
    }
    public static void main(String[] args) {

    }
}
