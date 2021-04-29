package LeetCode.其他.汉明距离;

/**
 * @Author WiKunZ
 * @Date 2021/4/29-10:31
 */
public class Solution {
    public static int hammingDistance(int x, int y) {
        int count = 0;
        for(int i = 0;i<32;i++){
            count +=((x>>i)&1)^((y>>i)&1);
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));
    }
}
