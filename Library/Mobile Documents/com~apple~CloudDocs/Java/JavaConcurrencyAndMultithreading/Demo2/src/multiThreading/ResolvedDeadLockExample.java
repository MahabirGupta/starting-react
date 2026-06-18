package multiThreading;


public class DeadLockExample {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();
        Thread thread1=new Thread(new Task1(pen,paper),"Anish");
        Thread thread2=new Thread(new Task2(pen,paper),"Mahabir");
        thread1.start();
        thread2.start();
    }
}
//class Pen{
//    public synchronized void writeWithPenAndPaper(Paper paper){
//        System.out.println(Thread.currentThread().getName()+" is using pen "+this+" and trying to acquire paper");
//        paper.finishWriting();
//    }
//    public synchronized void finishWriting(){
//        System.out.println(Thread.currentThread().getName()+ " finished using pen " + this);
//    }
//
//}
class Pen {

    public synchronized void writeWithPenAndPaper(Paper paper) {

        System.out.println(
                Thread.currentThread().getName()
                        + " acquired Pen"
        );

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(
                Thread.currentThread().getName()
                        + " waiting for Paper"
        );

        paper.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(
                Thread.currentThread().getName()
                        + " finished using Pen"
        );
    }
}
//class Paper{
//    public synchronized void writeWithPaperAndPen(Pen pen){
//        System.out.println(Thread.currentThread().getName()+" is using paper " + this+" and trying to acquire pen");
//        pen.finishWriting();
//    }
//
//    public synchronized void finishWriting() {
//        System.out.println(Thread.currentThread().getName()+ " finished using paper " + this);
//    }
//
//}
class Paper {

    public synchronized void writeWithPaperAndPen(Pen pen) {

        System.out.println(
                Thread.currentThread().getName()
                        + " acquired Paper"
        );

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(
                Thread.currentThread().getName()
                        + " waiting for Pen"
        );

        pen.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(
                Thread.currentThread().getName()
                        + " finished using Paper"
        );
    }
}
class Task1 implements Runnable{
private Pen pen;
private Paper paper;

    public Task1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
    pen.writeWithPenAndPaper(paper); // thread1 locks pen and tries to lock paper
    }
}
class Task2 implements Runnable{
    private Pen pen;
    private Paper paper;

    public Task2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }
    @Override
    public void run() {
    paper.writeWithPaperAndPen(pen); // thread2 locks paper and tries to lock pen
    }
}
