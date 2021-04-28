package LeetCode.数学.颠倒二进制位;

public class Reverse {

    public static int reverseBits(int n) {
        int result = 0;
        for(int i = 0;i<32;i++){
            result |= (n&1)<<(31-i);
            n = n >>> 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int a = 43261596;
        a = reverseBits(a);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a);
    }
}
