package LeetCode.剑.把数组排成最小的数;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;

/**
 * @Author WiKunZ
 * @Date 2021/6/12-11:25
 */
public class Solution {
    public static String minNumber(int[] nums) {
        StringBuilder sb = new StringBuilder();
        String[] str = new String[nums.length];
        for (int i = 0; i < str.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(str, (o1, o2) -> (o1+o2).compareTo(o2+o1));
        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(minNumber(new int[]{10, 2}));
        System.out.println(minNumber(new int[]{3,30,34,5,9}));
    }
}
