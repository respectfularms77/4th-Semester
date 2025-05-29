import java.util.*;
public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<String> trset=new TreeSet<String>();
		trset.add("Apricots");
		trset.add("Mango");
		trset.add("Orange");
		trset.add("Strawberry");
		trset.add("Dates");
		
		//Adding Duplicate Elements
		trset.add("Mango");
		trset.add("Orange");
		
		//Adding Multiple Null Values 		---->>> Throws NullPointerExeception
		//trset.add(null);
		//trset.add(null);
		
		//Displaying the Stored Elements:
		System.out.println("String TreeSet: "+trset);
		
		//Removing the Non Duplicate Elements
		trset.remove("Dates");
		
		//Displaying the Elements after removing the Duplicate Elements:
		System.out.println("String TreeSet: "+trset);
		
		//Declaring a Integer HashSet
		TreeSet<Integer> trset1=new TreeSet<Integer>();
		trset1.add(55);
		trset1.add(78);
		trset1.add(97);
		trset1.add(13);
		trset1.add(64);
		
		//Adding the Duplicate Element
		trset1.add(78);
		trset1.add(55);
		
		//Multiple Null Values
		//trset1.add(null);
		//trset1.add(null);
		
		//Displaying the Stored Elements:
		System.out.println("Integer TreeSet: "+trset1);
		
		//Removing the Duplicate Elements
		trset1.remove(55);
		
		//Displaying the Elements after removing the Duplicate Elements:
		System.out.println("Integer TreeSet: "+trset1);
	}
}