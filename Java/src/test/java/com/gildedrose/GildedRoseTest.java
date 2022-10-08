package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {


    @Test
    void test1() {
        Item[] items = new Item[] { new Item("bread", 0, -1)};
        GildedRose test = new GildedRose(items);
        test.updateQuality();
        assertEquals(-1, test.items[0].quality);
    }

    @Test
    void test2() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 50)};
        GildedRose test = new GildedRose(items);
        test.updateQuality();
        assertEquals(50, test.items[0].quality);
    }

    @Test
    void test3() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 10)};
        GildedRose test = new GildedRose(items);
        test.updateQuality();
        assertEquals(11, test.items[0].quality);
    }

    @Test
    void test4() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 11, 49)};
        GildedRose test = new GildedRose(items);
        test.updateQuality();
        assertEquals(50, test.items[0].quality);
    }

    void test5() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 6, 49)};
        GildedRose test = new GildedRose(items);
        test.updateQuality();
        assertEquals(51, test.items[0].quality);
    }
    void test6() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", -1, 49)};
        GildedRose test = new GildedRose(items);
        test.updateQuality();
        assertEquals(0, test.items[0].quality);
    }

    void test7() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 6, 5)};
        GildedRose test = new GildedRose(items);
        test.updateQuality();
        assertEquals(6, test.items[0].sellIn);
    }

    void test8() {
        Item[] items = new Item[] { new Item("Aged Brie", -5, 5)};
        GildedRose test = new GildedRose(items);
        test.updateQuality();
        assertEquals(7, test.items[0].quality);
    }

    void test9() {
        Item[] items = new Item[] { new Item("Bread", -6, 5)};
        GildedRose test = new GildedRose(items);
        test.updateQuality();
        assertEquals(3, test.items[0].quality);
    }

    void test10() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 5)};
        GildedRose test = new GildedRose(items);
        test.updateQuality();
        assertEquals(8, test.items[0].quality);
    }

}
