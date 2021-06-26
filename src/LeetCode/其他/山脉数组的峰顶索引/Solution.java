package LeetCode.其他.山脉数组的峰顶索引;

/**
 * @Author WiKunZ
 * @Date 2021/6/15-11:35
 */
public class Solution {
    public static int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while(left<right-2){
            int mid = left+(right-left)/2;
            if(arr[mid]>arr[mid+1]){
                right = mid+1;
            }else{
                left = mid;
            }
        }
        return (left+right)/2;
    }


    public static void main(String[] args) {
        int[] a = {24,69,100,99,79,78,67,36,26,19};
        int[] b = {3,4,5,1};
        int[] c = {0,10,5,2};
        int[] d = {0,2,1,0};
        int[] e = {0,1,0};
        System.out.println(peakIndexInMountainArray(a));
        System.out.println(peakIndexInMountainArray(b));
        System.out.println(peakIndexInMountainArray(c));
        System.out.println(peakIndexInMountainArray(d));
        System.out.println(peakIndexInMountainArray(e));
    }
}
