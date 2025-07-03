package se.lexicon.model;


/**
 * This class represents a Book model with properties and methods
 * to manage book-related information and operations.
 */
public class Book {
    // todo: needs completion
    private String id;
    private String title;
    private String author;
    private String available;
    private Person borrower;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }


    public Book(String title, String author, Person borrower){
        this.title = title;
        this.author = author;
        this.borrower = borrower;
    }

    /**
     * geters
     * seters
     * */


    /**
     * other methods
     * */

    public String getBookInformation(){
        return null;
    }


}