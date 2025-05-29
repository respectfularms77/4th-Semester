import java.util.*;
public class Q8_StringExplorer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        while (true) {
            System.out.println("\n1. To Lower  2. To Upper  3. Search Char  4. Search Index  5. Concatenate  6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            
            if (choice == 6) break;
            
            switch (choice) {
                case 1 -> System.out.println("Lowercase: " + str.toLowerCase());
                case 2 -> System.out.println("Uppercase: " + str.toUpperCase());
                case 3 -> {
                    System.out.print("Enter character: ");
                    char ch = sc.next().charAt(0);
                    System.out.println("First Occurrence: " + str.indexOf(ch));
                }
                case 4 -> {
                    System.out.print("Enter substring: ");
                    String sub = sc.nextLine();
                    System.out.println("First Occurrence: " + str.indexOf(sub));
                }
                case 5 -> {
                    System.out.print("Enter string to concatenate: ");
                    str += sc.nextLine();
                    System.out.println("Updated String: " + str);
                }
                default -> System.out.println("Invalid option!");
            }
        }
        sc.close();
    }
}