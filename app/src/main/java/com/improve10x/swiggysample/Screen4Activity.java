package com.improve10x.swiggysample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Screen4Activity extends AppCompatActivity {
    RecyclerView screen4Rv;
    Screen4ItemActivity[] foods;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);
        initViews();
        addFoodData();
    }

    private void addFoodData() {
        foods = new Screen4ItemActivity[6];
        Screen4ItemActivity item = new Screen4ItemActivity();
        item.name = "";
        item.subName = "";
        item.amount = "";
        foods[0] = item;

        Screen4ItemActivity item1 = new Screen4ItemActivity();
        item1.name = "";
        item1.subName = "";
        item1.amount = "";
        foods[1] = item1;

        Screen4ItemActivity item2 = new Screen4ItemActivity();
        item2.name = "";
        item2.subName = "";
        item2.amount = "";
        foods[2] = item2;

        Screen4ItemActivity item3 = new Screen4ItemActivity();
        item3.name = "";
        item3.subName = "";
        item3.amount = "";
        foods[3] = item3;

        Screen4ItemActivity item4 = new Screen4ItemActivity();
        item4.name = "";
        item4.subName = "";
        item4.amount = "";
        foods[4] = item4;

        Screen4ItemActivity item5 = new Screen4ItemActivity();
        item5.name = "";
        item5.subName = "";
        item5.amount = "";
        foods[5] = item5;


    }

    private void initViews() {
        screen4Rv = findViewById(R.id.screen4_Rv);
    }
}