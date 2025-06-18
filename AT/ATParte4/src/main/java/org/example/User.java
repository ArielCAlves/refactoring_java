package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {
    private final String name;
    private final String email;
    private final List<Address> addresses;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.addresses = new ArrayList<>();
    }

    public void addAddress(Address address) {
        addresses.add(address);
    }

    public List<Address> getAddresses() {
        return Collections.unmodifiableList(addresses);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
