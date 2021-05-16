package LeetCode.数学.整数转罗马数字;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author WiKunZ
 * @Date 2021/5/14-10:00
 */
public class Solution {
    /**
     * 臃肿解法↓
     */
//    public String intToRoman(int num) {
//        StringBuilder result = new StringBuilder();
//        int i = 1000;
//        while(i!=0){
//            int tmp = num / i;  //获取每一位的数
//            switch (i){
//                case 1000:
//                    for(int j = 0;j<tmp;j++)
//                        result.append("M");
//                    num -= tmp*i;   //999
//                    i /= 10;    //100
//                    break;
//                case 100:
//                    if(tmp>4&&tmp<9){
//                        result.append("D");
//                        for(int j = 0;j<tmp-5;j++){
//                            result.append("C");
//                        }
//                    }else if(tmp<4){
//                        for(int j = 0;j<tmp;j++){
//                            result.append("C");
//                        }
//                    }else if(tmp==9)
//                        result.append("CM");
//                    else    result.append("CD");
//                    num -= tmp*i;   //99
//                    i /= 10;    //10
//                    break;
//                case 10:
//                    if(tmp>4&&tmp<9){
//                        result.append("L");
//                        for(int j = 0;j<tmp-5;j++){
//                            result.append("X");
//                        }
//                    }else if(tmp<4){
//                        for(int j = 0;j<tmp;j++){
//                            result.append("X");
//                        }
//                    }else if(tmp==9)
//                        result.append("XC");
//                    else    result.append("XL");
//                    num -= tmp*i;   //9
//                    i /= 10;    //1
//                    break;
//                case 1:
//                    if(tmp>4&&tmp<9){
//                        result.append("V");
//                        for(int j = 0;j<tmp-5;j++){
//                            result.append("I");
//                        }
//                    }else if(tmp<4){
//                        for(int j = 0;j<tmp;j++){
//                            result.append("I");
//                        }
//                    }else if(tmp==9)
//                        result.append("IX");
//                    else    result.append("IV");
//                    num -= tmp*i;   //9
//                    i /= 10;    //1
//                    break;
//            }
//        }
//        return result.toString();
//    }

    /**
     * 贪心算法
     */
    public String intToRoman(int num) {
        String[] stringS= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] numS = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<numS.length;i++){
            while(num>=numS[i]){
                result.append(stringS[i]);
                num -= numS[i];
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().intToRoman(3999));
        System.out.println(new Solution().intToRoman(3));
        System.out.println(new Solution().intToRoman(4));
        System.out.println(new Solution().intToRoman(9));
        System.out.println(new Solution().intToRoman(58));
        System.out.println(new Solution().intToRoman(1994));
        System.out.println(new Solution().intToRoman(1));
    }

}
