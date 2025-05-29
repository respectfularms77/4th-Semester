
class Test<T> {
	public void show(T x) {
		System.out.println("Value: "+x);
	}
}
public class Q1_Basic_Generic_Class {
	public static void main(String[] args) {
		Test<Integer> ob=new Test<>();
		ob.show(5);
	}
}
