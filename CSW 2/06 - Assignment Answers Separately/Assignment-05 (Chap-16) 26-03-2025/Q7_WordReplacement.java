import java.util.*;
public class Q7_WordReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        System.out.print("Enter word to search: ");
        String search = sc.next();
        System.out.print("Enter replacement word: ");
        String replace = sc.next();
        
        int index = sentence.indexOf(search);
        String modified = (index == -1) ? sentence : sentence.substring(0, index) + replace + sentence.substring(index + search.length());
        
        System.out.println("Original: " + sentence);
        System.out.println("Modified: " + modified);
        
        sc.close();
    }
}