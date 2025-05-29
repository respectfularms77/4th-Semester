public class P5_DeadLock_General_Solution {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();
    public void method1() {
        synchronized (lock1) {
            try { Thread.sleep(50); } catch (InterruptedException e) {}
            synchronized (lock2) {
                System.out.println("Method - 1");
            }
        }
    }
    public void method2() {
        synchronized (lock1) {                          //Note the Order of Locks
            try { Thread.sleep(50); } catch (InterruptedException e) {}
            synchronized (lock2) {              
                System.out.println("Method - 2");
            }
        }
    }

    public static void main(String args[]){
        P5_DeadLock_General_Solution example = new P5_DeadLock_General_Solution();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                example.method1();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                example.method2();
            }
        });
        t1.start();
        t2.start();
    }
}