public class Q11_Scoping_Error {
	public void vara() {
		static int a=5;
		System.out.println(a);
	}
	public static void main(String[] args) {
		Q11_Scoping_Error b = new Q11_Scoping_Error();
		b.vara();
	}
}