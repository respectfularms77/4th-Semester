import java.util.*;
public class Test_MainClass_COMPARETOR {
    public static void main(String[] args) {
		ArrayList<Student_WithoutMainClass_COMPARETOR> arr=new ArrayList<Student_WithoutMainClass_COMPARETOR>();
		arr.add(new Student_WithoutMainClass_COMPARETOR("Arpit",22,"986181",90.8));
		arr.add(new Student_WithoutMainClass_COMPARETOR("Sita",21,"988981",92.8));
		System.out.println("Before Sorting(of any Kind): ");
		System.out.println(arr);
		
		//Collections.sort(arr);
		
		Collections.sort(arr,new Roll());
		System.out.println("\nAfter Sorting by Roll Number: \n"+arr);
		
		Collections.sort(arr,new Name());
		System.out.println("\nAfter Sorting by Name: \n"+arr);
	}
}