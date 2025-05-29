import java. util.concurrent. ExecutorService;
import java. util.concurrent. Executors;
class WorkerThread implements Runnable {
    private String command;
    public WorkerThread(String s) {
        this.command = s;
    }
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start. Command = " + command);
        processCommand();
        System.out.println(Thread.currentThread().getName() + " End.");
    }
    private void processCommand() {
        try {            Thread.sleep(2);        } 
        catch (InterruptedException e) {            System.err.println(e);        }
    }
}
public class P2_Executor_Service_Example {
    public static void main(String[] args) {
        // Create a thread pool with a fixed number of threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Submit tasks to the executor service
        for (int i = 0; i < 5; i++) {
            Runnable worker = new WorkerThread(" "+i);
            executorService.execute(worker);
        }
        executorService.shutdown();
        while(!executorService.isTerminated()) {
            System.out.println("Finished all threads.");
        }
    }
}