package LeetCode.字符串.字符串转换整数;

public class Solution {
    public static int myAtoi(String s) {
        s = s.trim();//去掉前后的空格

        if (s.length() == 0)
            return 0;
        char[] chS = s.toCharArray();
        int length = s.length();
        int index = 0;
        int flag = 1;
        int res = 0;

        if(chS[index] == '-' || chS[index] == '+'){
            flag = (chS[index++]=='-')?-1:1;
        }
        for (; index < length; ++index) {

            int digit = s.charAt(index) - '0';

            if (digit < 0 || digit > 9)
                break;

            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10))
                return flag == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            else
                    res = res * 10 + digit;
            }

        return res*flag;
    }

    public static void main(String[] args) {
        String test = "00000+42";
//        System.out.println(myAtoi(test));
        System.out.println(myAtoi(test));
    }
}
