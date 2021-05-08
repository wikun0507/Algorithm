package Java_Base.多线程.线程通信;

/**
 * @Author WiKunZ
 * @Date 2021/5/7-18:10
 *
 * 线程通信的例子:使用两个线程打印1-100。线程1，线程2交替打印
 */
public class ThreadContact {
    public static void main(String[] args) {
        NumberPrinter1 numberPrinter1 = new NumberPrinter1();
        Thread t1 = new Thread(numberPrinter1);
        Thread t2 = new Thread(numberPrinter1);
        t1.setName("甲");
        t2.setName("乙");
        t1.start();
        t2.start();
    }



}

class NumberPrinter1 implements Runnable{
    private int num = 1;

    @Override
    public void run() {
        while(true){
            synchronized (this){
                notify();
                if(num<=100){

                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName()+":"+num++);

                    try {
                        //使得调用如下wait()方法的线程进入阻塞状态
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    break;
                }
            }
        }
    }
}
