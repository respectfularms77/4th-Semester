public class ReassigningReferenceExample_P2 {
	private String myObject;
	public ReassigningReferenceExample_P2(String myObject)
	{
		this.myObject = myObject;
	}
	public static void main(String args[])
	{
		ReassigningReferenceExample_P2 testObject1 = new ReassigningReferenceExample_P2("Test Object1 P2");
		ReassigningReferenceExample_P2 testObject2 = new ReassigningReferenceExample_P2("Test Object2 P2");
		// testObject1 now refers to testObject2
		testObject1 = testObject2;
		// Requesting garbage collection
		System.gc();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Override
	protected void finalize() throws Throwable
	{
		// following line will confirm the garbage collected method name
		System.out.println("Garbage collection is succcessful for " + this.myObject);
	}
}