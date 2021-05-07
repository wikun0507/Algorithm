package LeetCode.剑.旋转数组的最小数字;

/**
 * @Author WiKunZ
 * @Date 2021/5/7-11:31
 */
public class Solution {
    public static int minArray(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (numbers[m] > numbers[j]) i = m + 1;
            else if (numbers[m] < numbers[j]) j = m;
            else j--;
        }
        return numbers[i];
    }

    public static void main(String[] args) {
        System.out.println(minArray(new int[]{5,0,1,2,3,4}));
        System.out.println(minArray(new int[]{3,4,5,1,2}));
        System.out.println(minArray(new int[]{5,0,1,2,3,4}));
        System.out.println(minArray(new int[]{2,2,2,0,1}));
        System.out.println(minArray(new int[]{10,10,10,10,1}));

    }
}
