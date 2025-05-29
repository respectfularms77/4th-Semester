import java.util.*;
class Book {
    int id, quantity;
    String name, author;

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book ID: " + id + ", Name: " + name + ", Author: " + author + ", Quantity: " + quantity;
    }
}

public class Q5 {
    public static void main(String[] args) {
        HashMap<Integer, Book> bookMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        // Adding books to the HashMap
        bookMap.put(101, new Book(001, "Basics of Human", "James", 5));
        bookMap.put(102, new Book(060, "Python Basics", "Hecks", 3));

        // Displaying all books
        System.out.println("Library Collection:");
        for (Map.Entry<Integer, Book> entry : bookMap.entrySet()) {
            System.out.println(entry.getValue());
        }

        // (a) Check if a particular book name is present in the map using a simple loop
        System.out.println("\nEnter book name to search:");
        String searchName = sc.nextLine();
        boolean found = false;
        for (Book book : bookMap.values()) {
            if (book.name.equalsIgnoreCase(searchName)) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Book is available in the library." : "Book is not available.");

        // (b) Remove a book entry by deleting the value associated with a specific key
        System.out.println("\nEnter book ID to remove:");
        int removeId = sc.nextInt();
        if (bookMap.containsKey(removeId)) {
            bookMap.remove(removeId);
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Book ID not found.");
        }

        // Display updated book collection
        System.out.println("\nUpdated Library Collection:");
        for (Map.Entry<Integer, Book> entry : bookMap.entrySet()) {
            System.out.println(entry.getValue());
        }
        sc.close();
    }
}