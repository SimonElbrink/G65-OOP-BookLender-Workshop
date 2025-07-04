package se.lexicon.model;

public class Person {

    private static int sequencer = 0;
    private final int id;
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.id = ++sequencer;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static int getNextId() {
        return ++sequencer;
    }

    public void loanBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            book.setBorrower(this);
            System.out.println(firstName + " borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Sorry, the book is already borrowed.");
        }
    }

    public void returnBook(Book book) {
        if (book.getBorrower() == this) {
            book.setAvailable(true);
            book.setBorrower(null);
            System.out.println(firstName + " returned the book: " + book.getTitle());
        } else {
            System.out.println("You cannot return a book you didn't borrow.");
        }
    }

    public String getPersonInformation() {
        return "Person ID: " + id + "\nName: " + firstName + " " + lastName;
    }

    // Getters and setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }


    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }




}