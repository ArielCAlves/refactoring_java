package org.example;

class Item {
    private final String description;
    private final int quantity;
    private final double unitPrice;

    public Item(String description, int quantity, double unitPrice) {
        if (quantity <= 0) throw new IllegalArgumentException("A quantidade deve ser positiva");
        if (unitPrice < 0) throw new IllegalArgumentException("Preço inválido");
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getTotalPrice() {
        return quantity * unitPrice;
    }

    public String getFormattedLine() {
        return quantity + "x " + description + " - R$" + unitPrice;
    }
}

