package Java_Base.ExceptionDeal;

/**
 * @Author WiKunZ
 * @Date 2021/5/3-16:23
 */
public class Exception1 {
    public static void main(String[] args) {
        String str = "abc";
        try{
            Integer integer = Integer.parseInt(str);
        }catch (Exception e){
            System.out.println(e.toString());
        }
        System.out.println("Hello，我被执行了");
    }
}
