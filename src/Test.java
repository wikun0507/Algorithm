/**
 * @Author WiKunZ
 * @Date 2021/5/4-20:30
 */
public class Test {
    public static int fib(int a){
        if(a==1)
            return 1;
        return a*fib(a-1);
    }
    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}
