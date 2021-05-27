package LeetCode.困难.与数组中元素的最大异或值;

import LeetCode.数组.数组中两个数的最大异或值.DicTree;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author WiKunZ
 * @Date 2021/5/23-17:51
 */
public class Solution {
//    public static int[] maximizeXor(int[] nums, int[][] queries) {
//        int[] result = new int[queries.length];
//        Arrays.fill(result,-1);
//        Arrays.sort(nums);
//        for(int i = 0;i< queries.length;i++){
//            int index = 0;
//            while(index<nums.length&&nums[index]<=queries[i][1]){
//                result[i] = Math.max(result[i],queries[i][0]^nums[index++]);
//            }
//        }
//        return result;
//    }

    /**
     * 字典树
     */
    int depth = 30;//树的深度。
    public int[] maximizeXor(int[] nums, int[][] queries) {
        DicTree root = new DicTree(0,null,null);
        int length = queries.length;
        int index = 0;
        int[] result = new int[length];
        Arrays.fill(result,-1);
        Map<int[],Integer> record = new HashMap<>();
        for(int i = 0;i< queries.length;i++){
            record.put(queries[i],i);
        }
        Arrays.sort(nums);
        Arrays.sort(queries, (o1, o2) -> o1[1]-o2[1]);
        for(int i = 0;i<length;i++){
            while(index < nums.length&&nums[index]<=queries[i][1]){
                buildDicTree(root,nums[index++]);
            }
            if(index!=0)
                result[record.get(queries[i])] = dfs(root,queries[i][0]);
        }
        return result;
    }

    public int dfs(DicTree dicTree, int num){
        int result = 0;
        for(int i = depth;i>=0;i--){
            int bit = (num>>i)&1;
            if(bit==0){
                if(dicTree.right!=null){
                    dicTree = dicTree.right;
                    result = 2*result+1;
                }else{
                    dicTree = dicTree.left;
                    result = result*2;
                }
            }else{
                if(dicTree.left!=null){
                    dicTree = dicTree.left;
                    result = result*2+1;
                }else {
                    dicTree = dicTree.right;
                    result = 2*result;
                }
            }
        }
        return result;
    }

    public void buildDicTree(DicTree dicTree,int num){
        for(int i = depth;i>=0;i--){
            int bit = (num>>i)&1;
            if(bit==0){
                if(dicTree.left==null){
                    dicTree.left = new DicTree(bit,null,null);
                    dicTree = dicTree.left;
                }else{
                    dicTree = dicTree.left;
                }
            }else {
                if(dicTree.right==null){
                    dicTree.right = new DicTree(bit,null,null);
                    dicTree = dicTree.right;
                }else{
                    dicTree = dicTree.right;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {5,2,4,6,6,3};
        int[][] queries = {{12,4},{8,1},{6,3}};
        System.out.println(Arrays.toString(solution.maximizeXor(nums,queries)));

        int[] nums2 = {0,1,2,3,4};
        int[][] queries2 = {{3,1},{1,3},{5,6}};
        System.out.println(Arrays.toString(solution.maximizeXor(nums2,queries2)));

        int[] nums3 = {536870912,0,534710168,330218644,142254206};
        int[][] queries3 = {{558240772,1000000000},
                            {307628050,1000000000},
                            {3319300,1000000000},
                            {2751604,683297522},
                            {214004,404207941}};
        System.out.println(Arrays.toString(solution.maximizeXor(nums3,queries3)));

    }
}
