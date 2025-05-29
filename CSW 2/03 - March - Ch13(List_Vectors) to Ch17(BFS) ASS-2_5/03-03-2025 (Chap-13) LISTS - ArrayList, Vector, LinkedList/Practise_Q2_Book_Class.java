class Book {
    int bookId;
    String bookName;
    double price;

    public Book(String bookName, int bookId, double price) {
        this.bookName = bookName;
        this.bookId = bookId;
        this.price = price;
    }

    // Method to compare prices
    public String comparePrices(Book other) {
        if (this.price > other.price) {
            return this.bookName + " is more expensive.";
        } else if (this.price < other.price) {
            return other.bookName + " is more expensive.";
        } else {
            return "Both books have the same price.";
        }
    }

    // Override equals() to compare books based on bookId
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Same memory reference
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return this.bookId == book.bookId;  // Compare based on bookId
    }

    // Override toString() to return book details
    public String toString() {
        return "Book ID: " + bookId + "\nBook Name: " + bookName + "\nPrice: ₹" + price;
    }
}
public class Practise_Q2_Book_Class {
    public static void main(String args[]) {
        Book b1 = new Book("Alice in Borderlands", 1234, 7005.6);
        Book b2 = new Book("Charlie and the Chocolate Factory", 5634, 2045.6);

        // Compare Prices
        System.out.println(b1.comparePrices(b2));

        // Display Book Details using toString()
        System.out.println("\nBook 1 Details:\n" + b1);
        System.out.println("\nBook 2 Details:\n" + b2);

        // Check if both books are the same (based on bookId)
        System.out.println("\nAre both books the same? " + b1.equals(b2));
    }
}