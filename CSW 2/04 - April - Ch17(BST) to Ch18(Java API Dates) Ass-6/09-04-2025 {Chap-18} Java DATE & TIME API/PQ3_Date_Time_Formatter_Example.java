import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class PQ3_Date_Time_Formatter_Example {
    public static void main(String[] args) {
        // Step 1: Define a LocalDateTime object with specific date and time
        LocalDateTime dateTime = LocalDateTime.of(2025, 4, 6, 14, 45, 30);
        // Step 2: Define a custom DateTime Formatter pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // Step 3: Format the LocalDateTime to the desired string format
        String formattedDateTime = dateTime.format(formatter);
        // Step 4: Display the formatted output
        System.out.println("Formatted DateTime: " + formattedDateTime);
    }
}