package Java_Base.异常处理.临时;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author WiKunZ
 * @Date 2021/5/3-17:19
 */
public class Exception2 {
    public static void main(String[] args){
        try {
            test();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void test() throws IOException {
        File file = new File("src/Java_Base/异常处理/临时/Hello.txt");
        System.out.println(file.getAbsolutePath());
        FileInputStream fis = new FileInputStream(file);
        int data = fis.read();
        while(data != -1){
            System.out.print(String.valueOf((char)data));
            data = fis.read();
        }
        fis.close();
    }

}
