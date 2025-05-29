import java.util.*;
public class Q1_HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer, String> hmap1 = new HashMap<Integer, String>();
		hmap1.put(20, "Arpit");
		hmap1.put(30, "Roshan");
		hmap1.put(16, "Sourav");
		hmap1.put(7, "Snehansu");
		hmap1.put(19, "Ipshita");
		hmap1.put(21, "Swetline");
		hmap1.put(23, "Sneha");
		
		Set set1 = hmap1.entrySet();
		Iterator iterator1 = set1.iterator();
		while (iterator1.hasNext()) {
			Map.Entry ment1 = (Map.Entry) iterator1.next();
			System.out.println("The value is: " + ment1.getValue() + " and key is: " +
					ment1.getKey());
		}
		
		String va = hmap1.get(7);
		System.out.println("Index 7 has value of " + va);
		
		hmap1.remove(16);
		
		Set set2 = hmap1.entrySet();
		Iterator iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry ment2 = (Map.Entry) iterator2.next();
			System.out.println("Now value is " + ment2.getValue() + " and key is: " +
					ment2.getKey());
		}
	}
}