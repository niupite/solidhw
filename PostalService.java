package io.codelex.solidexamples;

class PostalService {
    private AddressValidator addressValidator = new AddressValidator();
    private PersonValidator personValidator = new PersonValidator();

    void SendPackage(String addresseeName,
                     String addresseeSurname,
                     String senderName,
                     String senderSurname,
                     String postalCode,
                     String country,
                     String city,
                     String streetName,
                     Integer streetNumber) {

        Addressee addressee = new Addressee(addresseeName, addresseeSurname);
        Person sender = new Person(senderName, senderSurname);

        personValidator.validator(addressee);
        personValidator.validator(sender);

        Address address = new Address(postalCode, country, city, streetName, streetNumber);
        addressValidator.validator(address);

        (addressee).send(new Package(sender, address));

    }

}
