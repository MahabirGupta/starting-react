package multiThreading;

public class ThreadPractice1 extends Thread {

    public ThreadPractice1(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread is running!");
        for (int i = 0; i <=5 ; i++) {
            String a ="";
            for (int j = 0; j < 10000; j++) {
                a+="a";
            }

            System.out.println(Thread.currentThread().getName()+" - Priority: " + Thread.currentThread().getPriority()
            + " count: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        ThreadPractice1 threadPractice = new ThreadPractice1("AnishThread");
        ThreadPractice1 lowPriorirty = new ThreadPractice1("MahabirThread");
        ThreadPractice1 medPriorirty = new ThreadPractice1("AnishkaaThread");
        ThreadPractice1 highPriorirty = new ThreadPractice1("BabitaThread");

        threadPractice.setPriority(Thread.MIN_PRIORITY);
        lowPriorirty.setPriority(Thread.MIN_PRIORITY);
        medPriorirty.setPriority(Thread.NORM_PRIORITY);
        highPriorirty.setPriority(Thread.MAX_PRIORITY);

        threadPractice.start();
        lowPriorirty.start();
        medPriorirty.start();
        highPriorirty.start();

        try {
            threadPractice.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello");

    }
}
