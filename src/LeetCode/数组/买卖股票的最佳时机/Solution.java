package LeetCode.数组.买卖股票的最佳时机;

public class Solution {
//    public static int maxProfitI(int[] prices) {
//        int profit = 0;
//        int first = 0;
//        int second = 1;
//        while(second<prices.length){
//            int tmp = prices[second]-prices[first];
//            if(prices[second]>prices[first] && tmp >profit){
//                profit = tmp;
//                second++;
//            }else if(prices[second]<prices[first]){
//                first = second;
//                second++;
//            }else{
//                second++;
//            }
//        }
//        return profit;
//    }
    public static int maxProfitII(int[] prices) {
            int result = 0;
            for(int i = 1;i<prices.length;i++){
                if(prices[i]>prices[i-1]){
                    result += prices[i]-prices[i-1];
                }
            }
       return result;
    }
    public static void main(String[] args) {
//        int[] a = {7,6,5,4,3,2};
//        int[] b = {7,2,5,3,1,6};
//        int[] d = {1,2,3,3,4,6};
//        int[] c = {2,4,1};
//        System.out.println(maxProfitI(a));
//        System.out.println(maxProfitI(b));
//        System.out.println(maxProfitI(c));
//        System.out.println(maxProfitI(d));

        int[] e = {7,1,5,3,6,4};
        int[] f = {1,2,3,4,5};
        int[] g = {7,6,4,3,1};
        System.out.println(maxProfitII(e));
        System.out.println(maxProfitII(f));
        System.out.println(maxProfitII(g));

    }
}
