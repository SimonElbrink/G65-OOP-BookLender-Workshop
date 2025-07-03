package se.lexicon.model;

import java.util.Arrays;

/**
 * This class represents a Person model with properties and methods
 * to manage personal details and interactions with the library system.
 */
public class Person {
    private static int sequencer = 0;

    private int id;
    private String firstName;
    private String lastName;

    private Book loanedBook;


    public Person(String firstName, String lastName){
        this.id = getNextId();
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public void loanBook(Book book){
        if(book.isAvailable()){
            book.setAvailable(false);
            book.setBorrower(this);
            loanedBook = book;
        }
        else {
            System.out.println("Book is not available");

        }
    }

    public void returnBook(Book book){
        book.setAvailable(true);
        loanedBook = null;
        book.setBorrower(null);
    }

    private int getNextId(){
        return ++sequencer;
    }

    public static int getSequencer() {
        return sequencer;
    }

    public static void setSequencer(int sequencer) {
        Person.sequencer = sequencer;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Book getLoanedBook() {
        return loanedBook;
    }

    public void setLoanedBook(Book loanedBook) {
        this.loanedBook = loanedBook;
    }


    public String getPersonInfo() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", books=" + loanedBook +
                '}';
    }
}