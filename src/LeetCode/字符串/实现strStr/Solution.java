package LeetCode.字符串.实现strStr;

public class Solution {
//    public static int strStr(String haystack, String needle) {
//        int i = 0,j = 0;
//        while(i<haystack.length()&&j<needle.length()){
//            if(haystack.charAt(i)==needle.charAt(j)){
//                i++;
//                j++;
//            }else{
//                i = i - j + 1;
//                j = 0;
//            }
//            if(j==needle.length())
//                return i-j;
//        }
//        return -1;
//    }

    public static int strStr(String haystack, String needle) {
        int length = needle.length();
        int total = haystack.length() - length + 1;
        for (int start = 0; start < total; start++) {
            System.out.println(start);
            if (haystack.substring(start, start + length).equals(needle)) {
                return start;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(strStr("abcaaa","aaa"));
        int i;
        for(i = 0;i<4;i++){
            System.out.println("草");
        }
        System.out.println(i);
    }
}
