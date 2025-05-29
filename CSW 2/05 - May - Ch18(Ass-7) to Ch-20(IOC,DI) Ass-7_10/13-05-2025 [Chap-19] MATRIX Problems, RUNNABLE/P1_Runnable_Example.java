import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class P1_Runnable_Example implements Runnable {
    private long counter;
    // Constructor to initialize the counter
    public P1_Runnable_Example(long counter) {
        this.counter = counter;
    }

    public static void main(String[] args) {
        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(new P1_Runnable_Example(1000));
    }

    @Override
    public void run() {
        long total = 0;
        for (long i = 1; i < counter; i++) {
            total += i;
        }
        System.out.println("Sum from 1 to " + (counter - 1) + " is: " + total);
    }
}