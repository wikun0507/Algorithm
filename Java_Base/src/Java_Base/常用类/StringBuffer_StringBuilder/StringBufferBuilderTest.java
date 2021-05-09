package Java_Base.常用类.StringBuffer_StringBuilder;

import org.junit.Test;

/**
 * @Author WiKunZ
 * @Date 2021/5/9-16:14
 */
public class StringBufferBuilderTest {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer();
        s1.append('a');
        s1.append('b');
        s1.append(1);
        System.out.println(s1);
        s1.delete(1,3);
        s1.append(2).append(3).append(4);//方法链
        System.out.println(s1);
    }

    /**
     * 对比String、StringBuilder、StringBuffer的效率
     */
    @Test
    public void compare(){
        //初始设置
        long startTime = 0L;
        long endTime = 0l;
        String text = "";
        StringBuffer buffer = new StringBuffer("");
        StringBuilder builder = new StringBuilder("");//开始对比
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++){
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的执行时间:" + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i =0; i < 20000; i++){
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder的执行时间:"+ (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i <20000; i++) {
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("string的执行时间:" + (endTime - startTime));


    }
}
