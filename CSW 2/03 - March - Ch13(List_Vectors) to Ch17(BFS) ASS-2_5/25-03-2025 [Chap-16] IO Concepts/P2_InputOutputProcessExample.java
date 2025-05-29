import java.util.Scanner;
public class P2_InputOutputProcessExample {
	public static void main(String args[]) {
		// Following code will create sc object of Scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the name of the student: ");
		// Below line of code ensures that data will be input as string by default
		String studentNAME = sc.nextLine();
		
		System.out.print("Enter the roll number of the student: ");
		// Below line of code ensures that data will be input as int by default
		int studentRollNumber = sc.nextInt();
		
		System.out.print("Enter the marks that the student obtained: ");
		// Below line of code ensures that data will be input as float by default
		float studentMarks = sc.nextFloat();
		
		
		System.out.println("-------Student Report Card-------");
		System.out.println("Student Name:" + studentNAME);
		System.out.println("Student Roll No.:" + studentRollNumber);
		System.out.println("Student Marks:" + studentMarks);
		// Following code is needed to avoid resource leak
		sc.close();
	}
}