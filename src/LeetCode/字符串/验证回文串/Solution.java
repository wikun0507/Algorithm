package LeetCode.字符串.验证回文串;

public class Solution {
    public static boolean isPalindrome(String s) {
        if(s.equals(""))
            return true;
        int left = 0;
        int right = s.length()-1;
        char[] chS = s.toCharArray();
        for(char ch:chS){
            System.out.print(ch);
        }
        while(left<right){
            while (left<right&&!Character.isLetterOrDigit(chS[left]))
                left++;
            while(left<right&&!Character.isLetterOrDigit(chS[right]))
                right--;
            if(Character.toLowerCase(chS[left]) != Character.toLowerCase(chS[right]))
                return false;
            left++;
            right--;
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("Marge, let's \"[went].\" I await {news} telegram."));
    }
}
