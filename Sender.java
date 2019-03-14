package io.codelex.solidexamples;

public class Sender extends Person {

    Sender(String name, String surname, String identificationNumber) {
        super(name, surname, identificationNumber);
    }

    @Override
    public boolean isAddressee() {
        return false;
    }
}
