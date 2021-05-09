package Java_Base.常用类.String;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author WiKunZ
 * @Date 2021/5/8-19:24
 */
public class StringTest {
    /**
     * String:字符串，使用一对”"引起来表示。
     * 1.String声明为finaL的，不可被继承
     * 2.String实现了SerializabLe接口:表示字符串是支持序列化的。
     *         实现了Comparable接口:表示String可以比较大小
     * 3.String内部定义了final char[]value用于存储字符串数据
     * 4.String:代表不可变的字符序列。简称:不可变性。
     *  体现:如下方test1()
     *      a.当对字符串重新赋值时，需要重写指定内存区域,不能使用原有的value进行赋值。
     *      b.当对现有的字符串进行连接操作时，也需要重新指定内存区域赋值，不能使用原有的value进行赋值。
     *      c.当调用String的replace()方法修改指定字符或字符串时，也需要重新指定内存区域,不能使用原有的value进行赋值。
     *      d.总结：只要对String进行增删改，都需要重新在方法区的常量池中重新建一个新的String，原本的不会变。
     * 5.通过字面量的方式（区别于new）给一个字符串赋值，此时的字符串值声明在字符串常量池中。System.out.println(str1==str2);输出true
     * 6.字符串常量池中是不会存储相同内容的字符串的。
     */
    @Test
    public void test1(){
        String str1 = "abc";//字面量
        String str2 = "abc";
        //str1 = "cba";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1==str2);
        //System.out.println("123"=="123");

        System.out.println("*******************");

        String str3 = "abc";
        str3 +="def";
        System.out.println(str3);
        System.out.println(str2);

        System.out.println("*******************");

        String str4 = "abc";
        String str5 = str4.replace("a","b");
        System.out.println(str4);//abc
        System.out.println(str5);//mbc
    }

    /**
     *
     * String的实例化方式:
     * 方式一:通过字面量定义的方式
     * 方式二:通过new +构造器的方式
     * 面试题: String s = new String("abc");方式创建对象，在内存中创建了几个对象?
     * 两个:一个是堆空间中new结构，另一个是char[]对应的常量池中的数据:"abc“
     */
    @Test
    public void test2(){
        //通过字面量定义的方式:此时的s1和s2的数据javaEE声明在方法区中的字符串常量池中。
        String s1 = "javaEE";
        String s2 = "javaEE";

        //通过new +构造器的方式:此时的s3和s4保存的地址值，是数据在堆空间中开辟空间以后对应的地址值
        String s3 = new String("javaEE");
        String s4 = new String("javaEE");
        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false
        System.out.println(s1 == s4);//false
        System.out.println(s3 == s4);//false
        System.out.println("********************");

        Person p1 = new Person("Tom",12);
        Person p2 = new Person("Tom",12);
        Person p3 = new Person(new String("Tom"),12);
        System.out.println(p1.name == p2.name);//True  原因：字面量的方式定义
        System.out.println(p1.name == p3.name);//False  原因：p3.name是通过new的方式定义
    }

    @Test
    public void test3(){
        char[] ch = {'a','b','c'};
        String test = new String("good");
        exchange(test,ch);
        System.out.println(test+"  "+ Arrays.toString(ch));
    }

    public void exchange(String str,char[] chars){
        String tmp = str;
        System.out.println(str);
        str = "test ok";
        System.out.println(str==tmp);
        System.out.println("tmp的值为:"+tmp);
        chars[0] = 'b';
    }

}
