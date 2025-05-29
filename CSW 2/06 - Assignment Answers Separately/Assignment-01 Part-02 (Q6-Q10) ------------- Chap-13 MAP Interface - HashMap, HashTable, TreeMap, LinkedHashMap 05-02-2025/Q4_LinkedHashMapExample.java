import java.util.*;
public class Q4_LinkedHashMapExample {
	public static void main(String[] args) {

		LinkedHashMap<Integer, String> lihamap = new LinkedHashMap<Integer, String>();

		lihamap.put(21, "Arpit");
		lihamap.put(35, "Sneha");
		lihamap.put(1, "Aneek");
		lihamap.put(3, "Sreeja");
		lihamap.put(100, "Sudeshna");
		lihamap.put(50, "Raju");
		lihamap.put(99, "Sonu");

		Set set1 = lihamap.entrySet();

		Iterator it1 = set1.iterator();
		while (it1.hasNext()) {
			Map.Entry me = (Map.Entry) it1.next();
			System.out.println("The key is: " + me.getKey() + " and Value is: " +
					me.getValue());
		}
	}
}