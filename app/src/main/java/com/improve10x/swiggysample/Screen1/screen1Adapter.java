package com.improve10x.swiggysample.Screen1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.improve10x.swiggysample.R;
import com.squareup.picasso.Picasso;

public class screen1Adapter extends RecyclerView.Adapter<screen1ViewHolder> {
    screen1FoodItems[] items;
    public screen1Adapter(screen1FoodItems[] foodItems){
        items = foodItems;
    }

    @NonNull
    @Override
    public screen1ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.food_items,parent,false);
        screen1ViewHolder swiggy = new screen1ViewHolder(view);
        return swiggy;
    }

    @Override
    public void onBindViewHolder(@NonNull screen1ViewHolder holder, int position) {
        screen1FoodItems foodItems = items[position];
        holder.foodNameTxt.setText(foodItems.foodName);
        holder.subNameTxt.setText(foodItems.subName);
        holder.offerPercentageTxt.setText(foodItems.offerPercentage);
        holder.ratingTxt.setText(foodItems.rating);
        holder.deliveryTimeTxt.setText(foodItems.deliveryTime);
        Picasso.get().load(foodItems.foodImageUrl).into(holder.foodImageIv);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }

}
