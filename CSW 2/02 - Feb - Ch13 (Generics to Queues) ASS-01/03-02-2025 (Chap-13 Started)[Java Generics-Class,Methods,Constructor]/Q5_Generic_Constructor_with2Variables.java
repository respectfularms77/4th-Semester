class Test4 {
	public<T,U> Test4(T x,U y) {
		System.out.println("Value is: "+x+"\tHis BMI is: "+y);
	}
}
public class Q5_Generic_Constructor_with2Variables {
    public static void main(String[] args) {
		Test4 ob=new Test4("Arkan Sulik",21.6);
	}
}