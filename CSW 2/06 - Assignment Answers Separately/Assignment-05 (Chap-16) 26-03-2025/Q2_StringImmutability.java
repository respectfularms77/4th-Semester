//Q2. Write a Java program that demonstrates the immutability of the String class and how it implements the CharSequence interface. Your program should illustrate the behaviours that highlight String immutability and its usage as a CharSequence.
public class Q2_StringImmutability {
    public static void main(String[] args) {
        // Demonstrating immutability
        String str = "Hello";
        System.out.println("Original String: " + str);

        // Attempt to modify the string
        String modifiedStr = str.concat(" World");
        System.out.println("After concat operation: " + modifiedStr);
        System.out.println("Original String remains unchanged: " + str);

        // String as a CharSequence
        CharSequence charSeq = "Immutable CharSequence";
        System.out.println("\nUsing String as a CharSequence:");
        System.out.println("Character at index 5: " + charSeq.charAt(5));
        System.out.println("Subsequence (0,9): " + charSeq.subSequence(0, 9));
        System.out.println("Length: " + charSeq.length());

        // Demonstrating behavior when using StringBuilder (mutable alternative)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("\nStringBuilder (mutable): " + sb);
    }
}