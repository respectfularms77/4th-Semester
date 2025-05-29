public class P4_First_Class_Function_FirstClassExample {
	public static void main(String[] args) {
		java.util.function.IntBinaryOperator add = (a,b) -> a+b;
		System.out.println("Addition Result P2: "+add.applyAsInt(5, 30));
	}
}