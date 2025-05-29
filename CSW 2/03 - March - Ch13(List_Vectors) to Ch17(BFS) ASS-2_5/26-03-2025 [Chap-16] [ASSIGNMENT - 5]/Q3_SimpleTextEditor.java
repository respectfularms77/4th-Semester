import java.util.*;
public class Q3_SimpleTextEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer text = new StringBuffer("Arpit Kumar");
        
        while (true) {
            System.out.println("\nCurrent Text: " + text);
            System.out.println("Length: " + text.length() + ", Capacity: " + text.capacity());
            System.out.println("1. Append  2. Insert  3. Delete  4. Reverse  5. Replace  6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            if (choice == 6) break;

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter text to append: ");
                    text.append(sc.nextLine());
                }
                case 2 -> {
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter text to insert: ");
                    text.insert(index, sc.nextLine());
                }
                case 3 -> {
                    System.out.print("Enter start and end index: ");
                    text.delete(sc.nextInt(), sc.nextInt());
                }
                case 4 -> text.reverse();
                case 5 -> {
                    System.out.print("Enter start and end index: ");
                    int start = sc.nextInt(), end = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter replacement text: ");
                    text.replace(start, end, sc.nextLine());
                }
                default -> System.out.println("Invalid option!");
            }
        }
        sc.close();
    }
}