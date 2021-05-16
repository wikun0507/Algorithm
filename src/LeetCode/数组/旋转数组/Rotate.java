package LeetCode.数组.旋转数组;

import java.util.Arrays;

public class Rotate {
//    public static void rotate(int[] nums, int k) {
//        int length = nums.length;
//        int time = k%length;
//        int i;
//        int[] result = new int[nums.length];
//        for(i=0;i<length;i++){
//            result[(time+i)%length] = nums[i];
//        }
//        for(i=0;i<length;i++)
//            nums[i] = result[i];
//    }

    //把数组中从[start，end]之间的元素两两交换,也就是反转
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }


//    public static void rotate(int[] nums, int k) {
//        int length = nums.length;
//        k %= length;
//        reverse(nums, 0, length - 1);//先反转全部的元素
//        reverse(nums, 0, k - 1);//在反转前k个元素
//        reverse(nums, k, length - 1);//接着反转剩余的
//    }





    public static void rotate2(int[] nums, int k) {
        if(nums.length==1){
            return;
        }
        k %= nums.length;
        if(k==0)
            return;
        for(int i = 0,j=nums.length-1;i<j;i++,j--){
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        for(int i = k,j=nums.length-1;i<j;i++,j--){
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        for(int i = 0,j=k-1;i<j;i++,j--){
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        int[] b = {-1,-100,3,99};
        int[] c = {1,2};
        int[] d = {1};
//        rotate(a,0);
//        reverse(a,3,5);
//        for (int i=0;i<a.length;i++){
//            System.out.print(a[i]);
//        }
        rotate2(a,3);
        rotate2(b,2);
        rotate2(c,3);

    }
}
