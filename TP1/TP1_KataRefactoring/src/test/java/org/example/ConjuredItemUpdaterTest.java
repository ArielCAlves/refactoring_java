package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConjuredItemUpdaterTest {

    @Test
    void deveReduzirQualidadeDuasUnidadesPorDia() {
        Item item = new Item("Conjured Mana Cake", 5, 10);
        new ConjuredItemUpdater().update(item);
        assertEquals(8, item.quality);
        assertEquals(4, item.sellIn);
    }

    @Test
    void deveReduzirQualidadeQuatroUnidadesAposVencido() {
        Item item = new Item("Conjured Mana Cake", 0, 10);
        new ConjuredItemUpdater().update(item);
        assertEquals(6, item.quality);
        assertEquals(-1, item.sellIn);
    }

    @Test
    void qualidadeNaoDeveSerNegativa() {
        Item item = new Item("Conjured Mana Cake", 0, 1);
        new ConjuredItemUpdater().update(item);
        assertEquals(0, item.quality);
        assertEquals(-1, item.sellIn);
    }
}
