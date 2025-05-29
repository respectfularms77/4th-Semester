import java.util.function.Function;
public class Q5_Function_Returning_Function {
    public static Function<Integer, Integer> getSquareFunction() {          //<Input - Integer, Output - Integer>
        // Method that returns a lambda function (square calculator)
        return x -> x * x;                                                  // Lambda: takes x, returns x*x
    }
    public static void main(String[] args) {
        // Retrieve the returned function
        Function<Integer, Integer> squareFunction = getSquareFunction();

        System.out.println("Square of 5: " + squareFunction.apply(5));
    }
}