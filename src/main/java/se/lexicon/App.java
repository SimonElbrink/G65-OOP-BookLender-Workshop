package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
            Person alice = new Person("Alice", "Smith");
            Person bob = new Person("Bob", "Johnson");

            Book book1 = new Book("Java Programming", "John Doe");
            Book book2 = new Book("Clean Code", "Robert C. Martin");

            System.out.println("--- Book Details ---");
            System.out.println(book1.getBookInformation());
            System.out.println();

            // Simulate borrowing a book
            alice.loanBook(book1);
            System.out.println("\nAfter borrowing:");
            System.out.println(book1.getBookInformation());

            // Simulate returning a book
            alice.returnBook(book1);
            System.out.println("\nAfter returning:");
            System.out.println(book1.getBookInformation());

            // Bob tries to return the same book
            bob.returnBook(book1);




    }




}
