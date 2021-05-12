package LeetCode.数学.子数组异或查询;

import java.util.Arrays;

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
    /**
     * 前缀和方式
     */
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

    /**
     * 树状数组方式
     */
    public static int[] xorQueries2(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        TreeNum treeNum = new TreeNum(arr);
        for(int i = 0;i< result.length;i++){
            result[i] = treeNum.xorRange(queries[i][0],queries[i][1]);
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr = {1,3,4,8};
        int[][] queries = {{0,1},{1,2},{0,3},{3,3}};
        System.out.println(Arrays.toString(xorQueries2(arr,queries)));
    }
}

class TreeNum{
    int[] num;
    int[] tree;
    int n;
    public int lowbit(int i){
        return i&-i;
    }
    public TreeNum(int[] num){
        this.num = num;
        this.tree = new int[num.length+1];
        this.n = num.length;
        for(int i = 0;i<n;i++){
            xor(i+1,num[i]);
        }
    }
    public void xor(int index,int val){
        for(int i = index;i<=n;i+=lowbit(i)){
            tree[i] ^=val;
        }
    }
    public int query(int index){
        int result = 0;
        for(int i = index;i>0;i-=lowbit(i)){
            result ^= tree[i];
        }
        return result;
    }
    public int xorRange(int start,int end){
        return query(end+1)^query(start);
    }
}
