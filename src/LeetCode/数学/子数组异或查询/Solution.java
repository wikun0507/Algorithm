package LeetCode.数学.子数组异或查询;

/**
 * @Author WiKunZ
 * @Date 2021/5/12-9:56
 * 思路：求出arr数组的前缀异或结果保存到一个数组prefix里面，如：0 0^1 0^1^2 0^1^2^3...
 * 然后想求哪一段就将prefix[endIndex]^prefix[startIndex-1]就可以实现求局部异或结果
 * 如endIndex:3 startIndex:1     则目的结果是1^2^3
 * 而prefix[3]=0^1^2^3   prefix[1-1]=prefix[0]=0
 * prefix[3]^prefix[0] = 1^2^3
 */
public class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefix = new int[arr.length];
        int[] result = new int[queries.length];
        prefix[0] = arr[0];
        for(int i = 1;i< prefix.length;i++){
            prefix[i] = arr[i]^prefix[i-1];
        }
        for(int i = 0;i< result.length;i++){
            if(queries[i][0]==0){
                result[i] = prefix[queries[i][1]];
            }else{
                result[i] = prefix[queries[i][1]]^prefix[queries[i][0]-1];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(-5));
        System.out.println(Integer.toBinaryString(5));
        System.out.println(4&-4);
    }
}
