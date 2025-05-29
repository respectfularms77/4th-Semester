import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class P7_Concurrency_Starvation_Example {
    private final Lock lock = new ReentrantLock(true); // fair lock
    public void accessResource() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " accessed resource.");
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        P7_Concurrency_Starvation_Example example = new P7_Concurrency_Starvation_Example();
        Runnable task = example::accessResource;
        // Create multiple threads with different priorities to demonstrate starvation
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);
        Thread t4 = new Thread(task);

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}