import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Q9_Simple_Interest_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Step 1: Getting user input
        System.out.print("Enter the initial amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter start date (yyyy-MM-dd): ");
        String startDateInput = sc.next();
        LocalDate startDate = LocalDate.parse(startDateInput);

        //Step 2: Setting current date
        LocalDate currentDate = LocalDate.now();

        //Step 3: Calculating number of days
        long daysBetween = ChronoUnit.DAYS.between(startDate, currentDate);

        //Step 4: Interest
        double rate = 8.0; 
        double timeInYears = daysBetween / 365.0;
        double interest = (principal * rate * timeInYears) / 100;

        //Step 5: Total amount
        double totalAmount = principal + interest;

        System.out.println("\n--- Interest Calculation ---");
        System.out.println("Days between: " + daysBetween);
        System.out.printf("Interest earned: ₹%.2f%n", interest);
        System.out.printf("Total amount after interest: ₹%.2f%n", totalAmount);
        sc.close();
    }
}