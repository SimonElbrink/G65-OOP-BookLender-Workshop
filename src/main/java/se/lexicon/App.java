package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
        // todo: needs completion
        // Initialize and display Book & Person instances
        // Simulate borrowing a book
        // Simulate returning a book
        Person masha = new Person("Masha", "Sobol");
        System.out.println(masha.getPersonInformation());
        Person maksim = new Person("Maksim", "Taranushenko");
        System.out.println(maksim.getPersonInformation());
        Book archOfTriumph = new Book("Arch of Triumph", "Erich Maria Remarque");
        System.out.println(archOfTriumph.getBookInformation());
        masha.loanBook(archOfTriumph);
        System.out.println(archOfTriumph.getBookInformation());
        masha.returnBook(archOfTriumph);
        System.out.println(archOfTriumph.getBookInformation());

    }

}
