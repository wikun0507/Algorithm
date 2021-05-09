package Java_Base.常用类.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author WiKunZ
 * @Date 2021/5/9-16:32
 */
public class DateApiTest {

    public static void main(String[] args) {
        /**
         * System类中的currentTimeMillis()
         */
        //返回当前时间与1970年1月1日0时0分秒之间以毫秒为单位的时间差。
        //称为时间戳
        //System.out.println(System.currentTimeMillis());

        /**
         * Date类
         * java.util.Date
         *      |---java.sql.Date类
         * 1.两个构造器的使用
         *   >构造器一: Date():创建一个对应当前时间的Date对象
         *   >构造器二:创建指定毫秒数的Date对象
         * 2.两个方法的使用
         *   >toString():显示当前的年、月、日、时、分、秒
         *   >getTime():获取当前Date对象对应的时间戳
         *
         * 3.java.sql.Date对应数据库中的日期类型的变量
         *   >如何实例化
         *   >如何将java.util.Date对象转换为java.sqL.Date对象
         *    new java.sqL.Date(java.util.Date.getTime)
         */
        //构造器一：Date():创建一个对应当前时间的Date对象
        Date date1 = new Date();
        System.out.println(date1.toString());//Sun May 09 16:53:43 CST 2021
        System.out.println(date1.getTime());//1620550423544

        //构造器二：创建指定毫秒数的Date对象
        Date date2 = new Date(1620549570765L);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println(date2.toString());//Sun May 09 16:39:30 CST 2021
        System.out.println(simpleDateFormat.format(date2));//16:39:30

        //创建java.sql.Date对象
        System.out.println(new java.sql.Date(494114443235L));

    }
}
