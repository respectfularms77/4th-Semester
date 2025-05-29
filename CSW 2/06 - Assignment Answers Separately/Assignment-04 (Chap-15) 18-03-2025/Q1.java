class UnreachableObject {
    String name;
    public UnreachableObject(String name) {
        this.name = name;
    }
    public void show() {
        UnreachableObject obj1 = new UnreachableObject("Object1");
        display();
    }
    public void display() {
        UnreachableObject obj2 = new UnreachableObject("Object2");
    }
    protected void finalize() throws Throwable {
        System.out.println(name + " is being collected as garbage.");
    }
}
public class Q1 {
	public static void main(String[] args) {
        UnreachableObject obj = new UnreachableObject("Main Object");
        obj.show();
        obj = null;
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End of main method.");
    }
}