class Book {

    int bookId;
    String bookTitle;
    String author;
    boolean available;

    void issueBook() {

        if (available == true) {
            available = false;
            System.out.println("Book issued successfully.");
        }
        else {
            System.out.println("Book is already issued.");
        }
    }

    void returnBook() {

        if (available == false) {
            available = true;
            System.out.println("Book returned successfully.");
        }
        else {
            System.out.println("Book is already available.");
        }
    }

    void displayBook() {

        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + author);

        if (available == true) {
            System.out.println("Status: Available");
        }
        else {
            System.out.println("Status: Issued");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Book book = new Book();

        book.bookId = 101;
        book.bookTitle = "Java Programming";
        book.author = "James Gosling";
        book.available = true;

        book.displayBook();

        System.out.println();

        book.issueBook();

        System.out.println();

        book.issueBook();

        System.out.println();

        book.returnBook();

        System.out.println();

        book.displayBook();
    }
}
