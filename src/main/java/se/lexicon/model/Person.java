package se.lexicon.model;
/**
 * This class represents a Person model with properties and methods
 * to manage personal details and interactions with the library system.
 */
public class Person {
    // todo: needs completion
    private int sequencer = 0;
    private int id;
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName){
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("First name can't be empty or null");
        }
        if (lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("Lastname can't be empty or null");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = getNextId();
    }

    /**
     * geters
     * seters
     * */


    /**
     * other methods
     * */

    private int getNextId(){
        return ++sequencer;
    }

    public void loanBook(String book){

    }

    public void returnBook(String book){

    }

    public String getPersonInformation(){
        return null;
    }
}