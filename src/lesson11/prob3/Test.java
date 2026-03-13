package lesson11.prob3;

public class Test {
    static void main() {
        Library lib = new Library();
        lib.addBook("978-0-13-468599-1", "Clean Code", "Robert C. Martin");
        lib.addBook("978-0-13-235088-4", "The Pragmatic Programmer", "Andrew Hunt");
        lib.addBook("978-0-596-51774-8", "Head First Java", "Kathy Sierra");
        lib.addBook("978-0-13-110362-7", "The C Programming Language", "Brian Kernighan");
        lib.addBook("978-0-201-63361-0", "Design Patterns", "Gang of Four");
        lib.addBook("978-0-13-486901-7", "Effective Java", "Joshua Bloch");
        lib.addBook("978-1-49-195016-0", "Java: The Complete Reference", "Herbert Schildt");
        lib.addBook("978-0-13-235088-1", "Introduction to Algorithms", "Thomas H. Cormen");
        lib.addBook("978-1-59-327584-6", "The Art of Computer Programming", "Donald E. Knuth");
        lib.addBook("978-0-13-110933-5", "Structure and Interpretation", "Harold Abelson");

        lib.borrowBook("978-0-596-51774-8");
        lib.borrowBook("978-0-596-51774-9");

        lib.returnBook("978-0-596-51774-8");

        System.out.println("getBookDetails::::::::::::::::::::::::");
        System.out.println(lib.getBookDetails("978-0-596-51774-8"));

        lib.borrowBook("978-0-13-468599-1");
        lib.borrowBook("978-0-596-51774-8");
        lib.borrowBook("978-0-201-63361-0");
        lib.borrowBook("978-0-13-235088-1");

        System.out.println("listAllBooks::::::::::::::::::::::::");
        lib.listAllBooks();

        System.out.println("listBorrowedBooks::::::::::::::::::::::::");
        lib.listBorrowedBooks();
    }
}
