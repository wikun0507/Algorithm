package Java_Base.多线程.基础;

/**
 * @Author WiKunZ
 * @Date 2021/5/6-18:31
 *
 * 创建多线程的第二种方式
 * 1.创建一个实现了Runnable接口的类
 * 2.实现类去实现Runnable中的抽象方法：run()
 * 3.创建实现类的对象
 * 4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 * 5.通过Thread类的对象调用start()
 */
public class ThreadCreate2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread2());
        thread.start();
        Thread thread1 = new Thread(new MyThread4());
        thread1.start();
    }
}

class MyThread2 implements Runnable{

    @Override
    public void run() {
        for(int i = 1;i<=100;i++){
            if(i%2==0)
            System.out.println(Thread.currentThread().getName()+": "+i);
        }
    }
}

class MyThread4 implements Runnable{
    @Override
    public void run() {
        for(int i = 1;i<=100;i++){
            if(i%2!=0)
                System.out.println(Thread.currentThread().getName()+": "+i);
        }
    }
}
