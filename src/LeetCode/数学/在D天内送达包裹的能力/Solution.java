package LeetCode.数学.在D天内送达包裹的能力;

/**
 * @author Zwg
 */
public class Solution {
    public static int getMax(int[] array){
        int max = array[0];
        for(int i = 0;i<array.length;i++){
            max = Math.max(array[i],max);
        }
        return max;
    }

    public static int getSum(int[] array){
        int sum = 0;
        for(int i = 0;i<array.length;i++){
            sum += array[i];
        }
        return sum;
    }

    public static int shipWithinDays(int[] weights, int D) {
        if (D==1){
            return getSum(weights);
        }
        int left = getMax(weights);
        int right = getSum(weights);
        int mid = 0;
        while(left<right){
            mid = (left+right)>>1;
            //System.out.println("left="+left+" right="+right+" mid="+mid);
            if(check(weights,mid,D)){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return right;
    }

    public static boolean check(int[] weights,int mid,int D){
        int day = 0;
        int temp = 0;

        for(int j = 0;j< weights.length;j++){
            temp +=weights[j];
            if(temp>mid){
                day++;
                temp = 0;
                temp +=weights[j];
            }
        }
        day += 1;
        return day<=D;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] b = {3,2,2,4,1,4};
        int[] c = {1,2,3,1,1};
        int[] d = {10,50,100,100,50,100,100,100};
        System.out.println(shipWithinDays(d,5));
        System.out.println(shipWithinDays(a,5));
        System.out.println(shipWithinDays(b,3));
        System.out.println(shipWithinDays(c,4));


    }
}
