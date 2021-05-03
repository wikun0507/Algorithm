package Java_Base.练习;

import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

public class Practice_6 {
    int id;
    public Practice_6(int id){
        System.out.println("我是构造器"+id);
    }
//    static {
//        System.out.println("我是静态代码块");
//    }
    public static void main(String[] args) {
//        for(int i = 0;i< args.length;i++){
//            System.out.println("****"+args[i]);
//        }
//        Practice_6 practice_6 = new Practice_6(1);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext("#")){
            System.out.println(scanner.next());
        }
    }
}
