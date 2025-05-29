public class P3_Example_of_StringBUILDER{
	public static void main(String[] args) {
		StringBuilder Stringbuilder = new StringBuilder("Hello");
		System.out.println("After Append: "+Stringbuilder.append(" World"));
		System.out.println("After Insert: "+Stringbuilder.insert(5," Java"));
		System.out.println("After Replace: "+Stringbuilder.replace(6,10,"Universe"));
		System.out.println("After Delet: "+Stringbuilder.delete(5, 11));
		System.out.println("After Revers: "+Stringbuilder.reverse());
		System.out.println("Capacity of String Builder: "+Stringbuilder.capacity());
		Stringbuilder.ensureCapacity(50);
		System.out.println("Ensured Capacity of String Builder: "+Stringbuilder.capacity());
		System.out.println("Character at Index 0: "+Stringbuilder.charAt(0));
		System.out.println("Length of String Builder: "+Stringbuilder.length());
		System.out.println("Substring from Index 3: "+Stringbuilder.substring(3));
		System.out.println("Substring from Index 3 to 7: "+Stringbuilder.substring(3,7));
	}
}