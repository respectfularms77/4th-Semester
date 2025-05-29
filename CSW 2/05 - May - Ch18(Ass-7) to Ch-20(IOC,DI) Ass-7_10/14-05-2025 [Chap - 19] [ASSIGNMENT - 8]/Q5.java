public class Q5 {
    static final Object lock = new Object();
    static boolean isOddTurn = true;
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 1; i <= 10; i += 2) {
                synchronized (lock) {
                    while (!isOddTurn)
                        try {
                            lock.wait();
                        } catch (Exception e) {
                        }
                    System.out.println("Odd: " + i);
                    isOddTurn = false;
                    lock.notify();
                }
            }
        }).start();
        new Thread(() -> {
            for (int i = 2; i <= 10; i += 2) {
                synchronized (lock) {
                    while (isOddTurn)
                        try {
                            lock.wait();
                        } catch (Exception e) {
                        }
                    System.out.println("Even: " + i);
                    isOddTurn = true;
                    lock.notify();
                }
            }
        }).start();
    }
}