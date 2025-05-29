import java.util.function.Function;
import java.util.Scanner;
public class QP2_Recursive_Lambda_Factorial {
    public static void main(String[] args) {
        // Recursive lambda using a helper interface
        Function<Integer, Integer> factorial = createRecursiveFactorial();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int number = sc.nextInt();
        int result = factorial.apply(number);
        System.out.println("Factorial of " + number + " is: " + result);
        sc.close();
    }
    // Higher-order function to simulate recursion
    public static Function<Integer, Integer> createRecursiveFactorial() {
        return new Function<>() {
            @Override
            public Integer apply(Integer n) {
                return n == 0 ? 1 : n * this.apply(n - 1);
            }
        };
    }
}