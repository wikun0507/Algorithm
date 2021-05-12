package Java_Base.常用类.JDK8之后.Instant;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * @Author WiKunZ
 * @Date 2021/5/12-14:43
 */
public class InstantApiTest {
    public static void main(String[] args) {
        //now()获取本初子午线对应的时间
        Instant instant = Instant.now();
        System.out.println(instant);//2021-05-12T06:44:05.435Z

        //添加时间的偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);//2021-05-12T14:45:15.763+08:00

        //获取自1970年1月1日日时0分日秒(UTC）开始的毫秒数
        System.out.println(instant.toEpochMilli());//1620802052501

        //ofEpochMilli():通过给定的毫秒数，获取Instant实例-->Date(Long millis)
        //有返回值类型为Instant
        System.out.println(Instant.ofEpochMilli(1620802052501L));//2021-05-12T06:47:32.501Z
    }
}
