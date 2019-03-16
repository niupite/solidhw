package io.codelex.solidexamples;

public interface Addressee {

    boolean isAddressee();

    void send(Package pack);

    void send(Letter letter);
}
