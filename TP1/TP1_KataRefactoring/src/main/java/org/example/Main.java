package org.example;

public class Main {
    public static void main(String[] args) {
        Item[] items = new Item[] {
                new Item("Aged Brie", 10, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 30),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("+5 Dexterity Vest", 10, 20)
        };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        for (Item item : items) {
            System.out.println(item);
        }
    }
}
