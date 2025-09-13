class LibraryBook {
    String title, author;
    double price;
    boolean available;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " borrowed successfully!");
        } else {
            System.out.println(title + " is not available.");
        }
    }
}

public class LibraryBookSystem {
    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook("Java", "Herbert Schildt", 500);
        lb.borrowBook();
        lb.borrowBook();
    }
}

