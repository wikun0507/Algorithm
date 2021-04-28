package LeetCode.数学.平方数之和;


import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * 超时
     * @param c
     * @return
     */
//    public static boolean judgeSquareSum(int c) {
//        if(Math.sqrt(c)==(int)Math.sqrt(c)){
//            return true;
//        }
//        Map<Integer,Integer> temp = new HashMap<>();
//        for(int i = 0;i<= Math.sqrt(c);i++){
//            temp.put(i,i*i);
//        }
//        for(int j = 0;j<temp.size();j++){
//            if (temp.containsValue(c- temp.get(j))){
//                return true;
//            }
//        }
//        return false;
//    }

    /**
     * 超时
     * @param c
     * @return
     */
//    public static boolean judgeSquareSum(int c) {
//        if(Math.sqrt(c)==(int)Math.sqrt(c)){
//            return true;
//        }
//        int count = 0;
//        for(int i = 0;i*i<c;i++){
//            count++;
//            double j = Math.sqrt(c-i*i);
//            if(j==(int)j){
//                return true;
//            }
//        }
//        System.out.println(count);
//        return false;
//    }

    public static boolean judgeSquareSum(int c) {
        if(Math.sqrt(c)==(int)Math.sqrt(c)){
            return true;
        }
        int left = 0;
        int right = (int)Math.sqrt(c);
//        int count = 0;
        while(left<=right){
            //count++;
            int temp = left*left+right*right;
            if(temp==c){
                return true;
            }else if(temp<c){
                left++;
            }else{
                right--;
            }
        }
        //System.out.println(count);
        return false;
    }

    public static void main(String[] args) {
//        System.out.println(judgeSquareSum(5));
//        System.out.println(judgeSquareSum(4));
//        System.out.println(judgeSquareSum(3));
//        System.out.println(judgeSquareSum(2));
//        System.out.println(judgeSquareSum(1));
        //System.out.println(judgeSquareSum(11));
//        System.out.println(Math.sqrt(3));
//        System.out.println(judgeSquareSum(999999999));
//        System.out.println(Math.sqrt(999999999));

    }
}
