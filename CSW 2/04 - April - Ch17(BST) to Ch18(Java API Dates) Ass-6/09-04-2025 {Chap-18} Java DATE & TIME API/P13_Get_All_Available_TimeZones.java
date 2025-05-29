import java.time.ZoneId;
import java.util.Set;
public class P13_Get_All_Available_TimeZones {
	public static void main(String[] args) {
		Set<String> zones = ZoneId.getAvailableZoneIds();
		zones.stream().limit(5).forEach(System.out::println);
	}
}