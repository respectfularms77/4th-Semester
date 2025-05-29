import java.time.LocalDate;
public class P1_Get_Current_Date {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Date is: "+today);
	}
}