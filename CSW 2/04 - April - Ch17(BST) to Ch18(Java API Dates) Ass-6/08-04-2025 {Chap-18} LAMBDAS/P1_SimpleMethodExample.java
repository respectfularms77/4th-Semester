public class P1_SimpleMethodExample {
	public void printDemo(String text) {
		System.out.println(text);
	}
	public static void main(String[] args) {
		P1_SimpleMethodExample sm = new P1_SimpleMethodExample();
		String simpletext = "A Simple String";
		sm.printDemo(simpletext);
	}
}