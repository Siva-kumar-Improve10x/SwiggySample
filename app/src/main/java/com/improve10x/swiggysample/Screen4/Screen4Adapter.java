package com.improve10x.swiggysample.Screen4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.improve10x.swiggysample.R;

public class Screen4Adapter extends RecyclerView.Adapter<Screen4ViewHolder> {
    Screen4ItemActivity[] itemActivity;
    public Screen4Adapter(Screen4ItemActivity[] screen4ItemActivity){
        itemActivity = screen4ItemActivity;
    }

    @NonNull
    @Override
    public Screen4ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.screen4_items,parent,false);
        Screen4ViewHolder activity = new Screen4ViewHolder(view);
        return activity;
    }

    @Override
    public void onBindViewHolder(@NonNull Screen4ViewHolder holder, int position) {
        Screen4ItemActivity food = itemActivity[position];
        holder.nameTxt.setText(food.name);
        holder.subItemTxt.setText(food.subName);
        holder.priceTxt.setText(food.amount);
        holder.unavailableTxt.setText(food.unavailable);
    }

    @Override
    public int getItemCount() {
        return itemActivity.length;
    }
}
