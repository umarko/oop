package com.qamare.oop;

import com.qamare.oop.item.AppleJuice;
import com.qamare.oop.item.Bread;
import com.qamare.oop.item.Ham;
import com.qamare.oop.item.Orange;
import org.springframework.util.Assert;

public class Main {

    public static void main(String[] args) {

        ShoppingList shoppingList = new ShoppingList();

        shoppingList.add(new Orange());
        shoppingList.add(new AppleJuice());
        shoppingList.add(new Bread());
        double totalPrice = shoppingList.add(new Ham());

        Assert.isTrue(totalPrice == 29.5, "total price");
    }

}
