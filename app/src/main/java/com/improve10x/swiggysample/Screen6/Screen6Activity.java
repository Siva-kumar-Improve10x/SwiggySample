package com.improve10x.swiggysample.Screen6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.improve10x.swiggysample.R;

public class Screen6Activity extends AppCompatActivity {
    Screen6Item[] foodItem;
    RecyclerView screenRv;
    Screen6Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiggy_new_screen);
        initViews();
        addScreen2Data();
        setUpAdapter();
        connectAdapter();

    }

    private void connectAdapter() {
        screenRv.setAdapter(adapter);
        screenRv.setLayoutManager(new GridLayoutManager(this,3));
    }

    private void setUpAdapter() {
        adapter = new Screen6Adapter(foodItem);
    }

    private void addScreen2Data() {
        foodItem = new Screen6Item[7];
        Screen6Item item = new Screen6Item();
        item.imageUrl = "https://cdn1.matadornetwork.com/blogs/1/2019/05/Thalassery-Chicken-Dum-Biryani-and-chilli-chicken-curry-560x420.jpg";
        item.offerRate = "-40%";
        item.foodName = "Aasife Biriyani";
        item.foodSubName = "Biryani,Tandoori and Chinese";
        item.rating = "4.5";
        item.deliveryTime = "35 mins";
        foodItem[0] = item;

        Screen6Item item1 = new Screen6Item();
        item1.imageUrl = "https://cdn1.matadornetwork.com/blogs/1/2019/05/Thalassery-Chicken-Dum-Biryani-and-chilli-chicken-curry-560x420.jpg";
        item1.offerRate = "";
        item1.foodName = "Akshaya Pure Veg";
        item1.foodSubName = "South Indian & Chinese";
        item1.rating = "3.0";
        item1.deliveryTime = "20 mins";
        foodItem[1] = item1;

        Screen6Item item2 = new Screen6Item();
        item2.imageUrl = "https://cdn1.matadornetwork.com/blogs/1/2019/05/Thalassery-Chicken-Dum-Biryani-and-chilli-chicken-curry-560x420.jpg";
        item2.offerRate = "";
        item2.foodName = "Al Ajwain";
        item2.foodSubName = "Chinese, Tandoori & Indian";
        item2.rating = "3.5";
        item2.deliveryTime = "20 mins";
        foodItem[2] = item2;

        Screen6Item item3 = new Screen6Item();
        item3.imageUrl = "https://cdn1.matadornetwork.com/blogs/1/2019/05/Thalassery-Chicken-Dum-Biryani-and-chilli-chicken-curry-560x420.jpg";
        item3.offerRate = "";
        item3.foodName = "Anjappar";
        item3.foodSubName = "Chinese, Tandoori & Indian";
        item3.rating = "4.2";
        item3.deliveryTime = "35 mins";
        foodItem[3] = item3;

        Screen6Item item4 = new Screen6Item();
        item4.imageUrl = "https://cdn1.matadornetwork.com/blogs/1/2019/05/Thalassery-Chicken-Dum-Biryani-and-chilli-chicken-curry-560x420.jpg";
        item4.offerRate = "-25%";
        item4.foodName = "Cakes & Berrys";
        item4.foodSubName = "Cakes,Sweets & Snacks";
        item4.rating = "4.0";
        item4.deliveryTime = "40 mins";
        foodItem[4] = item4;

        Screen6Item item5 = new Screen6Item();
        item5.imageUrl = "https://cdn1.matadornetwork.com/blogs/1/2019/05/Thalassery-Chicken-Dum-Biryani-and-chilli-chicken-curry-560x420.jpg";
        item5.offerRate = "-10%";
        item5.foodName = "Copper Kitchen";
        item5.foodSubName = "Chettinadu, Chinese, Tandoori";
        item5.rating = "3.0";
        item5.deliveryTime = "35 mins";
        foodItem[5] = item5;

        Screen6Item item6 = new Screen6Item();
        item6.imageUrl = "https://cdn1.matadornetwork.com/blogs/1/2019/05/Thalassery-Chicken-Dum-Biryani-and-chilli-chicken-curry-560x420.jpg";
        item6.offerRate = "-25%";
        item6.foodName = "SS Pandian";
        item6.foodSubName = "spicy food,Tasty Biriyani";
        item6.rating = "4.5";
        item6.deliveryTime = "45mins";
        foodItem[6] = item6;
    }

    private void initViews() {
        screenRv = findViewById(R.id.screen6_Rv);
    }
}