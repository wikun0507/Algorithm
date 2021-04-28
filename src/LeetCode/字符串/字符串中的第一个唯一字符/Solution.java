package LeetCode.字符串.字符串中的第一个唯一字符;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int firstUniqChar1(String s) {
        Map<Character,Integer> map = new HashMap<>(s.length());
        char[] newS = s.toCharArray();
        for(char i:newS){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int i = 0;i< newS.length;i++){
            if(map.get(newS[i])==1){
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqChar2(String s) {
        int[] charS = new int[26];
        char[] charN = s.toCharArray();
        for (int i = 0; i < charN.length; i++) {
            charS[charN[i] - 'a']++;
        }
        for (int i = 0; i < charN.length; i++) {
            if (charS[charN[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int tmp = firstUniqChar1("loveleetcode");
        System.out.println(tmp);
    }

}