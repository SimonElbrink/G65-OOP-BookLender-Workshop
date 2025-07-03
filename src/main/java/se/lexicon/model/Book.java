package se.lexicon.model;


import java.util.UUID;

/**
 * This class represents a Book model with properties and methods
 * to manage book-related information and operations.
 */
public class Book {
    private final String id = UUID.randomUUID().toString();
    private String title;
    private String author;
    private boolean available = true;
    private Person borrower = null;

    public Book(String title, String author) {

        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, Person borrower) {
        this(title, author);
        borrow(borrower);

    }

    public boolean borrow(Person p) {
        if (!available || p == null) return false;
        available = false;
        borrower = p;
        p.addBorrowedBook(this);
        return true;
    }

    public boolean returnBook() {
        if (available) return false;
        borrower.removeBorrowedBook(this);
        borrower = null;
        available = true;
        return true;
    }
    /* Getters */

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public Person getBorrower() {
        return borrower;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", available=" + available +
                ", borrower=" + (borrower != null ? borrower.getPersonInformation() : "none") +
                '}';
    }


}