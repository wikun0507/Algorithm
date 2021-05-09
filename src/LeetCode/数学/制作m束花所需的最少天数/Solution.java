package LeetCode.数学.制作m束花所需的最少天数;

import java.util.Arrays;

/**
 * @Author WiKunZ
 * @Date 2021/5/9-10:41
 */
public class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k>bloomDay.length)
            return -1;
        int left = bloomDay[0];
        int right = bloomDay[0];
        for(int i = 1;i< bloomDay.length;i++){
            left = Math.min(left,bloomDay[i]);
            right = Math.max(right,bloomDay[i]);
        }
        while(left<right){
            int mid = (left+right)/2;
            if(check(bloomDay,mid,m,k)){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return right;
    }

    public boolean check(int[] day,int date,int m,int k){
        int flower = 0;//花
        int sum = 0;//花束
        for(int i = 0;i<day.length;i++){
            if(day[i]<=date){
                flower++;
            }else{
                flower = 0;
            }
            if(flower==k){
                flower = 0;
                sum++;
            }
            if(sum==m)
                return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int[] day1 = {1,10,3,10,2};
        int[] day2 = {1,10,3,10,2};
        int[] day3 = {7,7,7,7,12,7,7};
        int[] day4 = {1000000000,1000000000};
        int[] day5 = {1,10,2,9,3,8,4,7,5,6};
        Solution solution = new Solution();
//        System.out.println(solution.check(day1,3,3,1));
//        System.out.println(solution.check(day3,12,2,3));
        System.out.println(solution.minDays(day1,3,1));
        System.out.println(solution.minDays(day2,3,2));
        System.out.println(solution.minDays(day3,2,3));
        System.out.println(solution.minDays(day4,1,1));
        System.out.println(solution.minDays(day5,4,2));

    }
}
