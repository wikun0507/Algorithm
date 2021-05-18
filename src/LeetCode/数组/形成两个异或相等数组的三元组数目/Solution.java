package LeetCode.数组.形成两个异或相等数组的三元组数目;

import java.util.Arrays;

/**
 * @Author WiKunZ
 * @Date 2021/5/18-9:42
 */
public class Solution {
    /**
     * 捞仔解法
     */
//    public int countTriplets(int[] arr) {
//        if(arr.length==1){
//            return 0;
//        }
//        int[] prefix = new int[arr.length];   //前缀异或数组
//        int result = 0;
//        prefix[0] = arr[0];
//        for(int i = 1;i< arr.length;i++){
//            prefix[i] = prefix[i-1]^arr[i];
//        }
//        //System.out.println(Arrays.toString(prefix));
//        for(int i = 0;i < prefix.length;i++){
//            for(int j = i+1;j< prefix.length;j++){
//                int tmp;
//                if(i==0) tmp = prefix[j-1];
//                else tmp = prefix[j-1]^prefix[i-1];
//                //System.out.println("i: "+i+"-- j:"+j+": "+tmp);
//                for(int k = j;k< prefix.length;k++){
//                    int tmp2 = prefix[k]^prefix[j-1];
//                    //System.out.println("***"+"j: "+j+"-- k:"+k+": "+tmp2);
//                    if(tmp==tmp2)   result++;
//                }
//            }
//        }
//        return result;
//    }

    public int countTriplets(int[] arr) {
        if(arr.length==1){
            return 0;
        }
        int result = 0;
        for(int i = 0;i< arr.length;i++){
            int tmp = arr[i];
            for(int k = i+1;k< arr.length;k++){
                tmp ^=arr[k];
                if(tmp==0) result +=k-i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {2,3,1,6,7};
        int[] b = {1,1,1,1,1};
        int[] c = {2,3};
        int[] d = {1,3,5,7,9};
        int[] e = {7,11,12,9,5,2,7,17,22};
        System.out.println(solution.countTriplets(a));
        System.out.println(solution.countTriplets(b));
        System.out.println(solution.countTriplets(c));
        System.out.println(solution.countTriplets(d));
        System.out.println(solution.countTriplets(e));
    }
}
