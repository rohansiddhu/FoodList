package com.example.foodlist;

import android.graphics.drawable.Drawable;
import android.media.Image;

public class FoodItem {
    public String name;
    public String category;
    public float price;
    public Drawable img;

    public FoodItem(String name, String category, float price, Drawable img) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.img = img;
    }

    public String getName() { return name; }

    public String getCategory() { return category; }

    public float getPrice() { return price; }

    public Drawable getImg() { return img; }
}
