import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Q8_Format_LocalDateTime_using_DateTimeFormatter_Class {
    public static void main(String[] args) {
        //Step 1:Creating a specific LocalDateTime object
        LocalDateTime customDateTime = LocalDateTime.of(2025, 5, 1, 14, 30, 45);

        //Step 2:Defining the custom formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        //Step 3:Formating the date-time
        String formattedDateTime = customDateTime.format(formatter);

        //Step 4:The result
        System.out.println("Formatted Date-Time: " + formattedDateTime);
    }
}
