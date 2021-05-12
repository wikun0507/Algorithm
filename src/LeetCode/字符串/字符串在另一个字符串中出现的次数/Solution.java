package LeetCode.字符串.字符串在另一个字符串中出现的次数;

/**
 * @Author WiKunZ
 * @Date 2021/5/9-15:35
 */
public class Solution {
    public static int getTimes(String str1,String str2){
        int result = 0;
        str2 = str2.replace(str1,".");
        for(int i = 0;i<str2.length();i++){
            if(str2.charAt(i)=='.'){
                result++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(getTimes("bb", "abkkcbbbbabbbbbkab"));
    }
}
