package Java_Base.多线程.基础;

/**
 * @Author WiKunZ
 * @Date 2021/5/5-18:55
 *
 * 测试Thread类中的常用方法
 * 1.start():启动当前线程；调用当前线程的run()
 * 2.run():通常需要重写Thread类中的此方法，将创建的线程执行的操作声明在此方法中
 * 3.currentThread():静态方法，可通过Thread.进行调用，返回正在执行的代码所在的线程
 * 4.getName():获取线程的名称
 * 5.setName():设置当前线程的名称
 * 6.yield():释放当前CPU的执行权
 * 7.join():在线程a中调用线程b的join(),此时线程a就进入阻塞状态，直到线程b完全执行完以后，线程a才结束阻塞状态。
 * 8.stop():已过时，当执行此方法时，强制结束当前线程。
 * 9.sleep(long millitime):让当前线程“睡眠”指定的millitime毫秒。在指定的millitime毫秒时间内，当前线程是阻塞状态。
 * 10.isAlive():判断当前线程是否存活。
 */
public class ThreadMethod {
    public static void main(String[] args) {
        MyThread3 myThread3 = new MyThread3();
        myThread3.setName("线程一");
        myThread3.start();
        //给主线程命名
        Thread.currentThread().setName("主线程");
        for (int i = 1; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+":"+"我爱你"+i);
            if(i==30){
                try {
                    myThread3.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(Thread.currentThread().isAlive());
    }
}

class MyThread3 extends Thread{
    public MyThread3() {

    }
    public MyThread3(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i = 1;i<=100;i++){
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+": "+(i%2==0?i:" "));
//            if (i%3==0){
//                yield();
//            }
        }
    }
}
