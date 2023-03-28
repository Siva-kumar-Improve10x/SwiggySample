package com.improve10x.swiggysample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class SwiggyNewScreen extends AppCompatActivity {
    Screen6Item[] foodItem;
    RecyclerView screen2Rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiggy_new_screen);
        initViews();
        addScreen2Data();
    }

    private void addScreen2Data() {
        foodItem = new Screen6Item[7];
        Screen6Item item = new Screen6Item();
        item.imageUrl = "";
        item.offerRate = "-40%";
        item.foodName = "Aasife Biriyani";
        item.foodSubName = "Biryani,Tandoori and Chinese";
        item.rating = "4.5";
        item.deliveryTime = "35 mins";
        foodItem[0] = item;

        Screen6Item item1 = new Screen6Item();
        item1.imageUrl = "";
        item1.offerRate = "";
        item1.foodName = "Akshaya Pure Veg";
        item1.foodSubName = "South Indian & Chinese";
        item1.rating = "3.0";
        item1.deliveryTime = "20 mins";
        foodItem[1] = item1;

        Screen6Item item2 = new Screen6Item();
        item2.imageUrl = "";
        item2.offerRate = "";
        item2.foodName = "Al Ajwain";
        item2.foodSubName = "Chinese, Tandoori & Indian";
        item2.rating = "3.5";
        item2.deliveryTime = "20 mins";
        foodItem[2] = item2;

        Screen6Item item3 = new Screen6Item();
        item3.imageUrl = "";
        item3.offerRate = "";
        item3.foodName = "Anjappar";
        item3.foodSubName = "Chinese, Tandoori & Indian";
        item3.rating = "4.2";
        item3.deliveryTime = "35 mins";
        foodItem[3] = item3;

        Screen6Item item4 = new Screen6Item();
        item4.imageUrl = "";
        item4.offerRate = "-25%";
        item4.foodName = "Cakes & Berrys";
        item4.foodSubName = "Cakes,Sweets & Snacks";
        item4.rating = "4.0";
        item4.deliveryTime = "40 mins";
        foodItem[4] = item4;

        Screen6Item item5 = new Screen6Item();
        item5.imageUrl = "";
        item5.offerRate = "-10%";
        item5.foodName = "Copper Kitchen";
        item5.foodSubName = "Chettinadu, Chinese, Tandoori";
        item5.rating = "3.0";
        item5.deliveryTime = "35 mins";
        foodItem[5] = item5;

        Screen6Item item6 = new Screen6Item();
        item6.imageUrl = "";
        item6.offerRate = "-25%";
        item6.foodName = "SS Pandian";
        item6.foodSubName = "spicy food,Tasty Biriyani";
        item6.rating = "4.5";
        item6.deliveryTime = "45mins";
        foodItem[6] = item6;
    }

    private void initViews() {
        screen2Rv = findViewById(R.id.screen2_Rv);
    }
}