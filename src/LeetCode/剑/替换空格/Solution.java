package LeetCode.剑.替换空格;

/**
 * @Author WiKunZ
 * @Date 2021/5/3-11:23
 */
public class Solution {
    public static String replaceSpace(String s) {

        return s.replace(" ","%20");
    }

    public static void main(String[] args) {
        String str1 = "We are happy.";
        System.out.println(replaceSpace(str1));
    }
}
