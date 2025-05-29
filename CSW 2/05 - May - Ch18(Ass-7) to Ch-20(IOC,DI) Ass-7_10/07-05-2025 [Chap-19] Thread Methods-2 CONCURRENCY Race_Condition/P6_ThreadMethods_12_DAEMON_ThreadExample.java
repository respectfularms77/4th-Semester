public class P6_ThreadMethods_12_DAEMON_ThreadExample extends Thread{
    public void run() {
        try {
            while (true) {
                System.out.println("Daemon thread is running...");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Daemon thread interrupted");
        }
    }
    public static void main(String[] args) {
        P6_ThreadMethods_12_DAEMON_ThreadExample t = new P6_ThreadMethods_12_DAEMON_ThreadExample();

        t.setDaemon(true);
        t.start();

        // After main ends, JVM exits and daemon thread dies
        try {
            Thread.sleep(2000);
            System.out.println("Main thread ends...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}




//M-2
/*public class P6_ThreadMethods_12_DAEMON_ThreadExample {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                while (true) {
                    System.out.println("Daemon Running...");
                    Thread.sleep(1000); // Sleep to simulate background work
                }
            } catch (InterruptedException e) {
                System.out.println("Daemon Interrupted");
            }
        });

        t.setDaemon(true);
        t.start();

        // After main ends, JVM exits and daemon thread dies
        try {
            Thread.sleep(2000);
            System.out.println("Main thread ends...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
*/