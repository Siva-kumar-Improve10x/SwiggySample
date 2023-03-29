package com.improve10x.swiggysample.Screen4;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.improve10x.swiggysample.R;

public class Screen4ViewHolder extends RecyclerView.ViewHolder {
    TextView nameTxt;
    TextView subItemTxt;
    TextView priceTxt;
    TextView unavailableTxt;
    public Screen4ViewHolder(@NonNull View itemView) {
        super(itemView);
        nameTxt = itemView.findViewById(R.id.name_txt);
        subItemTxt = itemView.findViewById(R.id.subitem_txt);
        priceTxt = itemView.findViewById(R.id.price_txt);
        unavailableTxt = itemView.findViewById(R.id.unavailable_txt);
    }
}
