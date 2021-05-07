package Java_Base.多线程.练习;

/**
 * @Author WiKunZ
 * @Date 2021/5/5-21:16
 *
 * 例子：创建三个窗口卖票
 * 存在线程安全问题，如出现了重票、错票-->线程安全问题
 * 问题出现的原因：当某个线程操作车票的过程中，尚未操作完成时，其他线程参与进来，也操作车票。
 * 解决方式：当一个线程a在操作ticket的时候，其他线程不能参与进来。直到线程α操作完ticket时线程才可以开始操作ticket，
 * 这种情况即使线程a出现了阻塞，也不能被改变。
 *
 *
 * 同步的方式，解决了线程的安全问题。---好处
 * 操作同步代码时，只能有一个线程参与，其他线程等待。相当于是一个单线程的过程，效率低。---局限性
 */
public class WindowTest {


    public static void main(String[] args) {
        /** ticket加static的方式 */
        Window t1 = new Window();
        Window t2 = new Window();
        Window t3 = new Window();
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();

        /** ticket不加static的方式 */
//        Window2 window2 = new Window2();
//        Thread thread4 = new Thread(window2);
//        Thread thread5 = new Thread(window2);
//        Thread thread6 = new Thread(window2);
//        thread4.start();
//        thread5.start();
//        thread6.start();
    }
}
class Window2 implements Runnable{
    public int ticket = 50;
    final Object object = new Object();
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this){
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+":买票，票号为"+ticket--);
                }else{
                    break;
                }
            }

        }
    }
}
class Window extends Thread{
    public static int ticket = 1000;
    public static final Object object = new Object();
    @Override
    public void run() {

        while (true){
            //synchronized(object)
            synchronized (Window.class){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+":买票，票号为"+ticket--);
                }else{
                    break;
                }
            }

        }
    }
}
