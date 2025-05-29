import java.util.*;
class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}
public class Q8_CustomCheckedException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Age:  ");
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new CustomCheckedException("Age must be 18 or above to proceed.");
            }
            System.out.println("Access granted! Age is valid.");
        } catch (CustomCheckedException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }   finally {
            sc.close();
        }
    }
}