package org.example;

public class Client {
    private final String name;
    private final String email;

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public boolean hasValidEmail() {
        return email != null && email.contains("@");
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
