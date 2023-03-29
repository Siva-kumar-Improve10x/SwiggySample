package com.improve10x.swiggysample.Screen2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.improve10x.swiggysample.R;
import com.improve10x.swiggysample.Screen2.Screen2Adapter;
import com.improve10x.swiggysample.Screen2.Screen2items;
import com.improve10x.swiggysample.Screen2ActionClick;

public class SwiggyScreen2Activity extends AppCompatActivity {
    RecyclerView screen2Rv;
    Screen2items[] screenFoodItems;
    Screen2Adapter adapter;
    Screen2ActionClick actionClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiggy_screen2);
        initViews();
        addFoodData();
        setupAdapter();
        connectAdapter();
        setupActionClick();
    }

    private void setupActionClick() {
        adapter.actionClick = new Screen2ActionClick() {
            @Override
            public void onAddClick(Screen2items item) {
                item.quntity++;
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onRemoveClick(Screen2items item) {
                item.quntity--;
                adapter.notifyDataSetChanged();

            }
        };
    }

    private void connectAdapter() {
        screen2Rv.setAdapter(adapter);
        screen2Rv.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setupAdapter() {
        adapter = new Screen2Adapter(screenFoodItems);
    }

    private void addFoodData() {
        screenFoodItems = new Screen2items[9];
        Screen2items items = new Screen2items();
        items.food = "Shawarma Roll";
        items.subfood = "Meat  cut into thin slices and stuffed in Kuboos";
        items.rupee = "80";
        items.quntity = 0;
        screenFoodItems[0] = items;

        Screen2items item1 = new Screen2items();
        item1.food = "Shawarma Roll";
        item1.subfood = "Meat  cut into thin slices and served with Kuboos";
        item1.rupee = "130";
        item1.quntity = 0;
        screenFoodItems[1] = item1;

        Screen2items item2 = new Screen2items();
        item2.food = "Special Shawarma Roll";
        item2.subfood = "Meat  cut into thin slices and styffed with special sauce";
        item2.rupee = "100";
        item2.quntity = 0;
        screenFoodItems[2] = item2;

        Screen2items item3 = new Screen2items();
        item3.food = "Special Shawarma Roll";
        item3.subfood = "Meat  cut into thin slices and served with Kuboos and sapecial sauce";
        item3.rupee = "140";
        item3.quntity = 0;
        screenFoodItems[3] = item3;

        Screen2items item4 = new Screen2items();
        item4.food = "Shawarma Roll";
        item4.subfood = "Meat  cut into thin slices and served with Kuboos and sapecial sauce";
        item4.rupee = "120";
        item4.quntity = 0;
        screenFoodItems[4] = item4;

        Screen2items item5 = new Screen2items();
        item5.food = "Shawarma";
        item5.subfood = "Meat  cut into thin slices and stuffed in Kuboos";
        item5.rupee = "180";
        item5.quntity = 0;
        screenFoodItems[5] = item5;

        Screen2items item6 = new Screen2items();
        item6.food = "Special Shawarma Roll";
        item6.subfood = "Meat  cut into thin slices and served with Kuboos and sapecial sauce";
        item6.rupee = "140";
        item6.quntity = 0;
        screenFoodItems[6] = item6;

        Screen2items item7 = new Screen2items();
        item7.food = "Shawarma Roll";
        item7.subfood = "Meat  cut into thin slices and served with Kuboos and sapecial sauce";
        item7.rupee = "120";
        item7.quntity = 0;
        screenFoodItems[7] = item7;

        Screen2items item8 = new Screen2items();
        item8.food = "Shawarma";
        item8.subfood = "Meat  cut into thin slices and stuffed in Kuboos";
        item8.rupee = "180";
        item8.quntity = 0;
        screenFoodItems[8] = item8;

    }

    private void initViews() {
        screen2Rv = findViewById(R.id.screen2_Rv);
    }
}