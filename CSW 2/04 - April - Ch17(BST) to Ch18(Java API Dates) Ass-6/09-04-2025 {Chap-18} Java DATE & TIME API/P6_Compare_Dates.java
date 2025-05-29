import java.time.LocalDate;
public class P6_Compare_Dates {
	public static void main(String[] args) {
		boolean isBefore = LocalDate.now().isBefore(LocalDate.parse("2025-04-10"));
		boolean isAfter = LocalDate.parse("2025-04-10").isAfter(LocalDate.now());
		System.out.println("09-04-2025 is Before 10-04-2025: "+isBefore);
		System.out.println("10-04-2025 is After 09-04-2025: "+isAfter);
	}
}