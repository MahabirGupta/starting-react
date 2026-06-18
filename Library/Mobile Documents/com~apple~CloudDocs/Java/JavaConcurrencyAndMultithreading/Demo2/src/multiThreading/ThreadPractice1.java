package multiThreading;

public class ThreadPractice extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running!");
        for (int i = 1; i <=5 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadPractice threadPractice = new ThreadPractice();
        threadPractice.start();
        try {
            threadPractice.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello");

    }
}
