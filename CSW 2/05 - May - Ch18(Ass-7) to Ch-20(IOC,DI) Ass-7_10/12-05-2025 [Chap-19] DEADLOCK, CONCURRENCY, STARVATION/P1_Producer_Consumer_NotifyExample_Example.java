class SharedResource {
    private boolean available = false;
    public synchronized void produce() throws InterruptedException {
        while (available) {
            wait();                 //Wait until the Resource is consumed
        }
        System.out.println("Produced an Item. ");
        available = true;        //Set the Resource as available
        notify();                //Notify a single Waiting Thread (consumer)
        //notifyAll();           //Optionally, Notify all Waiting Threads
    }

    public synchronized void consume() throws InterruptedException {
        while (!available) {
            wait();                 //Wait until the Resource is produced
        }
        System.out.println("Consumed an Item. ");
        available = false;       //Set the Resource as consumed
        notify();                //Notify a single Waiting Thread (producer)
        //notifyAll();           //Optionally, Notify all Waiting Threads
    }
}

public class P1_Producer_Consumer_NotifyExample_Example {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread producerThread = new Thread(() -> {
            try {
                for(int i=0;i<5;i++){
                    sharedResource.produce();
                    Thread.sleep(60); // Simulate time taken to produce
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                for(int i=0;i<5;i++){
                    sharedResource.consume();
                    Thread.sleep(60); // Simulate time taken to produce
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}