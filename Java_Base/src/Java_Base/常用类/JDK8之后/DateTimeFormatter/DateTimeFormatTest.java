package Java_Base.常用类.JDK8之后.DateTimeFormatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author WiKunZ
 * @Date 2021/5/12-15:00
 */
public class DateTimeFormatTest {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
        System.out.println(dateTimeFormatter.format(LocalDateTime.of(1999,5,7,16,12,10)));
        //1999-05-07 12-12-10
    }
}
