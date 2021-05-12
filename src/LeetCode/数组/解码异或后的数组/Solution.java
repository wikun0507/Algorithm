package LeetCode.数组.解码异或后的数组;

import java.util.Arrays;

/**
 * @Author WiKunZ
 * @Date 2021/5/6-16:02
 */
public class Solution {
    /**
     *方式1：前缀和方式
     */
    public static int[] decode(int[] encoded, int first) {
        if (encoded.length==0){
            return null;
        }
        int[] result = new int[encoded.length+1];
        result[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            first ^= encoded[i];
            result[i+1] = first;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {6,2,7,3};
        System.out.println(Arrays.toString(decode(a,1)));
        System.out.println(Arrays.toString(decode(b,4)));
    }
}
