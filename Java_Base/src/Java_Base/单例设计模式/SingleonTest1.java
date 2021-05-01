package Java_Base.单例设计模式;

/**
 * @Author WiKunZ
 * @Date 2021/5/1-14:53
 */

/**
 * 饿汉式
 */
public class SingleonTest1 {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank2==bank1);//True
    }

}
class Bank{
    //1.私有化类的构造器
    private Bank(){
    }
    //2.声明当前类对象，并初始化，此对象必须声明为static的
    private static Bank instance = new Bank();

    //3.声明public、static的返回当前类对象的方法
    public static Bank getInstance(){
        return instance;
    }
}