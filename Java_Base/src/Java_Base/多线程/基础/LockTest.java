package Java_Base.多线程.基础;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author WiKunZ
 * @Date 2021/5/7-16:56
 * <p>
 * 解决线程安全问题的方式三:Lock锁  ----JDK5.0新增
 */
public class LockTest {

    public static void main(String[] args) {
        Window windows = new Window();
        Thread t1 = new Thread(windows);
        Thread t2 = new Thread(windows);
        Thread t3 = new Thread(windows);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");


        t1.start();
        t2.start();
        t3.start();

    }
}

class Window implements Runnable {
    private int ticket = 100;

    //1.实例化ReentrantLock
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {

        while (true) {
            try{
                //2.调用lock()锁定方法
                lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":卖票  票号为:" + ticket--);
                } else {
                    break;
                }
            }finally {
                lock.unlock();
            }


    }

}
}
