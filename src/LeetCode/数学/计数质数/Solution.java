package LeetCode.数学.计数质数;

public class Solution {
    public static int countPrimes(int n){
        boolean[] notPrimes = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            //如果是合数就不需要统计
            if (notPrimes[i]) {
                continue;
            }
            count++;
            //到这一步说明不是素数，直接让他的2倍，3倍……都标记为非负数即可
            for (int j = i; j < n; j += i) {
                notPrimes[j] = true;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        System.out.println(countPrimes(17));
        String str = "IV";
        System.out.println(str.charAt(0));
    }
}
