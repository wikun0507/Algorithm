package Java_Base.ExceptionDeal;

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
        File file = new File("src/Java_Base/ExceptionDeal/Hello.txt");
        System.out.println(file.getAbsolutePath());
        FileInputStream fis = new FileInputStream(file);
        int data = fis.read();
        while(data != -1){
            System.out.printf(String.valueOf((char)data));
            data = fis.read();
        }
        fis.close();
    }

}
