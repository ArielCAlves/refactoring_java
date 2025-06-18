package org.example;

public enum InvoiceType {
    SIMPLE("Simples", "Nota fiscal simples"),
    TAXED("Com imposto", "Nota fiscal com imposto"),
    UNKNOWN("Desconhecido", "Tipo desconhecido");

    private final String description;
    private final String headerMessage;

    InvoiceType(String description, String headerMessage) {
        this.description = description;
        this.headerMessage = headerMessage;
    }

    public String getDescription() {
        return description;
    }

    public String getHeaderMessage() {
        return headerMessage;
    }

    public static InvoiceType from(int code) {
        return switch (code) {
            case 1 -> SIMPLE;
            case 2 -> TAXED;
            default -> UNKNOWN;
        };
    }
}
