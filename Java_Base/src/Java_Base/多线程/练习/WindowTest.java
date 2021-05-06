package Java_Base.多线程.练习;

/**
 * @Author WiKunZ
 * @Date 2021/5/5-21:16
 *
 * 例子：创建三个窗口卖票
 * 存在线程安全问题，待解决
 */
public class WindowTest {


    public static void main(String[] args) {
        /** ticket加static的方式 */
//        Window t1 = new Window();
//        Window t2 = new Window();
//        Window t3 = new Window();
//        t1.setName("窗口1");
//        t2.setName("窗口2");
//        t3.setName("窗口3");
//        t1.start();
//        t2.start();
//        t3.start();

        /** ticket不加static的方式 */
//        Window2 window2 = new Window2();
//        Thread thread4 = new Thread(window2);
//        Thread thread5 = new Thread(window2);
//        Thread thread6 = new Thread(window2);
//        thread4.start();
//        thread5.start();
//        thread6.start();
//
    }
}
class Window2 implements Runnable{
    public int ticket = 200;
    @Override
    public void run() {
        while (true){
            if(ticket>0){
                System.out.println(Thread.currentThread().getName()+":买票，票号为"+ticket--);
            }else{
                break;
            }
        }
    }
}
class Window extends Thread{
    public static int ticket = 200;
    @Override
    public void run() {
        while (true){
            if(ticket>0){
                System.out.println(Thread.currentThread().getName()+":买票，票号为"+ticket--);
            }else{
                break;
            }
        }
    }
}
