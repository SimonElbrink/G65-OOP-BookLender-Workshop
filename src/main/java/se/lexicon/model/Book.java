package se.lexicon.model;


import java.util.UUID;

public class Book {

    private final String id;
    private String title;
    private String author;
    private boolean available;
    private Person borrower;

    public Book(String title, String author) {
        this.id = UUID.randomUUID().toString(); //UUID.randomUUID().toString();
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public Book(String title, String author, Person borrower) {
        this(title, author);
        this.borrower = borrower;
        this.available = false;
    }



    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setAvailable(boolean available) { this.available = available; }
    public void setBorrower(Person borrower) { this.borrower = borrower; }


    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return available; }
    public Person getBorrower() { return borrower; }



    public String getBookInformation() {
        StringBuilder info = new StringBuilder();
        info.append("Book ID: ").append(id).append("\n");
        info.append("Title: ").append(title).append("\n");
        info.append("Author: ").append(author).append("\n");
        info.append("Available: ").append(available ? "yes" : "No").append("\n");
        if (borrower != null) {
            info.append("Borrowed by: ").append(borrower.getFirstName()).append(" ").append(borrower.getLastName());
        }
        return info.toString();
    }


}