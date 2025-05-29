import java.util.*;
public class Q6_MemoryIntensiveApp {
    private int[] largeArray;
    public Q6_MemoryIntensiveApp(int size) {
        this.largeArray = new int[size]; 
    }
    public static void printMemoryUsage(Runtime runtime) {
        System.out.println("Total heap memory: " + runtime.totalMemory());
        System.out.println("Free heap memory: " + runtime.freeMemory());
        System.out.println("Used memory: " + (runtime.totalMemory() - runtime.freeMemory()));
        System.out.println("-".repeat(20));
    }
    public static void main(String[] args) {
        // Get Runtime instance
        Runtime runtime = Runtime.getRuntime();
        // List to hold objects and increase memory usage (Without <> operator)
        List<Q6_MemoryIntensiveApp> objectList = new ArrayList<Q6_MemoryIntensiveApp>();
        System.out.println(new Date() + " Starting memory-intensive task...");
        printMemoryUsage(runtime);
        // Create a large number of objects to fill up heap (Without underscore)
        for (int i = 0; i < 50000; i++) { // Adjust count based on system capacity
            objectList.add(new Q6_MemoryIntensiveApp(10000)); // Remove underscore
            if (i % 10000 == 0) { // Remove underscore
                System.out.println(new Date() + " Created" + i + " objects");
                printMemoryUsage(runtime);
            }
        }
        System.out.println(new Date() + " - Finished object creation. Now clearing memory...");
        printMemoryUsage(runtime);
        // Clear the list to make objects eligible for garbage collection
        objectList.clear();
        System.gc();
        // Explicitly request garbage collection
        // Pause to allow garbage collection
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();        }
        System.out.println(new Date() + " - After garbage collection: ");
        printMemoryUsage(runtime);
    }
}