package lesson11.prob3;

import java.util.HashMap;

public class Library {
    HashMap<String, Book> books;

    public Library() {
        this.books = new HashMap<>();
    }

    public void addBook(String ISBN, String title, String author) {
        if (books.containsKey(ISBN)) {
            System.out.println("Error: ISBN exists in the library.");
            return;
        }
        books.put(ISBN, new Book(ISBN, title, author));
        System.out.println("Book successfully stored in the library.");
    }

    public void borrowBook(String ISBN) {
        if (books.containsKey(ISBN)) {
            Book book = books.get(ISBN);
            if (!book.isBorrowed()) {
                book.setBorrowed(true);
                System.out.println("Book was successfully issued.");
            } else {
                System.out.println("Error: Book was already borrowed.");
            }
        } else {
            System.out.println("Error: Book does not exist in the library.");
        }
    }

    public void returnBook(String ISBN) {
        if (isBookBorrowed(ISBN)) {
            Book book = books.get(ISBN);
            book.setBorrowed(false);
            System.out.println("Book is successfully returned.");
        } else {
            System.out.println("Error: Book is not borrowed.");
        }
    }

    public boolean isBookBorrowed(String ISBN) {
        if (books.containsKey(ISBN)) {
            Book book = books.get(ISBN);
            return book.isBorrowed();
        } else {
            System.out.println("Error: Book does not exist in the library.");
        }
        return false;
    }

    public Book getBookDetails(String ISBN) {
        if (books.containsKey(ISBN)) {
            return books.get(ISBN);
        }
        return null;
    }

    public void listAllBooks() {
        books.forEach((key, book) -> System.out.println(book));
    }

    public void listBorrowedBooks() {
        books.forEach((key, book) -> {
            if (book.isBorrowed())
                System.out.println(book);
        });
    }
}
