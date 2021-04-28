package LeetCode.数学.计算X的N次幂;

public class Pow {
    public static void main(String[] args) {
        System.out.println(myPow(2,13));
    }
    public static double myPow(double x,int n){
        double result = 1;
        long tmp = Math.abs((long)n);
        for(;tmp !=0;tmp/=2){
            System.out.println("tmp的值为"+tmp);
            if(tmp%2!=0){
                result *=x;
                System.out.println("result的值:"+result);
            }
            x *= x;
            System.out.println("x的值:"+x);
            System.out.print("\n");
        }
        return n<0?1/result:result;
    }
}
