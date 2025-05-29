import java.util.*;
public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> haset=new HashSet<String>();
		haset.add("Apricots");
		haset.add("Mango");
		haset.add("Orange");
		haset.add("Strawberry");
		haset.add("Dates");
		
		//Adding Duplicate Elements
		haset.add("Mango");
		haset.add("Orange");
		
		//Adding Multiple Null Values
		haset.add(null);
		haset.add(null);
		
		//Displaying the Stored Elements:
		System.out.println("String HashSet: "+haset);
		
		//Removing the Non Duplicate Elements
		haset.remove("Dates");
		
		//Displaying the Elements after removing the Duplicate Elements:
		System.out.println("String HashSet: "+haset);
		
		//Declaring a Integer HashSet
		HashSet<Integer> haset1=new HashSet<Integer>();
		haset1.add(55);
		haset1.add(78);
		haset1.add(97);
		haset1.add(13);
		haset1.add(64);
		
		//Adding the Duplicate Element
		haset1.add(78);
		haset1.add(55);
		
		//Multiple Null Values
		haset1.add(null);
		haset1.add(null);
		
		//Displaying the Stored Elements:
		System.out.println("Integer HashSet: "+haset1);
		
		//Removing the Duplicate Elements
		haset1.remove(55);
		
		//Displaying the Elements after removing the Duplicate Elements:
		System.out.println("Integer HashSet: "+haset1);
	}
}