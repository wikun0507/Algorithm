package LeetCode.动态规划.区域和检索_数组不可变;

/**
 * @Author WiKunZ
 * @Date 2021/6/8-19:36
 */
public class NumArray {
    int[] pre;
    int[] orginal;
    public NumArray(int[] nums) {
        orginal = nums;
        if (nums.length > 0) {
            pre = new int[nums.length+1];
            for (int i = 1; i <=nums.length; i++) {
                pre[i] = nums[i-1] + pre[i - 1];
            }
        }else{
            pre = null;
        }
    }

    public int sumRange(int left, int right) {
        if(left==0){
            return pre[right+1];
        }else if(left==right){
            return orginal[left];
        }else{
            return pre[right+1]-pre[left];
        }
    }

    public static void main(String[] args) {
        NumArray na = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(na.sumRange(0, 2));
        System.out.println(na.sumRange(2, 5));
        System.out.println(na.sumRange(0, 5));
    }
}
