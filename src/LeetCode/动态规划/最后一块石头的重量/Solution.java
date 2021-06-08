package LeetCode.动态规划.最后一块石头的重量;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author WiKunZ
 * @Date 2021/6/8-10:35
 */
public class Solution {
    public static int lastStoneWeightII(int[] stones) {
        if(stones.length==1)
            return stones[0];
        List<Integer> list = new ArrayList<>();
        dps(stones,0,0,list);
        Collections.sort(list);
        System.out.println(list);
        int index = 0;
        while(list.get(index)<0){
            index++;
        }
        return list.get(index);
    }
    public static void dps(int[] stones,int index,int currentSum,List<Integer> tmp){
        if(index==stones.length){
           tmp.add(currentSum);
        }else{
            dps(stones,index+1,currentSum+stones[index],tmp);
            dps(stones,index+1,currentSum-stones[index],tmp);
        }
    }


    public static void main(String[] args) {
        int[] b = {31,26,21,33,40};
        int[] a = {2,7,4,1,8,1};
        int[] c = {1,2};
        //int[] d = {89,23,100,93,82,98,91,85,33,95,72,98,63,46,17,91,92,72,77,79,99,96,55,72,24,98,79,93,88,92};
        System.out.println(lastStoneWeightII(b));
        System.out.println(lastStoneWeightII(a));
        System.out.println(lastStoneWeightII(c));
        //System.out.println(lastStoneWeightII(d));
    }
}
