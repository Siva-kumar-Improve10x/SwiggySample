package com.improve10x.swiggysample.Screen4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.improve10x.swiggysample.R;

public class Screen4Activity extends AppCompatActivity {
    RecyclerView screen4Rv;
    Screen4ItemActivity[] foods;
    Screen4Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);
        initViews();
        addFoodData();
        setUpAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        screen4Rv.setAdapter(adapter);
        screen4Rv.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpAdapter() {
        adapter = new Screen4Adapter(foods);
    }

    private void addFoodData() {
        foods = new Screen4ItemActivity[6];
        Screen4ItemActivity item = new Screen4ItemActivity();
        item.name = "Al Ajwein";
        item.subName = "Chinese, Tandoori and Indian";
        item.amount = "110";
        foods[0] = item;

        Screen4ItemActivity item1 = new Screen4ItemActivity();
        item1.name = "Al Ajwein";
        item1.subName = "Chicken and Vegetable soup";
        item1.amount = "160";
        item1.unavailable = "unavailable";
        foods[1] = item1;

        Screen4ItemActivity item2 = new Screen4ItemActivity();
        item2.name = "Al Ajwein";
        item2.subName = "Cream of Chicken soup";
        item2.amount = "112";
        foods[2] = item2;

        Screen4ItemActivity item3 = new Screen4ItemActivity();
        item3.name = "Chicken soup";
        item3.subName = "A vibrant soup that will be a delight for the whole family";
        item3.amount = "140";
        foods[3] = item3;

        Screen4ItemActivity item4 = new Screen4ItemActivity();
        item4.name = "Cream of Chicken soup";
        item4.subName = "A vibrant soup that will be a delight for the whole family";
        item4.amount = "120";
        foods[4] = item4;

        Screen4ItemActivity item5 = new Screen4ItemActivity();
        item5.name = "Broccoli parmesan Chicken soup";
        item5.subName = "A vibrant soup that will be a delight for the whole family";
        item5.amount = "160";
        foods[5] = item5;


    }

    private void initViews() {
        screen4Rv = findViewById(R.id.screen4_Rv);
    }
}