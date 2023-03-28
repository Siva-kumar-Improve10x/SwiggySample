package com.improve10x.swiggysample.Screen2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.improve10x.swiggysample.R;

public class Screen2Adapter extends RecyclerView.Adapter<Screen2ViewHolder> {
    public Screen2items[] items;
    public  Screen2Adapter(Screen2items[] screen2items){
        items = screen2items;
    }

    @NonNull
    @Override
    public Screen2ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.screen2_items,parent,false);
        Screen2ViewHolder screen2 = new Screen2ViewHolder(view);
        return screen2;
    }

    @Override
    public void onBindViewHolder(@NonNull Screen2ViewHolder holder, int position) {
        Screen2items screen2items = items[position];
        holder.foodTxt.setText(screen2items.food);
        holder.subFoodTxt.setText(screen2items.subfood);
        holder.rupeeTxt.setText(screen2items.rupee);
        holder.quntityTxt.setText(screen2items.quntity);

    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}


