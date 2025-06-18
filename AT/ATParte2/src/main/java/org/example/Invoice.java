package org.example;

public class Invoice {
    private final Client client;
    private final double amount;
    private final InvoiceType type;

    public Invoice(Client client, double amount, int typeCode) {
        this.client = client;
        this.amount = amount;
        this.type = InvoiceType.from(typeCode);
    }

    public void process() {
        if (!client.hasValidEmail()) {
            System.out.println("Email inválido. Falha no envio.");
            return;
        }

        System.out.println(type.getHeaderMessage());
        String content = buildContent();
        System.out.println(content);
        EmailService.send(client.getEmail(), content);
    }

    private String buildContent() {
        return "--- NOTA FISCAL ---\n" +
                "Cliente: " + client.getName() + "\n" +
                "Valor: R$ " + amount + "\n" +
                "Tipo: " + type.getDescription() + "\n" +
                "---------------------";
    }
}
