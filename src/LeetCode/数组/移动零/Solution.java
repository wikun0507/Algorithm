package LeetCode.数组.移动零;

public class Solution {

//    public static void swap(int a,int b){
//        int tmp = a;
//        a = b;
//        b = tmp;
//    }

    public static void moveZeroes1(int[] nums) {
        int index;
        int count = 0;
        for(int i = 0;i<nums.length-count;i++){
            if(nums[i] == 0){
                index = i;
                for(int j = index+1;j<nums.length;j++){
                    if(nums[j] != 0){
                        int tmp = nums[index];
                        nums[index] = nums[j];
                        nums[j] = tmp;
                        index = j;
                    }
                }
                count++;
            }
        }
    }

    public static void moveZeroes2(int[] nums) {
        int index = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index++] = nums[i];
            }
        }
        for(;index<nums.length;index++){
            nums[index] = 0;
        }
    }

    public static void main(String[] args) {
            int[] a = {1,0,0,3,0};
            moveZeroes2(a);
            for(int num:a)
                System.out.print(num + " ");
    }
}
