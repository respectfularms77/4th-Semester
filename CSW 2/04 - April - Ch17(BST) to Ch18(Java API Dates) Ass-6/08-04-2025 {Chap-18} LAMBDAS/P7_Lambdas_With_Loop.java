import java.util.*;
public class P7_Lambdas_With_Loop {
	public static void main(String[] args) {
		List<Integer> student1 = Arrays.asList(50,60,70,80,90);
		System.out.print("Marks of Student 1: ");
		student1.forEach(mark -> System.out.print(mark+" "));	//Lambda Reference
		List<Integer> student2 = Arrays.asList(90,80,70,60,50);
		System.out.print("\nMarks of Student 2: ");
		student2.forEach(System.out::println);				//Method Reference
	}
}