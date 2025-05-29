class ReassigningReference {
	String name;
	public ReassigningReference(String nm) {
		this.name = nm;
	}
	
	protected void finalize() {
		System.out.println("Garbage collected From: " + name);
	}
}
public class Q2 {
	public static void main(String[] args) {
		ReassigningReference obj1 = new ReassigningReference("Object 1");
		ReassigningReference obj2 = new ReassigningReference("Object 2");
		// Reassigning obj1 to obj2, making the first Object1 eligible for garbage collection
        obj1 = obj2;

        // Explicitly invoking garbage collector
        System.gc();
		try {
			Thread.sleep(500); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("End of main method.");
	}
}