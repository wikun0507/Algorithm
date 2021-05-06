package Java_Base.多线程.练习;

/**
 * @Author WiKunZ
 * @Date 2021/5/5-18:36
 */
public class ThreadDemo {
    public static void main(String[] args) {
//        MyThread1 myThread1 = new MyThread1();
//        myThread1.start();
//        MyThread2 myThread2 = new MyThread2();
//        myThread2.start();


        //创建Thread类的匿名子类方式
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()+": "+(i%2==0?i:" "));
            }
        }).start();
        new Thread(()->{
            for(int i = 0;i<=100;i++){
                System.out.println(Thread.currentThread().getName()+": "+(i%2==1?i:" "));
            }
        }).start();
    }
}
class MyThread1 extends Thread{
    @Override
    public void run() {
        for(int i = 0;i<=100;i++){
            System.out.println(Thread.currentThread().getName()+": "+(i%2==0?i:" "));
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        for(int i = 0;i<=100;i++){
            System.out.println(Thread.currentThread().getName()+": "+(i%2==1?i:" "));
        }
    }
}
