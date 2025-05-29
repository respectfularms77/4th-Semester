import java.util.*;			//ArrayList,Collections
public class Test_MainClass_COMPAREBLE {
	public static void main(String[] args) {
		ArrayList<Student_WithoutMainClass_COMPAREBLE> arr=new ArrayList<Student_WithoutMainClass_COMPAREBLE>();
		arr.add(new Student_WithoutMainClass_COMPAREBLE("Arpit",22,"986181",90.8));
		arr.add(new Student_WithoutMainClass_COMPAREBLE("Sita",21,"988981",92.8));
		System.out.println("Before Sorting: ");
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println("After Sorting: ");
		System.out.println(arr);
	}
}