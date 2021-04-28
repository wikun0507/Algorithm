package LeetCode.数学.FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> fizzBuzz(int n) {
        List<String> result  = new ArrayList<>();
        for(int i = 1;i<=n;i++) {
//            String temp = "";
//            if(i%3==0){
//                temp+="Fizz";
//            }
//            if(i%5==0){
//                temp+="Buzz";
//            }
//            if(!temp.equals("")){
//                result.add(temp);
//            }else{
//                result.add(i+"");
//            }

            if (i % 15 == 0) {
                result.add("FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }
}
