import java.util.*;
public class Q5_NestedTryCatch_Arithmetic_NumberFormat_Exceptions {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("Enter a String to convert it to Number: ");
			String a = sc.next();
			System.out.println("String to Integer: "+Integer.parseInt(a));
			try {
				int n = Integer.valueOf(a);
				System.out.println("Divison 100 by that Number: "+100/n);
			}catch (ArithmeticException e) {
				System.out.println("Error: Cannot divide by zero!: "+e.getMessage());
			}
		}   catch (NumberFormatException e) {
			System.out.println("Invalid input! Please enter only numeric values.");
		}   finally {
            sc.close(); // Ensures scanner is closed
        }
	}
}