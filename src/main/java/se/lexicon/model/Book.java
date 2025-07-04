package se.lexicon.model;


import java.util.UUID;

/**
 * This class represents a Book model with properties and methods
 * to manage book-related information and operations.
 */
public class Book {
    // todo: needs completion
    private String id;
    private String title;
    private String author;
    private boolean available;
    private Person borrower;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.id = generateID();
        this.available = true;
    }


    public Book(String title, String author, Person borrower){
        this.title = title;
        this.author = author;
        this.available = false;
        this.borrower = borrower;
    }

    /**
     * geters
     * seters
     * */

    public void setAuthor(String author) {
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("Author can't be empty or null");
        }
        this.author = author;
    }

    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title can't be empty or null");
        }
        this.title = title;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setBorrower(Person borrower) {
        this.borrower = borrower;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    /**
     * other methods
     * */

    public String getBookInformation(){
        StringBuilder info = new StringBuilder();
        info.append("Book info -> ID: ").append(id)
            .append(", Title: ").append(title)
            .append(". Author: ").append(author);
        if (borrower != null){
            info.append(", Borrower").append(borrower.getPersonInformation());
        }else {
            info.append(", No borrower.");
        }
        return info.toString();
    }

    public String generateID(){
        return UUID.randomUUID().toString().substring(0,6).toUpperCase();
    }

}