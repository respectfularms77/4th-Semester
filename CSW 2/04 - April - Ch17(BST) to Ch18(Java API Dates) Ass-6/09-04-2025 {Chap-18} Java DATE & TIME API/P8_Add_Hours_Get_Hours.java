import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
public class P8_Add_Hours_Get_Hours {
	public static void main(String[] args) {
		System.out.println(LocalTime.parse("03:20").plus(5,ChronoUnit.HOURS));
		System.out.println(LocalTime.parse("03:20").getHour());
	}
}