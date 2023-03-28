package com.improve10x.swiggysample.Screen6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.improve10x.swiggysample.R;
import com.squareup.picasso.Picasso;

public class Screen6Adapter extends  RecyclerView.Adapter<Screen6ViewHolder>{
    public Screen6Item[] items ;
    public Screen6Adapter(Screen6Item[] screen6Items){
        items = screen6Items;
    }
    @NonNull
    @Override
    public Screen6ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.screen6_items,parent,false);
        Screen6ViewHolder screen6ViewHolder = new Screen6ViewHolder(view);
        return screen6ViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Screen6ViewHolder holder, int position) {
        Screen6Item food = items[position];
        Picasso.get().load(food.imageUrl).into(holder.biriyaniIv);
        holder.discountTxt.setText(food.offerRate);
        holder.itemNameTxt.setText(food.foodName);
        holder.subItemNameTxt.setText(food.foodSubName);
        holder.itemRatingTxt.setText(food.rating);
        holder.itemDeliveryTimTxt.setText(food.deliveryTime);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
