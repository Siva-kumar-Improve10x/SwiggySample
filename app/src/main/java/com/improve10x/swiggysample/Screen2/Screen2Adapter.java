package com.improve10x.swiggysample.Screen2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.improve10x.swiggysample.R;
import com.improve10x.swiggysample.Screen2ActionClick;

public class Screen2Adapter extends RecyclerView.Adapter<Screen2ViewHolder> {
    public Screen2items[] items;
    public Screen2ActionClick actionClick;
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
        if (screen2items.quntity == 0) {
            holder.minusBtn.setVisibility(View.GONE);
            holder.quntityTxt.setVisibility(View.GONE);
        } else {
            holder.quntityTxt.setText(screen2items.quntity + "");
            holder.minusBtn.setVisibility(View.VISIBLE);
            holder.quntityTxt.setVisibility(View.VISIBLE);
        }
        holder.plusBtn.setOnClickListener(v -> {
            actionClick.onAddClick(screen2items);
        });
        holder.minusBtn.setOnClickListener(v -> {
            actionClick.onRemoveClick(screen2items);
        });
    }
    @Override
    public int getItemCount() {
        return items.length;
    }
}


