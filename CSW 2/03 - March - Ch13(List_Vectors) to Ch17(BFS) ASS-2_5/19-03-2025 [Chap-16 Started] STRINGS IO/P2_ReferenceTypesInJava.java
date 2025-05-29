import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

class Employee {
	private int id;
	private String name;
	public Employee(int id,String nm) {		this.id=id;		name=nm;	}
	public String toString() {		return "Name: "+name+" & ID: "+id;	}
}

public class P2_ReferenceTypesInJava {
	public static void main(String[] args) {
		Employee emp = new Employee(31,"Arpit");
		emp = null;
		System.out.println(emp);
		System.out.println();
		PhantomRefer();
		System.out.println();
		SoftRefer();
		System.out.println();
		WeakRefer();
		System.out.println();
	}
	public static void PhantomRefer() { 
		Employee emp = new Employee(31,"Arpit");
		ReferenceQueue<Employee> refq = new ReferenceQueue<>();
		PhantomReference<Employee> phan = new PhantomReference<>(emp,refq);
		System.out.println(phan.get());
	}
	public static void SoftRefer() {
		Employee emp = new Employee(31,"Arpit");
		SoftReference<Employee> soft = new SoftReference<>(emp);
		System.out.println(emp);
		System.out.println(soft.get());
		emp = null;
		System.gc();
		System.out.println(soft.get());
	}
	public static void WeakRefer() {
		Employee emp = new Employee(31,"Arpit");
		WeakReference<Employee> weak = new WeakReference<>(emp);
		System.out.println(emp);
		System.out.println(weak.get());
		emp = null;
		System.gc();
		System.out.println(weak.get());
	}
}