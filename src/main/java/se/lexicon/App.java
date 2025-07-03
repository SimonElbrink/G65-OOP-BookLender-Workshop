package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
        // todo: needs completion
        Person anna = new Person("Anna", "Karlsson");
        Book b = new Book("workshop loanBook", "Ernesto Carocca");

        System.out.println(b);

        b.borrow(anna);
        System.out.println(b);
        System.out.println(b.isAvailable());
        System.out.println(anna);
        b.returnBook();
        System.out.println(b.isAvailable());
        System.out.println(anna.getPersonInformation());
        System.out.println(b.getAuthor());
        System.out.println(anna);
        // Simulate borrowing a book
        // Simulate returning a book

    }

}
