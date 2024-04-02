package Lesson12Enterteining;
public class LibraryTest {
    public static void main(String[] args) {
        // Instantiate a LibraryBook object
        LibraryBook book = new LibraryBook("Java Programming", "John Doe", 2020);

        // Display book details
        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Year Published: " + book.getYearPublished());

        // Check out the book
        book.checkOut();
        System.out.println("Book checked out.");

        // Check if the book is available
        if (book.isAvailable()) {
            System.out.println("Book is available.");
        } else {
            System.out.println("Book is not available.");
        }

        // Return the book
        book.returnBook();
        System.out.println("Book returned.");

        // Check if the book is available again
        if (book.isAvailable()) {
            System.out.println("Book is available.");
        } else {
            System.out.println("Book is not available.");
        }
    }
}
