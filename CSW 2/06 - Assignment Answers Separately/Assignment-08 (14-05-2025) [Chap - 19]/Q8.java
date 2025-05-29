public class Q8 {
    static class Buffer {
        int value;        boolean empty = true;

        synchronized void put(int v) throws InterruptedException {
            while (!empty)                wait();
            value = v;
            empty = false;
            notify();
        }

        synchronized int get() throws InterruptedException {
            while (empty)                wait();
            empty = true;
            notify();
            return value;
        }
    }
    public static void main(String[] args) {
        Buffer b = new Buffer();
        new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    b.put(i);
                    System.out.println("Produced: " + i);
                }
            } catch (Exception e) {
            }
        }).start();
        new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Consumed: " + b.get());
                }
            } catch (Exception e) {
            }
        }).start();
    }
}