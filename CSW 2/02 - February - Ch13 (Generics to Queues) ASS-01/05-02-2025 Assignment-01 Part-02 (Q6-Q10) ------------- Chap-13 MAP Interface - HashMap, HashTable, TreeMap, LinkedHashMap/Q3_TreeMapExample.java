import java.util.*;
public class Q3_TreeMapExample {
	public static void main(String args[]) {
		TreeMap<Integer, String> trmap = new TreeMap<Integer, String>();
		trmap.put(1, "Obj 1");
		trmap.put(17, "Obj 2");
		trmap.put(50, "Obj 3");
		trmap.put(7, "Obj 4");
		trmap.put(3, "Obj 5");
		trmap.put(29, "Obj 6");
		trmap.put(30, "Obj 7");
		Set set = trmap.entrySet();
		Iterator iterator1 = set.iterator();
		while (iterator1.hasNext()) {
			Map.Entry ment = (Map.Entry) iterator1.next();
			System.out.println("key is: " + ment.getKey() + " and Value is: "+ment.getValue());
		}
	}
}