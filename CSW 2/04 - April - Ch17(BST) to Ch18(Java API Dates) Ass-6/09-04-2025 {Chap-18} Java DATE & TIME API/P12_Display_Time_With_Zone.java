import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
public class P12_Display_Time_With_Zone {
	public static void main(String[] args) {
		LocalDateTime local = LocalDateTime.of(2025, 4,6,10,30);
		ZoneId indiaZone = ZoneId.of("Asia/Kolkata");
		ZonedDateTime zoned = ZonedDateTime.of(local,indiaZone); 
		System.out.println(zoned);
	}
}