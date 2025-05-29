import java.util.*;
public class VectorExample {
	public static void main(String[] args) {
		Vector vec =new Vector<>(3,2);
		vec.addElement(1);
		vec.addElement(2);
		vec.addElement(3);
		vec.addElement(4);
		System.out.println("Initial Vector: "+vec);
		
		vec.add(2,99);
		System.out.println("After adding 99 at index 2: "+vec);
		
		System.out.println("Element at index 3: "+vec.get(3));
		
		vec.remove(2);
		System.out.println("After removing the element at index 2: "+vec);
		
		System.out.println("Index of element 4: "+vec.indexOf(4));
		
		System.out.println("Size of Vector: "+vec.size());
		
		System.out.println("Is the vector Empty ?: "+vec.isEmpty());
		
		vec.clear();
		System.out.println("Vector after clear(): "+vec);
		System.out.println("Is Vector Empty after clear(): "+vec.isEmpty());
	}
}