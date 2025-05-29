public class HWQ2_String_Comparison {
    public static void main(String args[]) {
        // Case 1: String literals
        String w1 = "Arpit K";
        String w2 = "Arpit K";

        System.out.println("Is \"" + w1 + "\" same as \"" + w2 + "\" using '==' operator: " + (w1 == w2));
        System.out.println("Is \"" + w1 + "\" same as \"" + w2 + "\" using '.equals()' operator: " + (w1.equals(w2)));

        // Explanation
        System.out.println("\nExplanation:");
        System.out.println("Since both strings are created using string literals, they are stored in the String Constant Pool.");
        System.out.println("As a result, 'w1 == w2' returns true because both references point to the same memory location.");
        System.out.println("'.equals()' checks content, and since the content is the same, it also returns true.");

        // Case 2: Strings created using the new keyword
        String w3 = new String("Dylan Hill");
        String w4 = new String("Dylan Hill");

        System.out.println("\nIs \"" + w3 + "\" same as \"" + w4 + "\" using '==' operator: " + (w3 == w4));
        System.out.println("Is \"" + w3 + "\" same as \"" + w4 + "\" using '.equals()' operator: " + (w3.equals(w4)));

        // Explanation
        System.out.println("\nExplanation:");
        System.out.println("Here, both w3 and w4 are created using the 'new' keyword, so they are stored in different memory locations.");
        System.out.println("'w3 == w4' returns false because they are separate objects in memory.");
        System.out.println("However, '.equals()' compares the content, which is the same, so it returns true.");
    }
}