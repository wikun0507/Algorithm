package LeetCode.数组.数组中两个数的最大异或值;

/**
 * @Author WiKunZ
 * @Date 2021/5/16-16:26
 */
public class DicTree {
    public int val;
    public DicTree left;
    public DicTree right;

    public DicTree(int val, DicTree left, DicTree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
