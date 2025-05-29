import java.util.*;
public class Practise_Q4_ArrayListExample {
	public static void main(String[] args) {
		ArrayList arrlist = new ArrayList<>(5);
		for (int i=1;i<=5;i++){
			arrlist.add(i);
		}
		System.out.println("Initial ArrayList: "+arrlist);

		arrlist.add(2,9);

		System.out.println("Element at index 3: "+arrlist.get(3));

		arrlist.remove(2);

		System.out.println("After removing element at index 2: "+arrlist);

		System.out.println("Index of element 4: "+arrlist.indexOf(4));

		System.out.println("Size of Arraylist is: "+arrlist.size());

		System.out.println("Is the ArrayList Empty: "+arrlist.isEmpty());

		arrlist.clear();
		System.out.println("After clearing the ArrayList the elements are: "+arrlist);
		System.out.println("Is the ArrayList empty after clear(): "+arrlist.isEmpty());
	}
}