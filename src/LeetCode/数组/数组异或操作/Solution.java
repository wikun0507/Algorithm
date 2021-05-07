package LeetCode.数组.数组异或操作;

/**
 * @Author WiKunZ
 * @Date 2021/5/7-10:19
 *
 * 数组 nums 定义为：nums[i] = start + 2*i（下标从 0 开始）且 n == nums.length 。
 *
 * 请返回 nums 中所有元素按位异或（XOR）后得到的结果。
 *
 */
public class Solution {
    public static int xorOperation(int n, int start) {
        if(n==1)
            return start;
        int[] array = new int[n];
        int result = 0;
        for(int i = 0;i<n;i++){
            array[i] = start+2*i;
            result ^=array[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(xorOperation(5,0));
        System.out.println(xorOperation(4,3));
        System.out.println(xorOperation(1,7));
        System.out.println(xorOperation(10,5));
        System.out.println(xorOperation(2,1));
    }

}
