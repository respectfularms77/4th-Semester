class NullifiedReference {
	String name;
	public NullifiedReference(String nm) 	{			name = nm;		                        }
	public void finalize()					{	System.out.println("Object's Name: "+name);		}
}
public class Q3 {
	public static void main(String[] args) {
		NullifiedReference o1 = new NullifiedReference("Object 1(3)");
		o1 = null;
		System.gc();
		
		try {
			Thread.sleep(200); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End of Main Program(3).");
	}
}