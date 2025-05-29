class SynchorinizedCounter {
    private int count = 0;
    public synchronized void increment() {
        // synchronized(this) {
        count++;
        // }
    }
    public synchronized int getCount() {        return count;    }
}
public class P3_SyncExample_SYNCCOUNTER extends Thread {
    private SynchorinizedCounter counter;
    public P3_SyncExample_SYNCCOUNTER(SynchorinizedCounter counter) {
        this.counter = counter;
    }
    public void run() {
        for(int i=0; i<1000; i++) {
            counter.increment();
        }
    }
    public static void main(String args[]) throws InterruptedException {
        SynchorinizedCounter counter = new SynchorinizedCounter();
        Thread t1 = new P3_SyncExample_SYNCCOUNTER(counter);
        Thread t2 = new P3_SyncExample_SYNCCOUNTER(counter);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final count: " + counter.getCount());
    }
}