import java.util.*;
public class P1_IOExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		String n = sc.nextLine();
		System.out.println("Name is: "+n+" Welcome to Java IO");
		System.err.println("This is an Error Message");
		sc.close();
	}
}