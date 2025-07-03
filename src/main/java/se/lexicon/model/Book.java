package se.lexicon.model;


import java.util.UUID;

/**
 * This class represents a Book model with properties and methods
 * to manage book-related information and operations.
 */
public class Book {

    private static int sequencer = 0;

    private int id;
    private String title;
    private String author;
    private boolean available;
    private Person borrower;

    public Book(String title, String author) {

        this.id = getNextId();
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, Person borrower) {
        this.id = getNextId();
        this.title = title;
        this.author = author;
        this.borrower = borrower;
    }

    private int getNextId() {
        return ++sequencer;
    }

    public int getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Person getBorrower() {
        return borrower;
    }

    public void setBorrower(Person borrower) {
        this.borrower = borrower;
    }

    public String getBookInfo() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", available=" + available +
                ", borrower=" + borrower +
                '}';
    }


}