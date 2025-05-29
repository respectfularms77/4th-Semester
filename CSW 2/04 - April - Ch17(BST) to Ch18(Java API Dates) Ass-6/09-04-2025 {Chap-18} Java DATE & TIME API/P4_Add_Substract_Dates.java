import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class P4_Add_Substract_Dates {
	public static void main(String[] args) {
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		LocalDate lastMonth = LocalDate.now().minus(1,ChronoUnit.MONTHS);
		System.out.println("Tomorrow is: "+tomorrow);
		System.out.println("Last Month is: "+lastMonth);
	}
}