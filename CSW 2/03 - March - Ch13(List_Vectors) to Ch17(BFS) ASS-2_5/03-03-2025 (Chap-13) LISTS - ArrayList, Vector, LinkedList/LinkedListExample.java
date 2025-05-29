import java.util.*;
public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList list=new LinkedList<>();
		list.add("a");
		list.add("b");
		list.addLast("c");
		list.addFirst("d");
		list.add(2,"e");
		System.out.println("Initial LinkedList: "+list);
		
		System.out.println("First Element: "+list.getFirst());
		System.out.println("Last Element: "+list.getLast());
		System.out.println("Element at index 2: "+list.get(2));
		
		list.remove("b");
		list.remove(3);
		list.removeFirst();
		list.removeLast();
		System.out.println("List After removals: "+list);
		System.out.println("Index of 'e': "+list.indexOf("e"));
		System.out.println("Size of LinkedList: "+list.size());
		System.out.println("Is LinkedList empty?: "+list.isEmpty());
		list.clear();
		System.out.println("LinkedList after clear(): "+list);
		System.out.println("Is LinkedList empty after clear(): "+list.isEmpty());
	}
}