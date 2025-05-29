import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class Q10_DaysInbetween_Using_CHRONOGRAPH {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //Step 1: Enter the Dates
        System.out.print("Enter start date (yyyy-MM-dd): ");
        String startDateInput = sc.next();
        LocalDate startDate = LocalDate.parse(startDateInput);
        System.out.print("Enter End date (yyyy-MM-dd): ");
        String endDateInput = sc.next();
        LocalDate endDate = LocalDate.parse(endDateInput);

        //Step 2: Find the Days
        long daysbetween = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("The Days Inbetween is: "+daysbetween);
        sc.close();
    }
}