package Java_Base.常用类.Calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @Author WiKunZ
 * @Date 2021/5/12-13:41
 * 1.Calendar是一个抽象类，不能直接new Calendar(),需要new它的实现类。
 */
public class CalendarApiTest {

    public static void main(String[] args) {
        //方式一:创建其子类(Gregoriancalendar)的对象
        Calendar calendar1 = new GregorianCalendar();

        //方式二：调用其静态方法getInstance();该方法返回的仍然是Gregoriancalendar
        Calendar calendar2 = Calendar.getInstance();
        //System.out.println(calendar2.getClass());//class java.util.GregorianCalendar

        //常用方法
        calendar2.set(2020,Calendar.DECEMBER,20);       //set
        System.out.println(calendar2.get(Calendar.DAY_OF_YEAR));    //get
        System.out.println(calendar2.getTime());        //getTime-->返回一个Date对象
        calendar2.setTime(new Date());                  //setTime-->传一个Date类参数
        System.out.println(calendar2.getTime());
        System.out.println(calendar2.get(Calendar.DAY_OF_YEAR));

    }
}
