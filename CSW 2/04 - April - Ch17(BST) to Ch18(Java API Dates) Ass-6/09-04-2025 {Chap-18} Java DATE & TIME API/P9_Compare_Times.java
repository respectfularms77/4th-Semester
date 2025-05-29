import java.time.LocalTime;
public class P9_Compare_Times {
	public static void main(String[] args) {
		System.out.println(LocalTime.now().isBefore(LocalTime.parse("05:20")));
	}
}