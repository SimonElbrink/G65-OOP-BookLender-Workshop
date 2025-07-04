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
        setFirstName(firstName);
        setLastName(lastName);
        this.id = getNextId();
    }

    /**
     * geters
     * seters
     * */

    public void setFirstName(String firstName){
        if (firstName == null || firstName.isEmpty()){
            throw new IllegalArgumentException("First name cannot be null or empty");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        if (lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("Lastname can't be empty or null");
        }
        this.lastName = lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getId() {
        return id;
    }


    /**
     * other methods
     * */

    private int getNextId(){
        return ++sequencer;
    }

    public void loanBook(Book book){
        if (book == null) {
            throw new IllegalArgumentException("Book can't be null");
        }
       book.setAvailable(false);
       book.setBorrower(this);
        System.out.println(" " + firstName + " " + lastName + " borrowed the book" + book.getTitle()
                + " " + book.getAuthor());
    }

    public void returnBook(Book book){
        if (book == null) {
            throw new IllegalArgumentException("Book can't be null");
        }
        book.setAvailable(true);
        book.setBorrower(null);
    }

    public String getPersonInformation(){
        StringBuilder info = new StringBuilder();
        info.append("Person info -> ID").append(id)
                .append(", First name: ").append(firstName)
                .append(", Lastname: ").append(lastName);
        return null;
    }
}