package Java_Base.单例设计模式;

/**
 * @Author WiKunZ
 * @Date 2021/5/1-15:03
 */

/**
 * 懒汉式
 */
public class SingleonTest2 {

}
class Order{
    //1.私有化类的构造器
    private Order(){

    }
    //2.声明当前类对象，不初始化，此对象也必须声明为static的
    private static Order instance = null;

    //3.声明public、static的返回当前类对象的方法
    public static Order getInstance() {
        return instance;
    }
}

