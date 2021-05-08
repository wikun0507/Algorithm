package Java_Base.多线程.线程通信;

/**
 * @Author WiKunZ
 * @Date 2021/5/7-19:23
 */
public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk(1,20);

        Productor productor = new Productor(clerk);
        Comsumer comsumer = new Comsumer(clerk);

        Thread Productor = new Thread(productor);

        Thread Customer = new Thread(comsumer);
        Customer.setName("甲");
        Thread Customer2 = new Thread(comsumer);
        Customer2.setName("乙");
        Thread Customer3 = new Thread(comsumer);
        Customer3.setName("丙");


        Productor.start();
        Customer.start();
        Customer2.start();
        Customer3.start();
    }
}

class Clerk{
    int currentProduct;
    int maxProduct;

    public Clerk(int currentProduct, int maxProduct) {
        this.currentProduct = currentProduct;
        this.maxProduct = maxProduct;
    }
}

class Productor implements Runnable{
    Clerk clerk;

    public Productor(Clerk clerk) {
        this.clerk = clerk;
    }

    public void create(){
        synchronized (clerk){
            if(clerk.currentProduct< clerk.maxProduct){
                clerk.currentProduct++;
                System.out.println("我是生产者,当前已有货品的数量为"+clerk.currentProduct);
                clerk.notify();
            }else{
                try {
                    clerk.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            create();
        }
    }
}

class Comsumer implements Runnable{
    Clerk clerk;

    public Comsumer(Clerk clerk) {
        this.clerk = clerk;
    }

    public void comsume(){
        synchronized (clerk){
            if(clerk.currentProduct>0){
                System.out.println("我是消费者"+Thread.currentThread().getName()+" 我来取第"+clerk.currentProduct+"件货品");
                clerk.currentProduct--;
                clerk.notify();
            }else{
                try {
                    clerk.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            comsume();
        }
    }
}
