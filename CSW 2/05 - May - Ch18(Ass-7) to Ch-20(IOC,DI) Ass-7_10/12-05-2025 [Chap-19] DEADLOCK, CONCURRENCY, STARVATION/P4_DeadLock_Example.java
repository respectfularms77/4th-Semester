public class P4_DeadLock_Example {
    public static void main(String args[] ){
        final String resource1 = "Resource 1";
        final String resource2 = "Resource 2";
        Thread t1 = new Thread(() ->  {
            synchronized (resource1) {
                System.out.println("Thread 1: Loading Resource 1");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (resource2) {
                    System.out.println("Thread 1: Locked Resource 1 ");
                }
            }
        });

        Thread t2 = new Thread(() ->  {
            synchronized (resource2) {
                System.out.println("Thread 2: Loading Resource 1");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (resource1) {
                    System.out.println("Thread 2: Locked Resource 1 ");
                }
            }
        });
        t1.start();
        t2.start();
    }
}