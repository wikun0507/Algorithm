package LeetCode.字符串.位1的个数;

public class Solution {
    public static int hammingWeight(int n) {

//        String str = Integer.toBinaryString(n);
//        System.out.println(str);
//        int count = 0;
//        int index = 0;
//        while(index<str.length()){
//            if(str.charAt(index)=='1'){
//                count++;
//                index++;
//                continue;
//            }
//            index++;
//        }

        int count = 0;
        for(int i = 0 ;i<32;i++){
            count += (n>>>i)&1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(hammingWeight(0b11111111111111111111111111111101));
        System.out.println(hammingWeight(0b00000000000000000000000010000000));
        System.out.println(hammingWeight(0b00000000000000000000000000001011));
    }
}
