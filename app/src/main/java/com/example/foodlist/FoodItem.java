package com.example.foodlist;

public class FoodItem {
    public String name;
    public String category;
    public float price;

    public FoodItem(String name, String category, float price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() { return name; }

    public String getCategory() { return category; }

    public float getPrice() { return price; }
}
