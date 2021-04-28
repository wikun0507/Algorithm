package LeetCode.数组.去除数组中的重复数字;

public class Solution {
    public static int removeElement(int[] nums, int val) {
        int first = 0;
        int second = 0;
        while(first<nums.length){
            if (nums[first]!=val){
                nums[second++] = nums[first++];
            }else {
                first++;
            }
        }
        return second;
    }
    public static void main(String[] args) {
        int[] a = {0,1,2,2,3,0,4,2};
        int i = removeElement(a,2);
        for(int j = 0;j<a.length;j++)
            System.out.print(a[j]+" ");
    }
}
