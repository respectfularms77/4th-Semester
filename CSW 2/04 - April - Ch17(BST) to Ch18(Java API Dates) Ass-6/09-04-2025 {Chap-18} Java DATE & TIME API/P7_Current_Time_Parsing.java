import java.time.LocalTime;
public class P7_Current_Time_Parsing {
	public static void main(String[] args) {
		System.out.println("Today's Time is: "+LocalTime.now());
		System.out.println(LocalTime.parse("10:15"));
		System.out.println(LocalTime.of(3, 20));
	}
}