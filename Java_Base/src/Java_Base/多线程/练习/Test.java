package Java_Base.多线程.练习;

/**
 * @Author WiKunZ
 * @Date 2021/5/8-16:32
 */
public class Test {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Buy buy = new Buy(ticket);
        Add add = new Add(ticket);
        new Thread(buy).start();
        new Thread(add).start();
    }

}
class Ticket{
    public int num = 200;
}
class Buy implements Runnable{
    Ticket ticket;

    Buy(Ticket ticket){
        this.ticket = ticket;
    }

    public void buy() {
        synchronized (ticket){
            System.out.println("我买了一张票，票号是："+ticket.num);
            ticket.num -=1;
            ticket.notify();
            if(ticket.num<=0){
                try {
                    ticket.wait();
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
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            buy();
        }
    }
}

class Add implements Runnable{
    Ticket ticket;

    public Add(Ticket ticket) {
        this.ticket = ticket;
    }
    public void add(){
        synchronized (ticket){
            System.out.println("工作人员加了一张票，票号是："+(ticket.num+1));
            ticket.num +=1;
            ticket.notify();
            if (ticket.num>200){
                try {
                    ticket.wait();
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
               Thread.sleep(20);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           add();
       }
    }
}


