package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SulfurasUpdaterTest {
    @Test
    void sulfurasNaoSofreAlteracao() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
        GildedRose app = new GildedRose(new Item[]{item});
        app.updateQuality();
        assertEquals(80, item.quality);
        assertEquals(0, item.sellIn);
    }
}