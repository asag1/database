package com.crazyfingers;

class Inventory {
    Item[] items;

    public Inventory(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (items[i].name.equals("Fuel level sensor")) {
                System.out.println("can't sell Fuel level sensor");
            } else {
                if (items[i].quality >= 0 && items[i].quality <= 50) {

                    switch (items[i].name) {
                        case "FM-Pro4":
                            items[i].quality = items[i].quality + 1;
                            break;
                        case "FM-Tco4 LCV":
                            if (items[i].sellIn < 11 && items[i].sellIn > 5) {
                                items[i].quality = items[i].quality + 2;
                            } else if (items[i].sellIn < 6 && items[i].sellIn >= 0) {
                                items[i].quality = items[i].quality + 3;
                            } else if (items[i].sellIn > 10) {
                                items[i].quality = items[i].quality - 1;
                            } else
                                items[i].quality = 0;
                            break;
                        default:
                            items[i].quality = items[i].quality - 1;
                    }
                } else if (items[i].quality < 0) {
                    items[i].quality = 0;
                } else {
                    items[i].quality = 50;
                }
                if (items[i].quality > 50) {
                    items[i].quality = 50;
                } else if (items[i].quality < 0) {
                    items[i].quality = 0;
                }
                items[i].sellIn = items[i].sellIn - 1;
            }
        }
    }
}

