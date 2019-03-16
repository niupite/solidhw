package io.codelex.solidexamples;

public class Package {
    private final Person sender;
    private final Address address;

    public Package(Person sender,
                   Address address) {
        this.sender = sender;
        this.address = address;
    }

    Person getSender() {
        return sender;
    }

    Address getAddress() {
        return address;
    }
}
