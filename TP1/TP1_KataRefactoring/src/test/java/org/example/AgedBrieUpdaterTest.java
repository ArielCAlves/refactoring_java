package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AgedBrieUpdaterTest {
    @Test
    void qualidadeNaoUltrapassaLimiteDeCinquenta() {
        Item item = new Item("Aged Brie", 5, 49);
        GildedRose app = new GildedRose(new Item[]{item});
        app.updateQuality();
        assertEquals(50, item.quality);
    }

}