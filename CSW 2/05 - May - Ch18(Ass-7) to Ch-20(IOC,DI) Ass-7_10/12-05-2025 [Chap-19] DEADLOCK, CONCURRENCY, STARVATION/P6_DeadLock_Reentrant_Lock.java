import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class P6_DeadLock_Reentrant_Lock {
    private final Lock lock1 = new ReentrantLock();
    public void print() {
        lock1.lock();
        try {
            System.out.println(Thread.currentThread().getName()+" Locked.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock1.unlock();
            System.out.println(Thread.currentThread().getName()+" Unlocked.");
        }
    }
    public static void main(String args[]){
        P6_DeadLock_Reentrant_Lock example = new P6_DeadLock_Reentrant_Lock();
        Runnable task = example::print;
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
    }
}