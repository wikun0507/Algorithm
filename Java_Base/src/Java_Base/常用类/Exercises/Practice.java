package Java_Base.常用类.Exercises;

import javax.swing.text.DateFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Author WiKunZ
 * @Date 2021/5/12-19:27
 */
public class Practice {
    public static void main(String[] args) throws ParseException {
        String date = "2017-08-16 12-1-9";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date date1 = simpleDateFormat.parse(date);
//        System.out.println(date1);

        //DateTimeFormatter只能识别同时含有年月日时分秒的字符串时间，不能单纯识别年月日
        //DateTimeFormatter的Pattern如果是按照yyyy-MM-dd HH:mm:ss来进行格式转换的话，就必须保证格式完全匹配，不足两位的需要补齐，
        //不补齐会报异常
        //解决方式修改匹配格式为yyyy-M-d H:m:s
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-M-dd H-m-s");
        LocalDateTime localDateTime = LocalDateTime.parse(date,dateTimeFormatter);
        System.out.println(localDateTime.toInstant(ZoneOffset.ofHours(8)).toEpochMilli());

    }
}
