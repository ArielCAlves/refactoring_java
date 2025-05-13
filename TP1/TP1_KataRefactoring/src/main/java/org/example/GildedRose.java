package org.example;

import java.util.HashMap;
import java.util.Map;

class GildedRose {
    Item[] items;
    private final Map<String, ItemUpdater> updaterMap;

    public GildedRose(Item[] items) {
        this.items = items;
        this.updaterMap = new HashMap<>();
        updaterMap.put("Aged Brie", new AgedBrieUpdater());
        updaterMap.put("Backstage passes to a TAFKAL80ETC concert", new BackstagePassUpdater());
        updaterMap.put("Sulfuras, Hand of Ragnaros", new SulfurasUpdater());
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemUpdater updater = updaterMap.getOrDefault(item.name, new DefaultUpdater());
            updater.update(item);
        }
    }
}
