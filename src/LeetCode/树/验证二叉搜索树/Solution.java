package LeetCode.树.验证二叉搜索树;

import LeetCode.树.TreeNode;

public class Solution {

    public static boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        if (root == null)
            return true;
        //每个节点如果超过这个范围，直接返回false
        if (root.val >= maxVal || root.val <= minVal)
            return false;
        //这里再分别以左右两个子节点分别判断，
        //左子树范围的最小值是minVal，最大值是当前节点的值，也就是root的值，因为左子树的值要比当前节点小
        //右子数范围的最大值是maxVal，最小值是当前节点的值，也就是root的值，因为右子树的值要比当前节点大
        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
    }


    public static void inorderHelper(TreeNode root){
        if(root != null){
            inorderHelper(root.left);
            System.out.println(root.val);
            inorderHelper(root.right);
        }
    }
    public static int fib(int n) {
        if(n==0) {
            return 0;
        }
        if(0<n&&n<=2) {
            return 1;
        }
        if(n>0) {
            return fib(n-1)+fib(n-2);
        }
        return 0;
    }
    public int fib2(int n) {
        if(n==0)
            return 0;
        int[] a = new int[n+1];
        a[0] = 0;
        a[1] = 1;
        for(int i = 2;i<=n;i++){
            a[i] = a[i-1]+a[i-2];
            a[i] %=1000000007;
        }
        return a[n];
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root = root.arrayToBTree(new int[] {10,5,15,11,10});
        //inorderHelper(root);
//        System.out.println(isValidBST(root));
        System.out.println(fib(44));
        System.out.println(fib(44));

    }
}
