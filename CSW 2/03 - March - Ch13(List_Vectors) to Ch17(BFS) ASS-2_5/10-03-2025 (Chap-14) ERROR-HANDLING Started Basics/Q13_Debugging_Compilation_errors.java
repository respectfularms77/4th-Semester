/** Debugging compilations: WAp full of mixed errors- a combination of
 * logical errors, syntax errors(missing imports, Capilization) and semantic 
 * error and specify them with required comment line **/

 public class Q13_Debugging_Compilation_errors {
	public static void main(String[] args) {
		//Logical error
		int a = 5 ; int b = 10;
		int multiplication = a * b;
		System.out.println("Addition " +multiplication);
		
		//Syntax ERROR
		Scanner sc = new Scanner(System.in);
		SYstem.out.println("Enter a number ");
		int number =  sc.nextInt();
		
		//Semantic error
		if(number % 2 == 1) {
			System.out.println("THe number is divisibl by 2");
		}
		
		float f = 10.5f;
		int i = (int)f;
		
		
		sc.close();
	}
}