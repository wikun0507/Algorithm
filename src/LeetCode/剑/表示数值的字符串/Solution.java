package LeetCode.剑.表示数值的字符串;

/**
 * @Author WiKunZ
 * @Date 2021/5/14-20:23
 */
public class Solution {
    public boolean isNumber(String s) {
        if(s == null || s.length() == 0){
            return false;
        }
        String str = s.trim();
        char[] chars = str.toCharArray();
        boolean hasNum = false;
        boolean hasE = false;
        boolean hasPot = false;
        boolean hasFlag = false;
        int index = 0;
        while(index<chars.length){
            if(chars[index]>='0'&&chars[index]<='9'){
                hasNum = true;
                index++;
            }else if(chars[index]=='+'||chars[index]=='-'){
                if(index != 0 && chars[index-1] != 'e' && chars[index-1] != 'E'){
                    return false;
                }
                index++;
            }else if(chars[index]=='.'){
                //.之前不能出现.或者e
                if(hasE||hasPot)
                    return false;
                hasPot = true;
                //hasNum = false;
                index++;
            }else if(chars[index]=='E'||chars[index]=='e'){
                //e之前都不能没有数字，必须有E
                if(!hasNum||hasE){
                    return false;
                }
                hasE = true;
                hasNum = false;
                index++;
            }else {
                return false;
            }
        }
        return hasNum;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isNumber("+100"));
        System.out.println(solution.isNumber("5e2"));
        System.out.println(solution.isNumber("-123"));
        System.out.println(solution.isNumber("3.1416"));
        System.out.println(solution.isNumber("-1E-16"));
        System.out.println(solution.isNumber("0123"));
        System.out.println("******************");
        System.out.println(solution.isNumber("12e"));
        System.out.println(solution.isNumber("1a3.14"));
        System.out.println(solution.isNumber("1.2.3"));
        System.out.println(solution.isNumber("+-5"));
        System.out.println(solution.isNumber("12e+5.4"));
        System.out.println(solution.isNumber("2e+5.4"));
        System.out.println(solution.isNumber("e"));
        System.out.println(solution.isNumber("2e-8.1"));
        System.out.println("******************");
        System.out.println(solution.isNumber(".1"));
        System.out.println(solution.isNumber("10e"));
        System.out.println(solution.isNumber("1.23e+1"));


    }
}
