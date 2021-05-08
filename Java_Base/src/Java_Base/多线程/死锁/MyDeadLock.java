package Java_Base.多线程.死锁;

/**
 * @Author WiKunZ
 * @Date 2021/5/8-18:48
 */
public class MyDeadLock {
    public static void main(String[] args) {
        Object tmp1 = new Object();
        Object tmp2 = new Object();
        ThreadDead1 threadDead1 = new ThreadDead1(tmp1,tmp2);
        ThreadDead2 threadDead2 = new ThreadDead2(tmp1,tmp2);
        new Thread(threadDead1).start();
        new Thread(threadDead2).start();
    }
}

class ThreadDead1 implements Runnable{
    Object obj1;
    Object obj2;

    public ThreadDead1(Object obj1,Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        while (true){
            synchronized (obj1){
                System.out.println("T1占用了锁obj1");
                synchronized (obj2){
                    System.out.println("T1占用了锁obj2");
                }
            }
        }
    }
}

class ThreadDead2 implements Runnable{
    Object obj1;
    Object obj2;

    public ThreadDead2(Object obj1,Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        while (true){
            synchronized (obj2){
                System.out.println("T2占用了锁obj2");
                synchronized (obj1){
                    System.out.println("T2占用了锁obj1");
                }
            }

        }
    }
}
