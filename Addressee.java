package io.codelex.solidexamples;

public class Addressee extends Person {

    Addressee(String name, String surname, String identificationNumber) {
        super(name, surname, identificationNumber);
    }
    
    @Override
    public boolean isAddressee() {
        return true;
    }

    void send(Package pack) {
        System.out.println("Sending package from " + pack.getSender().writePerson() + "to " + this.writePerson() + " ");
        System.out.println("Address line : " + pack.getAddress().writeAddress() + " ");
    }
}
