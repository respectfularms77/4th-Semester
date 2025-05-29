import java.util.*;
public class Q4_StringBuilderEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial string: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        
        while (true) {
            System.out.println("\nCurrent String: " + sb);
            System.out.println("1. Add Substring  2. Remove Range  3. Modify Char  4. Concatenate  5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            
            if (choice == 5) break;
            
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter substring: ");
                    sb.insert(index, sc.nextLine());
                }
                case 2 -> {
                    System.out.print("Enter start and end index: ");
                    sb.delete(sc.nextInt(), sc.nextInt());
                }
                case 3 -> {
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new character: ");
                    sb.setCharAt(index, sc.nextLine().charAt(0));
                }
                case 4 -> {
                    System.out.print("Enter string to concatenate: ");
                    sb.append(sc.nextLine());
                }
                default -> System.out.println("Invalid option!");
            }
        }
        sc.close();
    }
}