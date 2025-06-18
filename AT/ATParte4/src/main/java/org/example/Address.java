package org.example;

public class Address {
    private final String street;
    private final String city;
    private final String zipCode;
    private final AddressType type;

    public Address(String street, String city, String zipCode, AddressType type) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.type = type;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public AddressType getType() {
        return type;
    }
}
