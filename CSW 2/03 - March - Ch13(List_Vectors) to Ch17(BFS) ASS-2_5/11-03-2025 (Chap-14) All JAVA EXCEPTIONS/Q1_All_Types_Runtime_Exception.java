import java.util.*;
public class Q1_All_Types_Runtime_Exception {
	public static void demonstratesIllegalArgumentException() throws IllegalArgumentException {
        throw new IllegalArgumentException("Throws IllegalArgumentException");
    }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*ArithmeticException*/
		try {
			System.out.print("Enter a Number: ");
			int n = sc.nextInt();
			System.out.println("Division 10 by that number: "+(10/n));;
		}catch (ArithmeticException e) {
			System.out.println("Division by Zero: "+e.getMessage());
		}
		
		
		/*ArrayIndexOutOfBoundsException*/
		try {
			System.out.print("Enter a Number for array(length - 10): ");
			int[] ar = {1,2,3,4,5,6,7,8,9,0};
			int n = sc.nextInt();
			System.out.println("Array at index "+n+" is: "+ar[n]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index exceeded the length of Array: "+e.getMessage());
		}
		
		
		/*NullPointerException*/
		try {
			System.out.print("Enter a Number for array(length - 0): ");
			int[] ar = null;
			int n = sc.nextInt();
			System.out.println("Array at index "+n+" is: "+ar[n]);
		} catch (NullPointerException e) {
			System.out.println("Array is of length - 0: "+e.getMessage());
		}
		
		
		/*NumberFormatException*/
		try {
			System.out.print("Enter a String to convert it to Number: ");
			String a = sc.next();
			System.out.println("String to Integer: "+Integer.valueOf(a));
		} catch (NumberFormatException e) {
			System.out.println("Can only convert digits: "+e.getMessage());
		}
		
		
		/*Runtime Exception  or UnsupportedOperationException*/
		try {
			List<String> unmodifiableList = java.util.Collections.emptyList();
			unmodifiableList.add("Item");
		}		catch(UnsupportedOperationException e) {
			System.out.println("UnsupportedOperationException: "+e.getMessage());
		}
		
		
		
		/*StringIndexOutOfBoundsException*/
		try {
			System.out.print("Enter a Number to get a character from String - \"Mississippi\": ");
			int a = sc.nextInt();
			System.out.println("Character is: "+"Mississippi".charAt(a));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Doesn\'t have that Length: "+e.getMessage());
		}
		
		
		/* IllegalArgumentException*/
        try {
        	demonstratesIllegalArgumentException();
        }		catch(IllegalArgumentException e){
        	System.out.println("Error is: "+e.getMessage());
        }
		
		
		/*IllegalStateException*/
		//...
		
		sc.close();		
	}
}