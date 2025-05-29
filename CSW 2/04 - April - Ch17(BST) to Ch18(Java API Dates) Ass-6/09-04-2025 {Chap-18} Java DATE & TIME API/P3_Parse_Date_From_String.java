import java.time.LocalDate;
public class P3_Parse_Date_From_String {
	public static void main(String[] args) {
		LocalDate date = LocalDate.parse("2025-01-01");
		System.out.println("Date is: "+date);
	}
}