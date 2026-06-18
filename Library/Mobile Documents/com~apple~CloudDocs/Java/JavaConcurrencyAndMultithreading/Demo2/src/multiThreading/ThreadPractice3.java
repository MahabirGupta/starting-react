package multiThreading;

public class ThreadPractice2 extends Thread {

    public ThreadPractice2(String name) {
        super(name);
    }

    @Override
    public void run() {

        try {
            Thread.sleep(1000);
            System.out.println("Thread is running!");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted " + e);
        }
    }

    public static void main(String[] args) {
        ThreadPractice2 threadPractice = new ThreadPractice2("AnishThread");
        threadPractice.start();
        threadPractice.interrupt();

    }
}
