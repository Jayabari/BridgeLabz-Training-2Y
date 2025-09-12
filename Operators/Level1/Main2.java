class Book {
    static String libraryName = "City Library";

    final String isbn;
    String title, author;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "Herbert Schildt", "ISBN123");
        Book b2 = new Book("Python Crash Course", "Eric Matthes", "ISBN456");

        Book.displayLibraryName();
        b1.displayBookDetails();
        b2.displayBookDetails();
    }
}

