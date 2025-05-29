public class UnreachableObjectsExample_P1 {
	private String myObject;
	public static void main(String args[])
	{
		// Executing testMethod1 method
		testMethod1();
		// Requesting garbage collection
		System.gc();
		//Adding a delay to give gc time to execute 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public UnreachableObjectsExample_P1(String myObject)
	{
		this.myObject = myObject;
	}
	private static void testMethod1()
	{
		// After existing testMethod1(), the object myObjectTest1 becomes unreachable
		UnreachableObjectsExample_P1 myObjectTest1 = new UnreachableObjectsExample_P1("My Object Test1 P1");
		testMethod2();
	}
	private static void testMethod2()
	{
		// After existing testMethod2(), the object myObjectTest2 becomes unreachable
		UnreachableObjectsExample_P1 myObjectTest2 = new UnreachableObjectsExample_P1("My Object Test2 P1");
	}
	@Override
	protected void finalize() throws Throwable
	{
		// following line will confirm the garbage collected method name
		System.out.println("Garbage collection is succcessful for " + this.myObject);
	}
}