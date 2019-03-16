package io.codelex.solidexamples;

class PostalService {
    private AddressValidator addressValidator = new AddressValidator();
    private PersonValidator personValidator = new PersonValidator();

    void SendPackage(String addresseeName,
                     String addresseeSurname,
                     String addresseeID,
                     String senderName,
                     String senderSurname,
                     String senderID,
                     String postalCode,
                     String country,
                     String city,
                     String streetName,
                     Integer streetNumber) {

        Addressee addressee = new PersonAddressee(addresseeName, addresseeSurname, addresseeID);
        Person sender = new Person(senderName, senderSurname, senderID);

        personValidator.validator(addressee);
        personValidator.validator(sender);

        Address address = new Address(postalCode, country, city, streetName, streetNumber);
        addressValidator.validator(address);

        addressee.send(new Package(sender, address));

    }

    void SendLetter(String addresseeName,
                    String addresseeSurname,
                    String addresseeID,
                    String senderName,
                    String senderSurname,
                    String senderID,
                    String postalCode,
                    String country,
                    String city,
                    String streetName,
                    Integer streetNumber) {

        Addressee addressee = (Addressee) setAndValidatePerson(addresseeName, addresseeSurname, addresseeID);
        Person sender = setAndValidatePerson(senderName, senderSurname, senderID);

        Address address = setAndValidateAddress(postalCode, country, city, streetName, streetNumber);
        
        addressee.send(new Letter(sender, address));

    }

    private Person setAndValidatePerson(String name,
                                        String surname,
                                        String id) {
        Person addressee = new PersonAddressee(name, surname, id);

        personValidator.validator(addressee);

        return addressee;
    }

    private Address setAndValidateAddress(String postalCode,
                                          String country,
                                          String city,
                                          String streetName,
                                          Integer streetNumber) {

        Address address = new Address(postalCode, country, city, streetName, streetNumber);

        addressValidator.validator(address);

        return address;
    }

}
