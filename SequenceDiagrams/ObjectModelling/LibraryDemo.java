public class LibraryDemo {
    static class Book {
        private String title;
        private String author;
        private String isbn;

        public Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }

        public String getTitle() { return title; }
        public String getAuthor() { return author; }
        public String getIsbn() { return isbn; }
    }
    static class Library {
        private java.util.List<Book> books = new java.util.ArrayList<>();

        public void addBook(Book book) {
            books.add(book);
        }

        public void showBooks() {
            System.out.println("Books in Library:");
            for (Book b : books) {
                System.out.println("- " + b.getTitle() + " by " + b.getAuthor() + " (ISBN: " + b.getIsbn() + ")");
            }
        }
    }
    static class User {
        private String name;

        public User(String name) {
            this.name = name;
        }

        public void borrowBook(Library library, Book book) {
            System.out.println(name + " borrowed: " + book.getTitle());
        }
    }
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book("1984", "George Orwell", "ISBN001");
        Book b2 = new Book("Brave New World", "Aldous Huxley", "ISBN002");
        Book b3 = new Book("To Kill a Mockingbird", "Harper Lee", "ISBN003");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        library.showBooks();

        User user = new User("Alice");
        user.borrowBook(library, b1);
    }
}


