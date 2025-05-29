import java.util.*;
public class Q9_InputMismatchException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int n = sc.nextInt();  // May throw InputMismatchException
            System.out.println("You entered: " + n);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        } finally {
            sc.close();
        }
    }
}