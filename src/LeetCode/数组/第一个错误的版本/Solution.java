package LeetCode.数组.第一个错误的版本;

/**
 * @Author WiKunZ
 * @Date 2021/6/13-11:32
 */
public class Solution {

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while(left<right){
            int mid =left + (right-left)/2;       //防止数据溢出
            if(!isBadVersion(mid)){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left;
    }
    public boolean isBadVersion(int version){
        boolean[] vsersions = {true,true,true,true,true};
        return vsersions[version-1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.firstBadVersion(1));
    }
}
