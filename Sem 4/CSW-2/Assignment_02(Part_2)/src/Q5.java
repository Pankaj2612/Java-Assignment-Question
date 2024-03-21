import java.util.HashMap;
import java.util.Map;

//Create a Class Book that has id, name, author and quantity for each book 
//issued. The Book class should define a parameterised constructor. Design
//a class Library that create a HashMap of books which contains an entry 
//of key as Integer and value as Book object. Instantiate atleast two Book
//objects and display the collection of books in the HashMap. Use proper 
//method of HashMap class to return the following things 
//(a.)Check if a particular book name is present in the map
//(b.) remove the value associated with a particular key value which will
//remove the book entry.

class Book{
	String id;
	String name;
	String author;
	int quantity;
	public Book(String id, String name, String author, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.quantity = quantity;
	}
	
	
}

public class Q5{
	public static void main(String[] args) {
		HashMap<Integer, Book> hmap1 = new HashMap<>();
		Book b1 = new Book("S01", "Harry Potter 1", "JK Rowling", 5);
		Book b2 = new Book("S02", "Harry Potter 2", "JK Rowling", 12);
		
		hmap1.put(1, b1);
		hmap1.put(2, b2);
//		
//		for(Book b : hmap1.values()) {
//			System.out.println("Book id " + b.id + " Book name : " + b.name + " Book Author : " + b.author + " Book Quantity : " + b.quantity );
//		}
		
		for (Map.Entry<Integer, Book> entry : hmap1.entrySet()) {
			Integer key = entry.getKey();
			Book b = entry.getValue();
			System.out.print(key + " --> " );
			System.out.println("Book id " + b.id + " Book name : " + b.name + " Book Author : " + b.author + " Book Quantity : " + b.quantity );
			
			
		}
	}
}