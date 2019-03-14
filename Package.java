package io.codelex.solidexamples;

public class Package {
    private final Sender sender;
    private final Address address;

    public Package(Sender sender,
                   Address address) {
        this.sender = sender;
        this.address = address;
    }

    Sender getSender() {
        return sender;
    }

    Address getAddress() {
        return address;
    }
}
