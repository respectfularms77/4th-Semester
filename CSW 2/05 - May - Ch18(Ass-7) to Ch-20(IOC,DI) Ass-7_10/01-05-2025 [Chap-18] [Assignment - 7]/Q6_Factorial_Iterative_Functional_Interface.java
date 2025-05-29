import java.util.function.Function;
public class Q6_Factorial_Iterative_Functional_Interface {

    // Method returning a lambda that computes factorial iteratively
    public static Function<Integer, Integer> getFact() {
        return (n) -> {
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        };
    }
    public static void main(String[] args) {
        Function<Integer, Integer> factorial = getFact();
        System.out.println("Factorial of 5: " + factorial.apply(5));
    }
}