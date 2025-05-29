public class P4_AnonymousObjectsGarbageCollectionExample {
	String myObject;
	public P4_AnonymousObjectsGarbageCollectionExample(String myObject)
	{
		this.myObject = myObject;
	}
	public static void main(String args[])
	{
		// Anonymous Object is being initialized without a reference id
		new P4_AnonymousObjectsGarbageCollectionExample("Test Object1 P4");
		// Requesting garbage collector to remove the anonymous object
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