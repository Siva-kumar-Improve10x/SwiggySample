package com.improve10x.swiggysample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ListOfFoodItems extends AppCompatActivity {
    RecyclerView swiggyRv;
    FoodItems[] foodItems;
    swiggyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_food_items);
        initViews();
        swiggyFoodData();
        setupAdapter();
        connectAdpater();
    }

    private void connectAdpater() {
        swiggyRv.setLayoutManager(new LinearLayoutManager(this));
        swiggyRv.setAdapter(adapter);
    }

    private void setupAdapter() {
        adapter = new swiggyAdapter(foodItems);
    }

    private void swiggyFoodData() {
        foodItems = new FoodItems[8];
        FoodItems items = new FoodItems();
        items.foodImageUrl = "https://media.istockphoto.com/id/501137061/photo/chicken-biryani-1-4.jpg?s=612x612&w=0&k=20&c=4YH3uPuv2iNyNTemn5bTxCyst608o3WDZNyATnibDsg=";
        items.foodName = "Aasife Biriyani ";
        items.subName = "Biryani,Tandoori and Chinese";
        items.rating = "4.5";
        items.deliveryTime = "30 mins";
        items.offerPercentage = "40%";
        foodItems[0] = items;

        FoodItems items1 = new FoodItems();
        items1.foodImageUrl = "https://b.zmtcdn.com/data/dish_photos/82b/fced4fb9b1001f87e43280e8e794582b.jpg";
        items1.foodName = "Akshaya Pure Veg";
        items1.subName = "South Indian & Chinese";
        items1.rating = "4.0";
        items1.deliveryTime = "30 mins";
        items1.offerPercentage = "veg";
        foodItems[1] = items1;

        FoodItems items2 = new FoodItems();
        items2.foodImageUrl = "https://media.istockphoto.com/id/1352474763/photo/fresh-chicken-tikka-roll-with-fresh-tomatos-salad-cheese-and-onions-isolated-on-bright-blue.jpg?s=612x612&w=0&k=20&c=-WxJN9lNR8HJcwCx1nNoYE8CRwkdY-iyBWxpKDsgspM=";
        items2.foodName = "Al Ajwain";
        items2.subName = "Chinese, Tandoori & Indian";
        items2.rating = "4.7";
        items2.deliveryTime = "30 mins";
        items2.offerPercentage = "";
        foodItems[2] = items2;


        FoodItems items3 = new FoodItems();
        items3.foodImageUrl = "https://healthyrecipesblogs.com/wp-content/uploads/2015/02/buffalo-chicken-drumsticks-featured.jpg";
        items3.foodName = "Anjappar";
        items3.subName = "Chinese, Tandoori & Indian";
        items3.rating = "3.2";
        items3.deliveryTime = "45 mins";
        items3.offerPercentage = "";
        foodItems[3] = items3;

        FoodItems items4 = new FoodItems();
        items4.foodImageUrl = "https://cdn.shopify.com/s/files/1/1060/3816/products/oreo-kit-kat-cake_89783459-6593-4f0d-8a38-7abc0f4f1fa3_large.jpg?v=1594973894";
        items4.foodName = "Cakes & Berrys";
        items4.subName = " Cakes,Sweets & Snacks";
        items4.rating = "4.5";
        items4.deliveryTime = "45 mins";
        items4.offerPercentage = "7%";
        foodItems[4] = items4;

        FoodItems items5 = new FoodItems();
        items5.foodImageUrl = "https://images.immediate.co.uk/production/volatile/sites/30/2020/08/recipe-image-legacy-id-1669_12-95a7943.jpg";
        items5.foodName = "Copper Kitchen";
        items5.subName = "Chettinadu, Chinese, Tandoori ";
        items5.rating = "3.3";
        items5.deliveryTime = "45 mins";
        items5.offerPercentage = "25%";
        foodItems[5] = items5;

        FoodItems items6 = new FoodItems();
        items6.foodImageUrl = "https://tasteasianfood.com/wp-content/uploads/2022/11/chicken-65-recipe-square-480x480.jpeg";
        items6.foodName = "SS Pandian";
        items6.subName = "Chettinada, Chinese, Tandoori ";
        items6.rating = "4.2";
        items6.deliveryTime = "30 mins";
        items6.offerPercentage = "20%";
        foodItems[6] = items6;

        FoodItems items7 = new FoodItems();
        items7.foodImageUrl = "https://www.cubesnjuliennes.com/wp-content/uploads/2020/07/Chicken-Biryani-Recipe.jpg";
        items7.foodName = "Biriyani";
        items7.subName = "spicy food,Tasty Biriyani";
        items7.rating = "5.0";
        items7.deliveryTime = "7 mins";
        items7.offerPercentage = "10%";
        foodItems[7] = items7;

    }

    private void initViews() {
        swiggyRv = findViewById(R.id.swiggy_rv);

    }
}