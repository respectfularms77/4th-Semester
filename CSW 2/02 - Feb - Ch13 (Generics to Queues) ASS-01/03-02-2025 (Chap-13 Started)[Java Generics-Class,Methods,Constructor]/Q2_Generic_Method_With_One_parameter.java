class Test1 {
	public<T> void show(T x) {
		System.out.println("Value: "+x);
	}
}
public class Q2_Generic_Method_With_One_parameter{
    public static void main(String[] args) {
		Test1 ob=new Test1();
		ob.show(5);
		ob.show("Arpit");
	}
}