package LeetCode.其他.猜数字大小;

/**
 * @Author WiKunZ
 * @Date 2021/6/14-12:48
 */
public class Solution {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while(left<right){
            int mid = left+(right-left)/2;
            int guess = guess(mid);
            if(guess==1){      //大
                left = mid+1;
            }else if(guess==-1){
                right = mid;
            }else{
                left = mid;
                break;
            }
        }
        return left;
    }

    int guess(int num){
        int pick = 2;
        return Integer.compare(pick,num);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.guessNumber(3));
    }
}
