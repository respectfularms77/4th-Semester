class DataObject {
    private int intValue;       private double doubleValue;

    public DataObject(int iv, double dv) {
        intValue = iv;              doubleValue = dv;
    }

    public void updateValues(int intValue, double doubleValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
    }

    public void printValues() {
        System.out.println("Integer Value: " + intValue + " & Double Value: " + doubleValue);
    }

    protected void finalize() {
        System.out.println("Object's Garbage has been collected");
    }
}
public class Q5 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        System.out.println("Initial memory usage:");
        long initialMemory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Total Memory: " + runtime.totalMemory() + " bytes");
        System.out.println("Used Memory: " + initialMemory + " bytes\n");

        DataObject obj1 = new DataObject(10, 10.5);
        DataObject obj2 = new DataObject(20, 20.5);

        obj1.printValues();
        obj2.printValues();

        obj1.updateValues(25, 25.5);
        System.out.println();
        obj2.updateValues(30, 30.5);

        obj1.printValues();
        obj2.printValues();

        obj1 = null;
        obj2 = null;

        System.gc();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nFinal Memory usage after making objects unreachable and requesting garbage collection:");

        long finalMemory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Total Memory: " + runtime.totalMemory() + " bytes");
        System.out.println("Used Memory: " + finalMemory + " bytes");

        System.out.println("Memory freed: " + (initialMemory - finalMemory) + " bytes");
    }
}