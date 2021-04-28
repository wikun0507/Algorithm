package LeetCode.数组.合并两个有序数组;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /**
         * 三指针解决
         */
        int i = m-1;
        int j = n-1;
        int end = m+n-1;
        while(j>0){
            nums1[end--] = (i>=0&&nums1[i]>nums2[j])?nums1[i--] : nums2[j--];
        }
    }

    public static void main(String[] args) {

    }
}
