package multiThreading;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
   private Queue<Integer> queue;
   private int capacity;

    public BlockingQueue( int capacity) {
        queue=new LinkedList<>();
        this.capacity = capacity;
    }
    public boolean add(int item){
//        use the object of the Queue class as the lock
        synchronized (queue){
            while (queue.size()==capacity){
                try {
                    queue.wait();// relinquishes the lock while waiting
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            queue.add(item);
            queue.notifyAll(); // notify all the threads that is waiting for removeable
            return true;
        }

    }
    public int remove(){
        //        use the object of the Queue class as the lock
        synchronized (queue){
            while (queue.size()==0){
                try {
                    queue.wait(); // relinquishes the lock while waiting
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            int element = queue.poll();
            queue.notifyAll(); // notify all the threads that is waiting for adding
            return element;
        }

    }
}
