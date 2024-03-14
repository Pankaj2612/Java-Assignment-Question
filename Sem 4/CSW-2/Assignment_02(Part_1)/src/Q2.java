// Write a program to create a Book class with member variables bookId,
// bookName, and price. Add the respective method and constructor to it.
// Create a driver class in that class and create two book objects. Compare
// the book objects according to their price. Print the details of the book
// objects.
// Note: Overload toString and equals method

class Book {
    private int bookId;
    private String bookName;
    private double price;

    // Constructor
    public Book(int bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    // Getters
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public double getPrice() {
        return price;
    }

    // Overridden toString method
    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Book Name: " + bookName + ", Price: $" + price;
    }

    // Overridden equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Book book = (Book) obj;
        return bookId == book.bookId &&
                Double.compare(book.price, price) == 0 &&
                bookName.equals(book.bookName);
    }
}

public class Q2 {
    public static void main(String[] args) {
        // Creating book objects
        Book book1 = new Book(1, "Book One", 20.50);
        Book book2 = new Book(2, "Book Two", 15.75);

        // Printing details of book objects
        System.out.println("Details of Book 1:");
        System.out.println(book1);

        System.out.println("\nDetails of Book 2:");
        System.out.println(book2);

        // Comparing book objects based on price
        if (book1.getPrice() > book2.getPrice()) {
            System.out.println("\nBook 1 is more expensive than Book 2.");
        } else if (book1.getPrice() < book2.getPrice()) {
            System.out.println("\nBook 2 is more expensive than Book 1.");
        } else {
            System.out.println("\nBoth books have the same price.");
        }
    }
}
