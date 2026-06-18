package multiThreading;

public class ThreadPractice3 extends Thread {

    public ThreadPractice3(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
//            give other Thread a chance
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        ThreadPractice3 threadPractice = new ThreadPractice3("AnishThread");
        ThreadPractice3 threadPractice1 = new ThreadPractice3("MahabirThread");
        threadPractice.start();
        threadPractice1.start();

    }
}
