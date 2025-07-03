package se.lexicon.model;



public class Book {
    private String id;
    private String title;
    private String author;
    private boolean available;
    private Person borrower;

    public Book(String title, String author) {
        validateTitleAndAuthor(title, author);
        this.title = title;
        this.author = author;
        this.available = true;
    }
    public Book (String title, String author, Person borrower) {
        validateTitleAndAuthor(title, author);
        this.title = title;
        this.author = author;
        this.borrower = borrower;
        this.available = false;
    }
    //setter
    public void setAvailable(boolean available) {
        this.available = available;
        }
    public void setBorrower(Person borrower) {
        this.borrower = borrower;
    }
    // getters
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
    //check for empty fields
    private void validateTitleAndAuthor(String title, String author) {
        if(title==null||title.trim().isEmpty() || author==null||author.trim().isEmpty()){
            throw new IllegalArgumentException("Title and author cannot be null or empty");

        }
    }
}