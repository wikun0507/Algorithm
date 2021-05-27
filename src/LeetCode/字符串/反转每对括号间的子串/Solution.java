package LeetCode.字符串.反转每对括号间的子串;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @Author WiKunZ
 * @Date 2021/5/26-9:35
 */
public class Solution {
    /**
     * 究极臃肿
     */
//    public String reverseParentheses(String s) {
//        Stack<Character> stack = new Stack<>();
//        String str = "";
//        int index = 0;
//        int countLeft = 0;
//        while(index<s.length()){
//            Character tmp = s.charAt(index);
//            if(tmp.equals('(')){
//                countLeft++;
//                stack.push(tmp);
//                index++;
//                continue;
//            }
//            //栈中没有"(" 直接加到结果当中
//            if(countLeft==0){
//                StringBuilder sbu = new StringBuilder();
//                while(!stack.empty()){
//                    sbu.append(stack.pop());
//                }
//                str += sbu.reverse();
//                str += tmp;
//                index++;
//                continue;
//            }else{      //在这之前已经有“(”,把数据压到栈中，这里包括")"
//                stack.push(tmp);
//            }
//            //如果栈顶是")"
//            if(stack.peek().equals(')')&&countLeft>0){
//                stack.pop(); //将右括号弹出
//                StringBuilder sb = new StringBuilder();
//                while(stack.peek()!='('){
//                    sb.append(stack.pop());
//                }
//                stack.pop();//弹出'('
//                countLeft--;
//                for(int i = 0;i<sb.length();i++){
//                    stack.push(sb.charAt(i));
//                }   //重新压入
//            }
//            index++;
//        }
//        StringBuilder sbu = new StringBuilder();
//        while(!stack.empty()){
//            sbu.append(stack.pop());
//        }
//        str += sbu.reverse();
//        return str;
//    }

    /**
     * 双端队列求解
     */
    public String reverseParentheses(String s) {
        char[] chs = s.toCharArray();
        Deque<Character> d = new ArrayDeque<>();
        for(int i = 0;i<chs.length;i++){
            if(chs[i]==')'){
                StringBuilder sb = new StringBuilder();
                while(!d.isEmpty()){
                    if(d.peekLast()!='('){
                        sb.append(d.pollLast());
                    }else{
                        d.pollLast();
                        for(int j = 0;j<sb.length();j++){
                            d.addLast(sb.charAt(j));
                        }
                        break;//停止处理
                    }
                }
            }else{
                d.addLast(chs[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!d.isEmpty()) sb.append(d.pollFirst());
        return sb.toString();
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        String str1 = "(abcd)";
        String str2 = "(u(love)i)";
        String str3 = "(ed(et(oc))el)";
        String str4 = "a(bcdefghijkl(mno)p)q";
        System.out.println(s.reverseParentheses(str1));
        System.out.println(s.reverseParentheses(str2));
        System.out.println(s.reverseParentheses(str3));
        System.out.println(s.reverseParentheses(str4));
    }
}
