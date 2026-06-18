package multiThreading;

public class DeadLockSituation {
    public static void main(String[] args) {
        System.out.println("Main is starting");
        String lock1="Anish";
        String lock2="Gupta";

        Thread thread1 = new Thread(()->{
            synchronized (lock1){
                try {
                    Thread.sleep(1);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2){
                    System.out.println("Lock acquired");
                }
            }
        },"thread1");
        Thread thread2 = new Thread(()->{
            synchronized (lock2){
                try {
                    Thread.sleep(1);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock1){
                    System.out.println("Lock acquired");
                }
            }
        },"thread2");
        thread1.start();
        thread2.start();
    }
}
