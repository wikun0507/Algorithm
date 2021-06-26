package LeetCode.递归.二进制手表;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author WiKunZ
 * @Date 2021/6/21-23:47
 */
public class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        for(int i = 0;i<12;i++){
            for(int j = 0;j<60;j++){
                if(Integer.bitCount(i)+Integer.bitCount(j)==turnedOn){
                    result.add(i+":"+((j>=10)?String.valueOf(j):("0"+j)));
                }
            }
        }
        return result;
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.readBinaryWatch(2));
    }
}
