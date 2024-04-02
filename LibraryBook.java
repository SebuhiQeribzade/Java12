package Lesson12Enterteining;
public class LibraryBook {
    private String title;
    private String author;
    private int yearPublished;
    private boolean checkedOut;

    // Constructor
    public LibraryBook(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.checkedOut = false; // By default, book is not checked out
    }

    // Method to check out the book
    public void checkOut() {
        checkedOut = true;
    }

    // Method to return the book
    public void returnBook() {
        checkedOut = false;
    }

    // Method to check if the book is available
    public boolean isAvailable() {
        return !checkedOut;
    }

    // Getter method for title
    public String getTitle() {
        return title;
    }

    // Getter method for author
    public String getAuthor() {
        return author;
    }

    // Getter method for yearPublished
    public int getYearPublished() {
        return yearPublished;
    }
}
