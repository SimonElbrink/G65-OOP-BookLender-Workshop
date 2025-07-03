package se.lexicon.model;



public class Book {
    private String id;
    private String title;
    private String author;
    private boolean available;
    private Person borrower;

    public Book(String title, String author) {
        this.title=title;
        this.author=author;
    }
    public Book (String title, String author, Person borrower) {
        this.title = title;
        this.author = author;
        this.borrower = borrower;
    }
    public void setAvailable(boolean available) {
        this.available=available;
        }
    public String getId(){
        return id;
    }
    public String getAuthor() {
        return author;
    }
    public boolean isAvailable() {
        return available;
    }
    public String getTitle() {
        return title;
    }
    public Person getBorrower() {
        return borrower;
    }
}