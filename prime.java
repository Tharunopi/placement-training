import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String ISBN;
    private int publicationYear;

    public Book(String title, String author, String ISBN, int publicationYear) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
    }

    // Copy constructor for Book
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.ISBN = other.ISBN;
        this.publicationYear = other.publicationYear;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', ISBN='" + ISBN + "', year=" + publicationYear + "}";
    }
}

class Library {
    private String name;
    private String location;
    private List<Book> books;

    public Library(String name, String location) {
        this.name = name;
        this.location = location;
        this.books = new ArrayList<>();
    }

    // Copy constructor for Library
    public Library(Library other) {
        this.name = other.name;
        this.location = other.location;
        this.books = new ArrayList<>();
        for (Book book : other.books) {
            this.books.add(new Book(book)); // Deep copy of each book
        }
    }

    public void addBook(Book book) {
        books.add(new Book(book)); // Adding a copy of the book
    }

    @Override
    public String toString() {
        return "Library{name='" + name + "', location='" + location + "', books=" + books + "}";
    }
}

public class prime {
    public static void main(String[] args) {
        // Create a library with some books
        Library originalLibrary = new Library("Central Library", "Main Street, City");
        originalLibrary.addBook(new Book("1984", "George Orwell", "978-0451524935", 1949));
        originalLibrary.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "978-0446310789", 1960));

        // Create a copy of the library
        Library copyLibrary = new Library(originalLibrary);

        // Modify the original library
        originalLibrary.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565", 1925));

        // Display both libraries
        System.out.println("Original Library:");
        System.out.println(originalLibrary);
        System.out.println("\nCopied Library:");
        System.out.println(copyLibrary);
    }
}