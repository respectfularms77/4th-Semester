public class P2_Lambda_Functional_Interface_Example {
	interface PrintText {
		void print(String value);
	}
	public void printLambdaText(String text, PrintText printer) {
		printer.print(text);
	}
	public static void main(String[] args) {
		P2_Lambda_Functional_Interface_Example obj = new P2_Lambda_Functional_Interface_Example();
		String text = "Understanding Lambdas";
		PrintText printer = (String msg) -> System.out.println(msg);
		obj.printLambdaText(text, printer);
	}
}