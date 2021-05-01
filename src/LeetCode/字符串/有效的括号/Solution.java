package LeetCode.字符串.有效的括号;

import java.util.Stack;

/**
 * @Author WiKunZ
 * @Date 2021/4/29-19:52
 */
public class Solution {
    public static boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='['||ch=='{'){
                stack.push((char)(ch+2));
            }else if (ch=='('){
                stack.push((char)(ch+1));
            }else {
                if(stack.size()==0){
                    return false;
                }//注意判空
                char tmp = stack.pop();
                if(s.charAt(i)!=tmp){
                    return false;
                }
            }
        }
        return stack.empty();//注意只有"})]"的情况
    }
    public static void main(String[] args) {
        String str1 = "{[()]}";
        String str2 = "()[]{}";
        String str3 = "(]";
        String str4 = "([)]";
        String str5 = "((";
        System.out.println(isValid(str1));
        System.out.println(isValid(str2));
        System.out.println(isValid(str3));
        System.out.println(isValid(str4));
        System.out.println(isValid(str5));
    }
}
