import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
public class P14_OffSet_Date_Time {
	public static void main(String[] args) {
		LocalDateTime ltd = LocalDateTime.of(2025, 4,6,10,30);
		OffsetDateTime offsetDateTime = OffsetDateTime.of(ltd,ZoneOffset.of("+04:00"));
		System.out.println(offsetDateTime);
	}
}