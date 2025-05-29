public class Basics_TestGarbage {
	public void finalize() {
		System.out.println("Object Garbage Collected");
	}
	public static void main(String[] args) {
		Basics_TestGarbage t1 = new Basics_TestGarbage();
		Basics_TestGarbage t2 = new Basics_TestGarbage();
		Basics_TestGarbage t3 = new Basics_TestGarbage();
		t1 = null;
		t2 = t3;
		System.gc();
	}
}