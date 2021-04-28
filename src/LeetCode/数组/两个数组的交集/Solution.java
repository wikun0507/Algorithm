package LeetCode.数组.两个数组的交集;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
//    public static int[] getSmall(int[] nums1,int[] nums2){
//        return nums1.length<=nums2.length?nums1:nums2;
//    }
//
//    public static int[] getBig(int[] nums1,int[] nums2){
//        return nums1.length>nums2.length?nums1:nums2;
//    }
//    public static int[] intersect1(int[] nums1, int[] nums2) {
//        int[] n1 = getSmall(nums1,nums2);
//        int[] n2 = getBig(nums1,nums2);
//        List<Integer> result = new ArrayList<Integer>();
//
//        for(int i=0;i<n1.length;i++){
//            for(int j=0;j<n2.length;j++){
//                if(n1[i] == n2[j]){
//                    System.out.println("n1["+i+"]:"+n1[i]+" n2["+j+"]:"+n2[j]);
//                    n2[j] = '丶';
//                    result.add(n1[i]);
//                    break;
//                }
//            }
//        }
//        return result.stream().mapToInt(Integer::valueOf).toArray();
//    }

    public static int[] intersect2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0,j = 0;i<nums1.length && j <nums2.length;){
            if(nums1[i]<nums2[j]){
                i++;
            }else if(nums2[j]<nums1[i]){
                j++;
            }else{
                result.add(nums1[i]);
                i++;
                j++;
            }
        }
        //int index = 0;
        int[] End = new int[result.size()];
        for (int k=0;k<End.length;k++){
            End[k] = result.get(k);
        }
        return End;
    }


    public static void main(String[] args) {
        int[] nums1 = {21,47,80,4,3,24,87,12,22,11,48,6,89,80,74,71,74,55,58,56,
                4,98,40,66,49,53,62,27,3,66,78,24,48,69,88,12,80,63,98,65,46,35,72,
                5,64,72,7,29,37,3,2,75,44,93,79,78,13,39,85,26,15,41,87,47,29,93,
                41,74,6,48,17,89,27,61,2,68,99,57,45,73,25,33,38,32,58};

        int[] nums2 = {1,39,6,81,85,10,38,22,0,89,57,93,58,69,65,80,84,24,27,54,37,36,
                26,88,2,7,24,36,51,5,74,57,45,56,55,67,25,33,78,49,16,79,74,80,36,
                27,89,49,64,73,96,60,92,31,98,72,22,31,0,93,70,87,80,66,75,69,81,
                52,94,90,51,90,74,36,58,38,50,9,64,55,4,21,49,60,65,47,67,8,38,83};


        int[] result = intersect2(nums1,nums2);
        for(int i = 0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
