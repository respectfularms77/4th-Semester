public class P2_Example_of_StringBUFFER {
	public static void main(String[] args) {
		StringBuffer Stringbuffer = new StringBuffer("Hello");
		System.out.println("After Appending: "+Stringbuffer.append(" World"));
		System.out.println("After Inserting: "+Stringbuffer.insert(5," Java"));
		System.out.println("After Replacing: "+Stringbuffer.replace(5,10," Universe"));
		System.out.println("After Deleting: "+Stringbuffer.delete(5, 14));
		System.out.println("After Reversing: "+Stringbuffer.reverse());
		System.out.println("Capacity of String Buffer: "+Stringbuffer.capacity());
		Stringbuffer.ensureCapacity(50);
		System.out.println("Ensured Capacity of String Buffer: "+Stringbuffer.capacity());
		System.out.println("Character at Index 3: "+Stringbuffer.charAt(3));
		System.out.println("Length of String Buffer: "+Stringbuffer.length());
		System.out.println("Substring from Index 3: "+Stringbuffer.substring(3));
		System.out.println("Substring from Index 3 to 7: "+Stringbuffer.substring(3,7));
	}
}