package io.codelex.solidexamples;

public class Addressee extends Person {

    Addressee(String name, String surname) {
        super(name, surname);
    }

    @Override
    public boolean isAddressee() {
        return true;
    }

    void send(Package pack) {
        System.out.println("Sending package from " + pack.getSender().getName() + " " + pack.getSender().getSurname() + " to " + this.getName() + " " + this.getSurname());
        System.out.println("Address line : " + pack.getAddress().writeAddress());
    }
}
