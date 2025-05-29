public class P5_Function_Interface_Main {
	public static void main(String[] args) {
		A a = new A();
		MarksFunction marksfunction = a.A(100);	//Call the A method which returns a function
		marksfunction.printMarks(); 			//Call the returned Function
	}
}
interface MarksFunction {
	void printMarks();
}
class A {										//Anonymous Class
	public MarksFunction A(int total) {			
		return new MarksFunction() {
			public void printMarks() {
				System.out.println("Maths: 95");
				System.out.println("Science: 100");
				System.out.println("English: 98");
			}
		};
	}
}