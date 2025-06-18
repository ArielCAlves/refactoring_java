package org.example;

public class Main {
    public static void main(String[] args) {
        User user = new User("Yagami", "yagami@gmail.com");

        Address a1 = new Address("Rua Kira", "Tóquio", "12345-000", AddressType.RESIDENTIAL);
        Address a2 = new Address("Av Death Note", "Osaka", "54321-000", AddressType.COMMERCIAL);

        user.addAddress(a1);
        user.addAddress(a2);

        for (Address addr : user.getAddresses()) {
            System.out.println(addr.getStreet() + " - " + addr.getType());
        }
    }
}
