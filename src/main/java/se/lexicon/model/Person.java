package se.lexicon.model;

public class Person {
    private static int sequencer = 0;
    private int id;
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        if(firstName == null || firstName.trim().isEmpty()){
            throw new IllegalArgumentException("First name cannot be null or empty");
        }
        if(lastName == null || lastName.trim().isEmpty()){
            throw new IllegalArgumentException("Last name cannot be null or empty");
        }
        this.id = getNextId();
        this.firstName = firstName;
        this.lastName = lastName;
    }
// ID counter method
    private static int getNextId() {
        return sequencer++;
    }
    // loan book and return book methods
    public void loanBook(Book book){
        if(book.isAvailable()){
            book.setBorrower(this);
            book.setAvailable(false);
        }else {
            System.out.println("The book is already taken");
        }

    }
    public void returnBook(Book book) {
        if(book.getBorrower()==this) {
            book.setAvailable(true);
            book.setBorrower(null);
        }else {
            System.out.println("You didn't take this book");
        }
    }
}