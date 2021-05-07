package Java_Base.多线程.练习;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author WiKunZ
 * @Date 2021/5/7-17:34
 */
public class Bank {
    public static void main(String[] args) {
        Account account = new Account(3000);
        Store store = new Store(account);
        Thread thread1 = new Thread(store);
        Thread thread2 = new Thread(store);
        thread1.setName("一");
        thread2.setName("二");

        thread1.start();
        thread2.start();

    }
}
class Account{
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }
    public void store(int money){
        if (money > 0) {
            balance +=money;
        }
    }

    public int getBalance() {
        return balance;
    }
}
class Store implements Runnable {
    private Account account;
    private ReentrantLock lock = new ReentrantLock();

    public Store(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        try {
            lock.lock();
            for (int i = 0; i < 3; i++) {
                account.store(1000);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("我是储户" + Thread.currentThread().getName() + " 当前总金额为:" + account.getBalance());
            }
        } finally {
            lock.unlock();
        }
    }
}
