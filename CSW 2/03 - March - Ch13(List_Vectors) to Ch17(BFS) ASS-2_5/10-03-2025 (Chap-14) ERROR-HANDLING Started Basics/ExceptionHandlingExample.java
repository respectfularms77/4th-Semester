/*Java Program: Write a java program that includes five exception handling keywords (try, catch, throw, throws and finally). 
Add multiple catch statements. Throws should be any method other than main() method.*/

import java.util.*;

public class ExceptionHandlingExample {
    public static void validateAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    // Method that declares an exception with throws
    static void riskyOperation() throws Exception {
        throw new Exception("This is a risky operation");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            // Calling a method that may throw an exception validateAge(age);
            // Division by zero exception
            int result = 10 / age;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("This block will execute no matter what");
        }

        try {
            // Using Throw to manually Throw an Exception
            throw new RuntimeException("This is a runtime exception");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
        try {
            // Using throws in method signature to declare exceptions riskyOperation():
            riskyOperation();
        } catch (Exception e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }
        sc.close();
    }
}

/*
 * Output:
 * Enter your age: 15
 * Result of division: 0
 * This block will execute no matter what
 * Caught RuntimeException: This is a runtime exception Caught exception in
 * main: This is a risky operation
 */