package org.example;

class Client {
    private final String name;
    private final String email;

    public Client(String name, String email) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Nome inválido");
        if (email == null || email.isEmpty()) throw new IllegalArgumentException("Email inválido");
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

