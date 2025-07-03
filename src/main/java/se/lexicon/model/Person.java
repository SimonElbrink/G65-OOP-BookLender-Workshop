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

    private static int getNextId() {
        return sequencer++;
    }
}