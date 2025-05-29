public class P3_Higher_Order_Functions_HigherOrderExample {
	public static int operate(int a,int b, java.util.function.IntBinaryOperator operator) {
		return operator.applyAsInt(a,b);
	}
	public static void main(String[] args) {
		int result = operate(5,20,(a,b) -> a+b);				//Lambda Passed as Argument
		System.out.println("Addition Result: "+result); 		//Output: 15
	}
}