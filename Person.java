package io.codelex.solidexamples;

public class Person {
    private final String name;
    private final String surname;

    Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public boolean isAddressee() {
        return false;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }
}
