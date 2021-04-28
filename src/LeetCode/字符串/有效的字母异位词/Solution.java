package LeetCode.字符串.有效的字母异位词;

import java.util.Arrays;

public class Solution {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int length = s.length();
        char[] chS = s.toCharArray();
        char[] chT = t.toCharArray();

        Arrays.sort(chS);
        Arrays.sort(chT);

        return Arrays.equals(chS,chT);
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("abc","def"));
    }
}
