package se.lexicon.model;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a Person model with properties and methods
 * to manage personal details and interactions with the library system.
 */
public class Person {
    // todo: needs completion
    public static int sequencer = 0;
    private int id;
    private String firstName;
    private String lastName;
    private final List<Book> borrowedBooks = new ArrayList<>();

    public Person(String firstName, String lastName) {
        this.id = ++sequencer;
        this.firstName = firstName;
        this.lastName = lastName;



    }


    //
    public int getNext() {
        return ++ sequencer;
    }
    public boolean loanBook(Book book)   { return book != null && book.borrow(this); }
    public boolean returnBook(Book book) { return book != null && book.returnBook(); }


    void addBorrowedBook(Book b)    { borrowedBooks.add(b); }
    void removeBorrowedBook(Book b) { borrowedBooks.remove(b); }



    public String getPersonInformation() {
        StringBuilder booksInfo = new StringBuilder();
        for (Book book : borrowedBooks) {
            booksInfo.append("[").append(book.getTitle()).append(" by ").append(book.getAuthor()).append("], ");
        }

        if (booksInfo.length() > 0) booksInfo.setLength(booksInfo.length() - 2);

        return "Person{" +
                "id: " + id +
                ", firstName: '" + firstName + '\'' +
                ", lastName: '" + lastName + '\'' +
                ", loaned books: " + booksInfo +
                '}';
    }

}