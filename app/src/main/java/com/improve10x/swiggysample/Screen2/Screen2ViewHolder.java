package com.improve10x.swiggysample.Screen2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.improve10x.swiggysample.R;

public class Screen2ViewHolder extends RecyclerView.ViewHolder {
    public TextView foodTxt;
    public TextView rupeeTxt;
    public TextView subFoodTxt;
    public TextView quntityTxt;
    public Screen2ViewHolder(@NonNull View itemView) {
        super(itemView);
        foodTxt = itemView.findViewById(R.id.food_txt);
        rupeeTxt = itemView.findViewById(R.id.rupee_txt);
        subFoodTxt = itemView.findViewById(R.id.subfood_txt);
        quntityTxt = itemView.findViewById(R.id.quntity_txt);

    }
}
