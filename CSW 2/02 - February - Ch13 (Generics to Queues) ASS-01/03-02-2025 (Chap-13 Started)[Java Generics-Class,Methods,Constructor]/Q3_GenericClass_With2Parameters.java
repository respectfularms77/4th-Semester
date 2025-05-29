class Test2 {
	public<T,U> void show(T x,U y) {
		System.out.println("FValue: "+x+"\tSvalue: "+y);
	}
}
public class Q3_GenericClass_With2Parameters {
    public static void main(String[] args) {
		Test2 ob=new Test2();
		ob.show(5,"Arpit");
	}
}