package io.codelex.solidexamples;

public class Letter implements Sendable {

    private final Person sender;
    private final Address address;

    Letter(Person sender, Address address) {
        this.sender = sender;
        this.address = address;
    }

    @Override
    public Person getSender() {
        return sender;
    }

    @Override
    public Address getAddress() {
        return address;
    }
}
