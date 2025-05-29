class AnonymousObject {
	String name;
	public AnonymousObject (String nm) {
		name=nm;
	}
	public void finalize() {
		System.out.println("Object's Name: "+name);
	}
}
public class Q4 {
	public static void main(String[] args) {
		new AnonymousObject("Object 1(4)");
		System.gc();
		
		try {
            Thread.sleep(200); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println("End of Main Program(4).");
	}
}