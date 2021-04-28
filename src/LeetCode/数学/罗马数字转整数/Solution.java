package LeetCode.数学.罗马数字转整数;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);
        int sum = 0;
        int i = 0;
        while(i<s.length()){
            if((i+1)<s.length()&&map.containsKey(s.substring(i,i+2))){
                sum+= map.get(s.substring(i,i+2));
                i+=2;
            }else if(map.containsKey(s.substring(i,i+1))){
                sum+=map.get(s.substring(i,i+1));
                i++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
//        String temp = "MCMXCIV";
//        System.out.println(temp.substring(0,1));
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("III"));
    }
}
