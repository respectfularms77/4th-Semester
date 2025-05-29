import java.time.LocalDateTime;
public class P10_Date_Time_Together {
	public static void main(String[] args) {
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDateTime.of(2025,4,6,8,45));
		System.out.println(LocalDateTime.parse("2025-04-06T08:45:00"));
	}
}