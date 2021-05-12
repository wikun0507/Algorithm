package LeetCode.数学.计算X的N次幂;

/**
 * @Author WiKunZ
 * @Date 2021/5/11-23:25
 */
public class MyPow {
    /**
     * 快速幂
     * @param x 基数
     * @param n 幂
     * @return
     */
    public static double myPow(double x, int n) {
        if(n==0){
            return 1;
        }else if (n==1){
            return x;
        }
        int times = Math.abs(n);
        double result = 1;
        for(;times!=0;times >>= 1){
            if(times%2!=0){
                result *= x;
            }
            x *= x ;
        }
        return n<0?1/result:result;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2,13));
    }
}
