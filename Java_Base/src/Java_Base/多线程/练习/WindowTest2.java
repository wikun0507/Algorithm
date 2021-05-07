package Java_Base.多线程.练习;

/**
 * @Author WiKunZ
 * @Date 2021/5/7-14:09
 *
 * 使用同步方法解决实现Runnable接口的线程安全问题
 *
 */
public class WindowTest2 {
    public static void main(String[] args) {
        /** ticket加static的方式 */
        Window4 t1 = new Window4();
        Window4 t2 = new Window4();
        Window4 t3 = new Window4();
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();

        /** ticket不加static的方式 */
//        Window3 window3 = new Window3();
//        Thread thread4 = new Thread(window3);
//        Thread thread5 = new Thread(window3);
//        Thread thread6 = new Thread(window3);
//        thread4.start();
//        thread5.start();
//        thread6.start();
    }
}

class Window3 implements Runnable {
    public int ticket = 1000;
    //final Object object = new Object();

    @Override
    public void run() {
        while (ticket>0) {
            show();
        }
    }

    private synchronized void show(){       //同步监视器为this

        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":买票，票号为" + ticket--);
        }
    }
}

class Window4 extends Thread {
    public static int ticket = 200;

    @Override
    public void run() {

        while (ticket>0) {
            show();
        }
    }

//    private synchronized void show(){       //同步监视器为:t1,t2,t3
    private static synchronized void show(){    //同步监视器Window4.class
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":买票，票号为" + ticket--);
        }
    }
}
