package LeetCode.数组.买卖股票的最佳时机;

public class Solution {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int first = 0;
        int second = 1;
        while(second<prices.length){
            int tmp = prices[second]-prices[first];
            if(prices[second]>prices[first] && tmp >profit){
                profit = tmp;
                second++;
            }else if(prices[second]<prices[first]){
                first = second;
                second++;
            }else{
                second++;
            }
        }
        return profit;

    }
    public static void main(String[] args) {
        int[] a = {7,6,5,4,3,2};
        int[] b = {7,2,5,3,1,6};
        int[] d = {1,2,3,3,4,6};
        int[] c = {2,4,1};
        System.out.println(maxProfit(a));
        System.out.println(maxProfit(b));
        System.out.println(maxProfit(c));
        System.out.println(maxProfit(d));
    }
}
