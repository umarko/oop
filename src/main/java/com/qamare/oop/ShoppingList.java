package com.qamare.oop;

import com.qamare.oop.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {

    private List<Item> items = new ArrayList();

    public double add(Item item) {
        items.add(item);
        return items.stream()
                .mapToDouble(it -> it.getPrice())
                .sum();
    }
}
