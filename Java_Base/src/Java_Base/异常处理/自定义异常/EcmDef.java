package Java_Base.异常处理.自定义异常;

/**
 * @Author WiKunZ
 * @Date 2021/5/3-19:09
 */
public class EcmDef {
    public static void main(String[] args) {
        EcmDef ecmDef = new EcmDef();
        try{
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            double result = ecmDef.getResult(i,j);  //注意如果getResult方法中的参数是double型的，不会报算数异常，直接返回infinity（无穷大）
//            System.out.println(result);
        }catch (NumberFormatException nfe){
            System.out.println("输入的数据类型有误");
        }catch (ArithmeticException ae){
            System.out.println("除数不能为0");
        }catch (ArrayIndexOutOfBoundsException aioob){
            System.out.println("缺少命令行参数");
        } catch (EcmDefException e) {
            System.out.println(e.getMessage());
        }
    }

    public int getResult(int first,int second) throws EcmDefException {
        if(first<0||second<0){
            throw new EcmDefException("输入了负数");
        }
        return first/second;
    }
}
class EcmDefException extends Exception{
    static final long serialVersionUID = -7034897190745766939L;

    public EcmDefException() {
    }

    public EcmDefException(String message) {
        super(message);
    }
}
