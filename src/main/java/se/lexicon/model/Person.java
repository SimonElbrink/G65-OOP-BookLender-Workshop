package se.lexicon.model;

public class Person {
    private static int sequencer = 0;
    private int id;
    private String firstName;
    private String lastName;

    public Person (String firstName, String lastName){
        this.id = getNextId();
        this.firstName = firstName;
        this.lastName = lastName;
    }
    private static int getNextId() {
        return sequencer++;
    }
}