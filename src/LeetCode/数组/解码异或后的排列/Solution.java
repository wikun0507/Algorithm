package LeetCode.数组.解码异或后的排列;

/**
 * @Author WiKunZ
 * @Date 2021/5/11-11:03
 */
public class Solution {
    public int[] decode(int[] code) {
        if(code.length%2!=0){
            return null;
        }
        int[] result = new int[code.length+1];
        int other = 0;
        int total = 0;
        for(int i = 1;i<=code.length+1;i++){
            total ^= i;
        }
        for(int i = 1;i<code.length;i+=2){
            other ^=code[i];
        }
        int first = total^other;
        result[0] = first;
        for(int i = 1;i<result.length;i++){
            result[i] = code[i-1]^result[i-1];
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
