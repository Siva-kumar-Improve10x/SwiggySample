package com.improve10x.swiggysample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class swiggyAdapter extends RecyclerView.Adapter<swiggyViewHolder> {
    FoodItems[] items;
    public swiggyAdapter(FoodItems[] foodItems){
        items = foodItems;
    }

    @NonNull
    @Override
    public swiggyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.food_items,parent,false);
        swiggyViewHolder swiggy = new swiggyViewHolder(view);
        return swiggy;
    }

    @Override
    public void onBindViewHolder(@NonNull swiggyViewHolder holder, int position) {
        FoodItems foodItems = items[position];
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
