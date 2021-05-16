package LeetCode.剑.调整数组顺序使奇数位于偶数前面;

import java.util.Arrays;

/**
 * @Author WiKunZ
 * @Date 2021/5/15-22:05
 */
public class Solution {
    public static int[] exchange(int[] nums) {
        if(nums.length==0||nums.length==1){
            return nums;
        }
        int first = 0;
        int last = nums.length-1;
        while(first<last){
            while(first<last&&nums[first]%2!=0){
                first++;
            }
            while (first<last&&nums[last]%2==0)
                last--;
            if(first>last)
                break;
            int tmp = nums[first];
            nums[first] = nums[last];
            nums[last] = tmp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {2,4,2,1};
        int[] c = {2,1};
        int[] d = {};
        int[] e = {1};
        int[] f = {1,3,5};
        int[] g = {1,3,5,6,7};
        System.out.println(Arrays.toString(exchange(a)));
        System.out.println(Arrays.toString(exchange(b)));
        System.out.println(Arrays.toString(exchange(c)));
        System.out.println(Arrays.toString(exchange(d)));
        System.out.println(Arrays.toString(exchange(e)));
        System.out.println(Arrays.toString(exchange(f)));
        System.out.println(Arrays.toString(exchange(g)));
    }

}
