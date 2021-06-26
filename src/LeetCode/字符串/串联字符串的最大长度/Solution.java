package LeetCode.字符串.串联字符串的最大长度;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author WiKunZ
 * @Date 2021/6/19-0:14
 */
public class Solution {
//    List<String> result = new ArrayList<>();
//    int maxLength = 0;
//    public int maxLength(List<String> arr) {
//        backTrace(arr, "", 0);
//        return maxLength;
//    }
//    public boolean check(String current,String add){
//        for (int i = 0; i < add.length(); i++) {
//            if (current.contains(add.substring(i,i+1))){
//                return false;
//            }
//        }
//        return true;
//    }
//    public boolean checkSelf(String self){
//        boolean isbool = false;
//        char[] chars = self.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            for (int j = i+1; j < chars.length; j++) {
//                if(chars[i] == chars[j]){
//                    isbool = true;
//                    return isbool;
//                }else {
//                    isbool = false;
//                }
//            }
//        }
//        return isbool;
//    }
//
//    public void backTrace(List<String> arr,String current,int currIndex){
//        if(currIndex == arr.size()){
//            return;
//        }
//        for(int i = currIndex;i< arr.size();i++){
//            if(!check(current, arr.get(i))||checkSelf(arr.get(i)))
//                backTrace(arr,current,i+1);
//            else{
//                String tmp = current;
//                current += arr.get(i);
//                maxLength = Math.max(maxLength,current.length());
////                System.out.println(current);
////                result.add(current);
//                backTrace(arr,current,i+1);
//                current = tmp;
//            }
//        }
//
//    }

    int ans = 0;

    public int maxLength(List<String> arr) {
        List<Integer> masks = new ArrayList<Integer>();
        for (String s : arr) {
            int mask = 0;
            for (int i = 0; i < s.length(); ++i) {
                int ch = s.charAt(i) - 'a';
                /* ch代表要放到二进制的第几位 */
                System.out.println(Integer.toBinaryString(ch));
                System.out.println("mask >> ch & 1  "+(mask >> ch));
                if (((mask >> ch) & 1) != 0) { // 若 mask 已有 ch，则说明 s 含有重复字母，无法构成可行解
                    mask = 0;
                    break;
                }
                mask |= 1 << ch; // 将 ch 加入 mask 中
            }
            if (mask > 0) {
                masks.add(mask);
            }
        }
        System.out.println("***********");
        for(int i = 0;i< masks.size();i++){
            System.out.println(Integer.toBinaryString(masks.get(i)));
        }
        backtrack(masks, 0, 0);
        return ans;
    }

    public void backtrack(List<Integer> masks, int pos, int mask) {
        if (pos == masks.size()) {
            ans = Math.max(ans, Integer.bitCount(mask));
            return;
        }
        if ((mask & masks.get(pos)) == 0) { // mask 和 masks[pos] 无公共元素
            backtrack(masks, pos + 1, mask | masks.get(pos));
        }
        backtrack(masks, pos + 1, mask);
    }



    public static void main(String[] args) {
        String[] str1 = {"un","iq","ue"};
        String[] str2 = {"cha","r","act","ers"};
        List<String> list = Arrays.asList(str1);
        List<String> list2 = Arrays.asList(str2);
        List<String> list3 = new ArrayList<>();
        list3.add("yy");
        list3.add("bkhwmpbiisbldzknpm");
        Solution solution = new Solution();
        System.out.println(solution.maxLength(list));
//        System.out.println(solution.maxLength(list2));
//        System.out.println(solution.maxLength(list3));
    }
}
