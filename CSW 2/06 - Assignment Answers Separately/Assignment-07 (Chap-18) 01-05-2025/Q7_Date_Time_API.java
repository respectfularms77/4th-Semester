import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q7_Date_Time_API {
    public static void main(String[] args) {

        //a)Current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        //b)The date 2 weeks from today
        LocalDate today = LocalDate.now();
        LocalDate twoWeeksLater = today.plusWeeks(2);
        System.out.println("Date after 2 weeks: " + twoWeeksLater);

        //c)Current date in "MM/dd/yyyy"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = today.format(formatter);
        System.out.println("Formatted Current Date: " + formattedDate);
    }
}
