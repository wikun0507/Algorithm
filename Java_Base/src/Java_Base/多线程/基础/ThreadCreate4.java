package Java_Base.多线程.基础;

import java.util.concurrent.*;

/**
 * @Author WiKunZ
 * @Date 2021/5/8-15:35
 */
public class ThreadCreate4 {
    public static void main(String[] args) {
        //1.提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);//返回的是ThreadPoolExecutor，所以下方强转是可以的
        //System.out.println(service.getClass());

        //设置线程池的属性-体现线程池的管理功能
        ThreadPoolExecutor service1 = (ThreadPoolExecutor)service;
        service1.setCorePoolSize(15);
        //service1.setKeepAliveTime();

        PoolThread1 poolThread1 = new PoolThread1();

        //2.执行指定的线程的操作。需要提供实现Runnable接口或Callable接口实现类的对象

        service.execute(poolThread1);//适合适用于Runnable
        service.execute(poolThread1);//适合适用于Runnable

        //FutureTask futureTask = new FutureTask(new PoolThread2());

        service.submit(new PoolThread2());//适合适用于Callable

        //关闭线程池
        service.shutdown();
    }

}

class PoolThread1 implements Runnable{
    @Override
    public void run() {
        for(int i = 1;i<=100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        }

    }
}

class PoolThread2 implements Callable {

    @Override
    public Object call() throws Exception {
        for(int i = 1;i<=100;i++){
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        }
        return null;
    }
}

