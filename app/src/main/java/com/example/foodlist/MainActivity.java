package com.example.foodlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    protected ListView foodListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foodListView = findViewById(R.id.food_list);

        ArrayList<FoodItem> foodItemList = new ArrayList<>();

        foodItemList.add(new FoodItem("Pizza", "Italian", 670));
        foodItemList.add(new FoodItem("Ramen", "Japanese", 435));
        foodItemList.add(new FoodItem("Sushi", "Japanese", 355));
        foodItemList.add(new FoodItem("Ratatouille", "French", 190));
        foodItemList.add(new FoodItem("Dosa", "Indian", 155));

        Adapter adapter = new Adapter(getApplicationContext(), foodItemList);
        foodListView.setAdapter(adapter);
        foodListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),
                        (position + 1) + ":" + adapter.getItem(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}