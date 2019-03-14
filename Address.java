package io.codelex.solidexamples;

class Address {
    private final String postalCode;
    private final String country;
    private final String city;
    private final String streetName;
    private final Integer streetNumber;

    Address(String postalCode, String country, String city, String streetName, Integer streetNumber) {
        this.postalCode = postalCode;
        this.country = country;
        this.city = city;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
    }

    String writeAddress() {
        return this.country + ", " + this.city + ", " + this.postalCode + ", " + this.streetName + " " + this.streetNumber;
    }

    String getPostalCode() {
        return postalCode;
    }

    String getCountry() {
        return country;
    }

    String getCity() {
        return city;
    }

    String getStreetName() {
        return streetName;
    }

    Integer getStreetNumber() {
        return streetNumber;
    }
}
