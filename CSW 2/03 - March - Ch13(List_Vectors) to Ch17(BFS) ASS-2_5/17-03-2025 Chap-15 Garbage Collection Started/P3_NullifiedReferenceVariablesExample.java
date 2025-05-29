public class P3_NullifiedReferenceVariablesExample {
	private String myObject;
	public P3_NullifiedReferenceVariablesExample(String myObject)
	{
		this.myObject = myObject;
	}
	public static void main(String args[])
	{
		P3_NullifiedReferenceVariablesExample testObject1 = new P3_NullifiedReferenceVariablesExample("Test Object1 P3");
		// Setting testObject1 to Null will qualify it for the garbage collection
		testObject1 = null;
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