package se.lexicon;
import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
        // todo: needs completion
        // Initialize and display Book & Person instances
        Person person1 = new Person("Maria", "Borodkina");
        System.out.println(person1.getPersonInformation());
        Person person2 = new Person ("Anna", "Kalebson");
        System.out.println(person2.getPersonInformation());

        Book book1 = new Book("Book 1", "Arthur Conandoil");
        System.out.println(book1.getBookInformation());
        Book book2 = new Book("Book2", "Martin Fowler");
        System.out.println(book2.getBookInformation());
        // Simulate borrowing a book
        person1.loanBook(book1);
        System.out.println(book1.getBookInformation());
        person2.loanBook(book1);
        person2.loanBook(book2);
        System.out.println(book2.getBookInformation());
        // Simulate returning a book
        person1.returnBook(book1);
        person2.returnBook(book1);
        person2.returnBook(book2);
        System.out.println(book1.getBookInformation());
    }

}
