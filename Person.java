package io.codelex.solidexamples;

public class Person {
    private final String name;
    private final String surname;
    private final String identificationNumber;

    Person(String name, String surname, String identificationNumber) {
        this.name = name;
        this.surname = surname;
        this.identificationNumber = identificationNumber;
    }

    public boolean isAddressee() {
        return false;
    }

    String writePerson() {
        return this.name + " " + this.surname + " (" + this.identificationNumber + ") ";
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    String getIdentificationNumber() {
        return identificationNumber;
    }
}
