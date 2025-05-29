import java.time.LocalDate;
public class P5_Get_Day_Week_Month_CheckLeapYear {
	public static void main(String[] args) {
		System.out.println(LocalDate.now().getDayOfWeek());
		System.out.println(LocalDate.now().getDayOfMonth());
		System.out.println(LocalDate.now().isLeapYear());
	}
}