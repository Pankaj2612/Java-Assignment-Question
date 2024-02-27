// Q6. Library System Assignment:
// Task: Develop a Java program for a library system incorporating encapsulation, abstraction,
// and inheritance.
// i. LibraryResource Class:
//  - Abstract class with private attributes for title and author.
//  - Constructor, getters, setters, and an abstract method displayDetails().
// ii. Book Class:
//  - Subclass of LibraryResource with additional attribute pageCount.
//  - Constructor, getters, setters, and displayDetails() method override.
// iii. Magazine Class:
//  - Subclass of LibraryResource with additional attribute issueDate.
//  - Constructor, getters, setters, and displayDetails() method override.
// iv. DVD Class:
//  - Subclass of LibraryResource with additional attribute duration.
//  - Constructor, getters, setters, and displayDetails() method override.
// v. LibrarySystem Class (Main):
//  - Instantiate various library resources (e.g., Book, Magazine, DVD).
//  - Call displayDetails() for each instance to show resource information

abstract class LibraryResource{
    private String title;
    private String author;

    LibraryResource(String title , String author){
        this.title = title;
        this.author = author;
    }

    public void getter(){
        System.out.println("Title of Book  : " + title);
        System.out.println("Author of Book  : " + author);
    }
    public void setter(String title , String author){
        this.title = title;
        this.author = author;
    }

    abstract void displayDetails();
}

class Book extends LibraryResource{
    int pageCount;
    
    
    Book(int count){
        super(null, null);
        pageCount = count;
    }


}