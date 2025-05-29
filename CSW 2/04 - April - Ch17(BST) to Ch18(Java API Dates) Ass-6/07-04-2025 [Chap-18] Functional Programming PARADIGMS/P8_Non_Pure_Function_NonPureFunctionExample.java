public class P8_Non_Pure_Function_NonPureFunctionExample {
	private int x = 0;
	public int substract(int value) {
		this.x -= value;
		return this.x;
	}
	public static void main(String[] args) {
		P8_Non_Pure_Function_NonPureFunctionExample example = new P8_Non_Pure_Function_NonPureFunctionExample();
		System.out.println("First Substraction Result: "+example.substract(5));
		System.out.println("Second Substraction Result: "+example.substract(3));
	}
}