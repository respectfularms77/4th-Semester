import java.util.*;
public class HWQ1_Word_Occurrences_in_Sentences {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sen = sc.nextLine(), fsen = sen;
        System.out.print("Enter a word: ");
        String word = sc.next();

        int count = 0, mover = 0;

        // Convert to lowercase for case-insensitive matching
        String tSen = sen.toLowerCase();
        String tWord = word.toLowerCase();

        while ((mover = tSen.indexOf(tWord, mover)) != -1) {
            count++;
            mover = mover + tWord.length();        // Move past the found word
            tSen = tSen.substring(mover);          // Reduce search space
            mover = 0;                             // Reset mover as we are now working with a new substring
        }

        if (count == 0) {
            System.out.println("The word \"" + word + "\" is not found in the sentence.");
        } else {
            System.out.println("The Number of Occerences of word '"+word+"'' \nin Sentence \""+fsen+"\" is: "+count);
        }
        sc.close();
    }
}