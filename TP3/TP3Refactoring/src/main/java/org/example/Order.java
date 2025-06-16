package org.example;

import java.util.ArrayList;
import java.util.List;

class Order {
    private final Client client;
    private final List<Item> items;
    private final double discountRate = 0.1;

    public Order(Client client) {
        if (client == null) throw new IllegalArgumentException("Cliente inválido");
        this.client = client;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (item == null) throw new IllegalArgumentException("Item inválido");
        items.add(item);
    }

    public void printInvoice() {
        System.out.println("Cliente: " + client.getName());
        for (Item item : items) {
            System.out.println(item.getFormattedLine());
        }
        System.out.println("Subtotal: R$" + getSubtotal());
        System.out.println("Desconto: R$" + getDiscount());
        System.out.println("Total final: R$" + getFinalTotal());
    }

    public void sendConfirmationEmail() {
        String message = "Pedido recebido, volte sempre!";
        EmailService.sendEmail(client.getEmail(), message);
    }

    private double getSubtotal() {
        return items.stream()
                .mapToDouble(Item::getTotalPrice)
                .sum();
    }

    private double getDiscount() {
        return DiscountPolicy.calculateDiscount(getSubtotal(), discountRate);
    }

    private double getFinalTotal() {
        return getSubtotal() - getDiscount();
    }
}
