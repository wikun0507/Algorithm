package Java_Base.多线程.基础;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author WiKunZ
 * @Date 2021/5/8-14:50
 *
 * 1.创建一个实现callable的实现类
 * 2.实现call方法，将此线程需要执行的操作声明在call()中
 * 3.创建Callable接口实现类的对象
 * 4.将此Callable接口实现类的对象作为传递到FutureTask构造器中，创建FutureTask的对象
 * 5.将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并start()
 * 6.获取callable中call方法的返回值（非必要)
 */
public class ThreadCreate3 {
    public static void main(String[] args){
        /**FutureTask是Future接口的唯一实现类
         * FutureTask 同时实现了Runnable, Future接口。
         * 它既可以作为Runnable被线程执行，又可以作为Future得到Callable的返回值
         * */
        MyThredByCall myThredByCall = new MyThredByCall();
        FutureTask futureTask = new FutureTask(myThredByCall);
        new Thread(futureTask).start();
        try {
            //get()返回值即为FutureTask构造器参数Callable实现类重写的calL()的返回值。
            Object sum = futureTask.get();
            System.out.println("总和为:"+sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class MyThredByCall implements Callable{

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for(int i = 1;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
                sum += i;
            }
        }

        //自动装箱，即自动转为Integer
        return sum;
    }
}