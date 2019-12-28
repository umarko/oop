package com.qamare.oop.item;

abstract public class Item {

    protected double price;
    protected String description;

    public Item(double price, String description) {
        this.price = price;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }
}
