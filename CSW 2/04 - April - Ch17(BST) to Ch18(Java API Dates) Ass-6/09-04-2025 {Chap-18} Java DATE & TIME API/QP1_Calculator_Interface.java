import java.util.*;
public class QP1_Calculator_Interface {
	interface Calculator {
		double calc(double a,double b);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 2 Values(1st Greater than 2nd and 2nd!=0): ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();

		//Adding Values
		Calculator ob1 = (x,y) -> a+b;
		System.out.println("Added Value is: "+ob1.calc(a,b));

		//Substracting Values
		Calculator ob2 = (x,y) -> a-b;
		System.out.println("Substracted Value is: "+ob2.calc(a,b));

		//Multiplying Values
		Calculator ob3 = (x,y) -> a*b;
		System.out.println("Multiplied Value is: "+ob3.calc(a,b));

		//Dividing Values
		Calculator ob4 = (x,y) -> (b!=0) ? a/b : Double.NaN;		//Handling Error BY 0
		System.out.println("Divided Value is: "+ob4.calc(a,b));
		sc.close();
	}
}