package Java_Base.常用类.JDK8之后.DateTime;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

/**
 * @Author WiKunZ
 * @Date 2021/5/12-14:14
 */
public class JDK8DateTimeTest {
    public static void main(String[] args) {
        /**
         * LocalDate LocalTime LocalDateTime的使用
         * 说明：LocalDateTime相较于LocalDate LocalTime，使用频率更高
         * 类似于Calendar
         */
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
        System.out.println("****************");
        /**
         * of()设定指定的年 月 日 时 分 秒
         */
        //LocalDate localDate1 = LocalDate.of(1999,5,7);
        //LocalTime localTime1 = LocalTime.of(12,12,12);
        LocalDateTime localDateTime1 = LocalDateTime.of(1999,5,7,12,12,36);
        System.out.println("LocalDateTime转Instant:"+localDateTime1.toInstant(ZoneOffset.ofHours(8)).toEpochMilli());
        Date date = new Date(926050356000L);
        System.out.println("验证:"+new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(date));

        System.out.println(localDateTime1);//1999-05-07T12:12:36

        //getXxx():获取相关属性
        System.out.println(localDateTime1.getDayOfMonth());//7
        System.out.println(localDateTime1.getDayOfWeek());//FRIDAY
        System.out.println(localDateTime1.getDayOfYear());//127
        System.out.println(localDateTime1.getMonthValue());//5
        System.out.println(localDateTime1.getMonth());//MAY

        //体现不可变性
        //withXxx():设置相关的属性
        LocalDate localDate1 = localDate.withDayOfMonth(22);
        System.out.println(localDate);//2021-05-12
        System.out.println(localDate1);//2021-05-22

        LocalDateTime localDateTime2 = localDateTime.withHour(4);
        System.out.println(localDateTime);//2021-05-12T14:30:26.722
        System.out.println(localDateTime2);//2021-05-12T04:30:26.722
        /**
         * 加
         */
        LocalDateTime localDateTime3 = localDateTime.plusYears(1000);
        System.out.println(localDateTime3);//3021-05-12T14:32:12.465
        /**
         * 减
         */
        LocalDateTime localDateTime4 = localDateTime.minusYears(1000);
        System.out.println(localDateTime4);//1021-05-12T14:33:05.904





    }
}
