package com.example.foodlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<FoodItem> {
    Context context;
    ArrayList<FoodItem> list;

    public Adapter(Context context, ArrayList<FoodItem> list) {
        super(context, R.layout.food_list_item, R.id.food_list, list);

        this.context = context;
        this.list = list;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View currentView = convertView;

        if (currentView == null) {
            currentView = LayoutInflater.from(context).inflate(R.layout.food_list_item, parent, false);
        }

        TextView name = currentView.findViewById(R.id.food_name);
        TextView category = currentView.findViewById(R.id.food_category);
        TextView price = currentView.findViewById(R.id.food_price);
        ImageView imgView = currentView.findViewById(R.id.food_img);

        FoodItem obj = getItem(position);

        name.setText(obj.getName());
        category.setText(obj.getCategory());
        price.setText("\u20B9" + obj.getPrice());
        imgView.setImageDrawable(obj.getImg());

        return currentView;
    }
}
