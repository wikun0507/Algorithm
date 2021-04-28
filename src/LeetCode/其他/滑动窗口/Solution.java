package LeetCode.其他.滑动窗口;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static int getMax(int[] tmp, int begin, int end) {
        int max = tmp[begin];
        for (int i = begin + 1; i < end; i++) {
            max = Math.max(max, tmp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {3, -1, 5, 1, 3, 4, 6, 2, 0};
        List<Integer> result = new ArrayList<Integer>();

        int k = 4;
        for (int i = 0; i < a.length - k + 1; i++) {
            result.add(getMax(a, i, i + k));
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

}
