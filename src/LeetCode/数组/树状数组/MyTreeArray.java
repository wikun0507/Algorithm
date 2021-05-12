package LeetCode.数组.树状数组;

import java.util.Arrays;

/**
 * @Author WiKunZ
 * @Date 2021/5/12-11:55
 */
public class MyTreeArray {
    int[] myTree;
    int n;
    int[] nums;
    public MyTreeArray(int[] nums) {
        this.myTree = new int[nums.length+1];
        this.n = nums.length;
        this.nums = nums;
        for(int i = 0;i< nums.length;i++){
            add(i+1,nums[i]);
        }

    }

    public int lowBit(int x){
        return x&-x;
    }

    public void add(int index,int val){
        for(int i = index;i <= n;i += lowBit(i)){
            myTree[i] += val;
        }
    }

    public int query(int index){
        int ans = 0;
        for(int i = index;i>0;i-=lowBit(i)){
            ans += myTree[i];
        }
        return ans;
    }

    public void update(int index, int val) {
        add(index+1,val-nums[index]);
        nums[index] = val;
    }

    public int sumRange(int left, int right) {
        return query(right+1)-query(left);
    }

    public static void main(String[] args) {
//        MyTreeArray treeArray = new MyTreeArray(new int[]{1,2,3,4,5,6});
//        System.out.println("n="+treeArray.n);
//        System.out.println(Arrays.toString(treeArray.myTree));
//        System.out.println(treeArray.sumRange(1,5));
//        treeArray.update(2,4);
//        System.out.println(Arrays.toString(treeArray.myTree));

        MyTreeArray treeArray2 = new MyTreeArray(new int[]{1,3,5});
        System.out.println(treeArray2.sumRange(0,2));
        treeArray2.update(1,2);
        System.out.println(treeArray2.sumRange(0,2));
    }
}
