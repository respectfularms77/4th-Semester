import java.util.Arrays;
public class P2_Declarative_Programming_Paradigm_Main {
	public static void main(String[] args) {
		int[] array = new int[] {1,2,3,4,5};
		int[] evenarray = Arrays.stream(array)
				.filter(a -> a%2==0)
				.toArray();
		System.out.println(Arrays.toString(evenarray));
	}
}