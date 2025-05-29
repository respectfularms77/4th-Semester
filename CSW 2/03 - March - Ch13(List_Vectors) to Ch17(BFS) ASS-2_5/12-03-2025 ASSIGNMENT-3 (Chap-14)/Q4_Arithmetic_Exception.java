import java.util.*;
public class Q4_Arithmetic_Exception{
    public static void sqrt(int n) {
		if (n<0)	throw new ArithmeticException("Number can't be Negative or Zero");
		System.out.println("Square Root of "+n+" is: "+Math.sqrt(n));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("Enter a Number: ");
			int n = sc.nextInt();
			sqrt(n);
		}   catch (ArithmeticException e) {
			System.out.println("Can't find the squareroot of Negative's: "+e.getMessage());
		}   finally {
            sc.close(); // Always close the scanner
        }
	}
}