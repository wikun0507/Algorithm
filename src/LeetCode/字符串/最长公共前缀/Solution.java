package LeetCode.字符串.最长公共前缀;

import java.util.Arrays;

public class Solution {
//    public static String longestCommonPrefix(String[] strs) {
//        if(strs.length==0){
//            return "";
//        }
//        if (strs.length==1){
//            return strs[0];
//        }
//
//        int index = 0;
//        int minLength = Math.min(strs[0].length(), strs[1].length());
//        String result = "";
//
//        while(index<minLength && strs[0].charAt(index)==strs[1].charAt(index)){
//            result +=strs[1].charAt(index);
//            index++;
//        }
//        if (strs.length>=3){
//            for(int i = 2;i<strs.length;i++){
//                String nResult = "";
//                for(int j = 0;j<Math.min(strs[i].length(),result.length());j++){
//                    if (result.charAt(j)==strs[i].charAt(j))
//                        nResult += result.charAt(j);
//                }
//                result = nResult;
//            }
//        }
//
//        return result;
//    }

//    public static String longestCommonPrefix(String[] strs) {
//        if(strs.length==0)
//            return "";
//        if (strs.length==1)
//            return strs[0];
//        String result = strs[0];
//        for (int i = 1;i<strs.length;i++){
//            int index = 0;
//            for(;index<strs[i].length()&&index<result.length();index++){
//                if (strs[i].charAt(index)!=result.charAt(index))
//                    break;
//            }
//            result = result.substring(0,index);
//            if (result.length()==0)
//                return "";
//        }
//        return result;
//    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        StringBuilder res = new StringBuilder();
        Arrays.sort(strs);
//        for(int i = 0;i<strs.length;i++){
//            System.out.println(strs[i]);
//        }
        // 字符串转数组
        char[] a = strs[0].toCharArray();
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println("\n");
        char[] b = strs[strs.length - 1].toCharArray();
        for(int i:b){
            System.out.print(i+" ");
        }
        System.out.println("\n");
        for (int i = 0; i < a.length; i++) {
            if (i < b.length && a[i] == b[i]) {
                res.append(a[i]);
            }
            else{
                break;
            }
        }
        return res.toString();

    }
    public static void main(String[] args) {
        String[] str = {"aba","ab","aaaaaaaa"};
        System.out.print(longestCommonPrefix(str));
    }
}
