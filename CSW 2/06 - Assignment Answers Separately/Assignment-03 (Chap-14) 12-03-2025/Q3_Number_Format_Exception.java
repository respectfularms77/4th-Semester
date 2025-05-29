import java.util.*;
public class Q3_Number_Format_Exception {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			try {
				System.out.print("Enter a String to convert it to Number: ");
				String a = sc.next();
				System.out.println("String to Integer: "+Integer.parseInt(a));
				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input! Please enter only numeric values.");
			}
		}
		sc.close();
	}
}



/*import java.util.*;
public class Q3_Number_Format_Exception {
	public static void num(String s) throws NumberFormatException {
		System.out.println("String to Integer: "+Integer.parseInt(s));
	}

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			try {
				System.out.print("Enter a String to convert it to Number: ");
				String a = sc.next();
				num(a);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input! Please enter only numeric values.");
			}
		}
		sc.close();
	}
} */