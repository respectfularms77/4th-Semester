public class P7_Pure_Function_PureFunctionExample {
	public int substract(int x,int y) {				//Pure Function that substract 2 Numbers
		return x-y;								//No Side Effects,only depends on inputs
	}
	public static void main(String[] args) {
		P7_Pure_Function_PureFunctionExample example = new P7_Pure_Function_PureFunctionExample();
		System.out.println("Substraction Example: "+example.substract(10,5));
	}
}