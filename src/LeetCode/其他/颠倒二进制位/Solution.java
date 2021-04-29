package LeetCode.其他.颠倒二进制位;

/**
 * @Author WiKunZ
 * @Date 2021/4/29-10:37
 */
public class Solution {
    public static int reverseBits(int n) {
//        System.out.println(Integer.toBinaryString(n));
        n = (n>>>16)|(n<<16);
        n = ((n&0xFF00FF00)>>>8)|((n&0x00FF00FF)<<8);
        n = ((n&0xF0F0F0F0)>>>4)|((n&0x0F0F0F0F)<<4);
        n = ((n&0xCCCCCCCC)>>>2)|((n&0x33333333)<<2);
        n = ((n&0xAAAAAAAA)>>>1)|((n&0x55553333)<<1);
//        System.out.println(Integer.toBinaryString(n));
        return n;
    }
    public static void main(String[] args) {
        System.out.println(reverseBits(43261596));
    }
}
