package multiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnfairLockExample {
    private final Lock lock = new ReentrantLock();
    public void accessResource(){
        lock.lock();
        System.out.println(Thread.currentThread().getName()+ " acquired the lock");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName()+ " released the lock");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        UnfairLockExample unfairLockExample = new UnfairLockExample();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                unfairLockExample.accessResource();
            }
        };
        Thread thread = new Thread(runnable,"Anish");
        Thread thread1 = new Thread(runnable,"Mahabir");
        Thread thread2 = new Thread(runnable,"Anishkaa");
        thread.start();
        thread1.start();
        thread2.start();
    }
}
