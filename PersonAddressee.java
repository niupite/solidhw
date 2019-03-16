package io.codelex.solidexamples;

public class PersonAddressee extends Person implements Addressee {

    PersonAddressee(String name, String surname, String identificationNumber) {
        super(name, surname, identificationNumber);
    }

    @Override
    public boolean isAddressee() {
        return true;
    }

    @Override
    public void send(Package pack) {
        System.out.println("Sending package from " + pack.getSender().writePerson() + "to " + this.writePerson() + " ");
        System.out.println("Address line : " + pack.getAddress().writeAddress() + " ");
    }

    @Override
    public void send(Letter letter) {
        System.out.println("Sending letter from " + letter.getSender().writePerson() + "to " + this.writePerson() + " ");
        System.out.println("Address line : " + letter.getAddress().writeAddress() + " ");
    }

}
