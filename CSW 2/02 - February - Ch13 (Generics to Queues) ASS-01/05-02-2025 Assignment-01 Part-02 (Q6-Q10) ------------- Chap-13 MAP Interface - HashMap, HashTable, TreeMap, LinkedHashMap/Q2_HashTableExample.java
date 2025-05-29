import java.util.*;
public class Q2_HashTableExample {
	public static void main(String args[]) {
		Enumeration nms;
		String keys;
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		hashtable.put("K1", "Arpit");
		hashtable.put("K2", "Sneha");
		hashtable.put("K3", "Sudeshna");
		hashtable.put("K4", "Aneek");
		hashtable.put("K5", "Sreeja");
		hashtable.put("K6", "Sonu");
		hashtable.put("K7", "Raj");

		nms = hashtable.keys();
		while (nms.hasMoreElements()) {
			keys = (String) nms.nextElement();
			System.out.println("Key is " + keys + " & value is " + hashtable.get(keys));
		}
	}
}