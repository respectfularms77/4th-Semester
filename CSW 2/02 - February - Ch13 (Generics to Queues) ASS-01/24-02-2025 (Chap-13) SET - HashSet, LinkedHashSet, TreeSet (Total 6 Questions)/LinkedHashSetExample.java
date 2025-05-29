import java.util.*;
public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet<String> lihaset=new LinkedHashSet<String>();
		lihaset.add("Apricots");
		lihaset.add("Mango");
		lihaset.add("Orange");
		lihaset.add("Strawberry");
		lihaset.add("Dates");
		
		//Adding Duplicate Elements
		lihaset.add("Mango");
		lihaset.add("Orange");
		
		//Adding Multiple Null Values
		lihaset.add(null);
		lihaset.add(null);
		
		//Displaying the Stored Elements:
		System.out.println("String LinkedHashSet: "+lihaset);
		
		//Removing the Non Duplicate Elements
		lihaset.remove("Dates");
		
		//Displaying the Elements after removing the Duplicate Elements:
		System.out.println("String LinkedHashSet: "+lihaset);
		
		//Declaring a Integer HashSet
		LinkedHashSet<Integer> lihaset1=new LinkedHashSet<Integer>();
		lihaset1.add(55);
		lihaset1.add(78);
		lihaset1.add(97);
		lihaset1.add(13);
		lihaset1.add(64);
		
		//Adding the Duplicate Element
		lihaset1.add(78);
		lihaset1.add(55);
		
		//Multiple Null Values
		lihaset1.add(null);
		lihaset1.add(null);
		
		//Displaying the Stored Elements:
		System.out.println("Integer LinkedHashSet: "+lihaset1);
		
		//Removing the Duplicate Elements
		lihaset1.remove(55);
		
		//Displaying the Elements after removing the Duplicate Elements:
		System.out.println("Integer LinkedHashSet: "+lihaset1);
	}
}