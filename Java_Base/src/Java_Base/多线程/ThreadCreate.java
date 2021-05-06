package Java_Base.多线程;

/**
 * @Author WiKunZ
 * @Date 2021/5/5-18:08
 * 创建多线程的第一种方式
 */
public class ThreadCreate extends Thread{
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        //①通过此对象调用start()
        //②启动当前线程调用当前线程的run()
        //③输出结果与CPU有关
        /**
         * 不能通过直接调run()方法的方式启动线程，此时线程没有启动，要用start()方法
         */
        myThread.start();
        for(int i = 0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+": "+"main");
        }

        //不可以让已经start了的线程再次start，会报IllegalThreadStateException异常
        //myThread.start();
        //可通过以下方式进行，即重新创建想要的线程。
        MyThread myThread2 = new MyThread();
        myThread2.start();
    }

}

//1.创建一个继承Thread的子类
class MyThread extends Thread{
    //2.重写Thread类的run()方法

    @Override
    public void run() {
       for(int i = 1;i<=100;i++){
           System.out.println(Thread.currentThread().getName()+": "+(i%2==0?i:" "));
       }
    }
}
