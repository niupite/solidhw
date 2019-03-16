package io.codelex.solidexamples;

public class Package implements Sendable{

    private final Person sender;
    private final Address address;

    public Package(Person sender,
                   Address address) {
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
