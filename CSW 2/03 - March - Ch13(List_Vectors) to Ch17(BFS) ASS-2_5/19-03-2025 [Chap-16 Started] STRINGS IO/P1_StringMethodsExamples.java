import java.util.*;
public class P1_StringMethodsExamples {
	public static void main(String[] args) {
		String str = "Hello, World!";
		System.out.println("Character at index 7: "+str.charAt(7));
		System.out.println("Length of String: "+str.length());
		System.out.println(String.format("Formatted: %s & %d","Hello",31));
		System.out.println(String.format(Locale.US,"Formatted Locale: %s & %d","Hello",31));
		System.out.println("Substring starting from Index 7: "+str.substring(7));
		System.out.println("Substring starting from Index 7 to 12: "+str.substring(7,12));
		System.out.println("Contains 'World': "+str.contains("World"));
		System.out.println("Joined String: "+String.join("-","Hello","World"));
		String[] elements = {"Hello","World"};
		System.out.println("Joined String (Iterable): "+str.join("-", elements));
		System.out.println("Equals 'Hello World': "+str.equals("Hello, World!"));
		System.out.println("is Empty: "+str.isEmpty());
		System.out.println("Concatenated String: "+str.concat(" Goodbye!"));
		System.out.println("Replaced String: "+str.replace('o', '0'));
		System.out.println("Replaced String(Sequence): "+str.replace("World", "Universe"));
		System.out.println("Equals Ignore Case 'hello, world!': "+str.equalsIgnoreCase("hello, world!"));
		String[] splitString = str.split(",");
		System.out.print("Split String: ");
		for(String s: splitString)	{	System.out.print(s.trim()); 	}
		String[] splitStringLimit = str.split(",",2);
		System.out.print("\nSplit String (Limit): ");
		for(String s: splitStringLimit)	{	System.out.print(s.trim()); 	}
		System.out.println("\nInterned String: "+str.intern());
		System.out.println("Index of 'W': "+str.indexOf('W'));
		System.out.println("Index of 'W' from index 8: "+str.indexOf('W',8));
		System.out.println("Index of 'World': "+str.indexOf("World"));
		System.out.println("Index of 'World' from index 8: "+str.indexOf("World",8));
		System.out.println("LowerCase String: "+str.toLowerCase());
		System.out.println("LowerCase String (Locale): "+str.toLowerCase(Locale.US));
		System.out.println("UpperCase String: "+str.toUpperCase());
		System.out.println("UpperCase String (Locale): "+str.toUpperCase(Locale.US));
		System.out.println("Trimmed String: "+(" Hello, World!    ".trim()));
		System.out.println("Value of String: "+String.valueOf(123));
	}
}