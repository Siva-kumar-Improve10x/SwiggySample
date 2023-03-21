package com.improve10x.swiggysample;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class swiggyViewHolder extends RecyclerView.ViewHolder {
    public ImageView foodImageIv;
    public TextView foodNameTxt;
    public TextView subNameTxt;
    public TextView offerPercentageTxt;
    public TextView ratingTxt;
    public TextView deliveryTimeTxt;

    public swiggyViewHolder(@NonNull View itemView) {
        super(itemView);
        foodImageIv = itemView.findViewById(R.id.foodimage_iv);
        foodNameTxt = itemView.findViewById(R.id.foodname_txt);
        subNameTxt = itemView.findViewById(R.id.subname_txt);
        offerPercentageTxt = itemView.findViewById(R.id.offerpercentage_txt);
        ratingTxt = itemView.findViewById(R.id.rating_txt);
        deliveryTimeTxt = itemView.findViewById(R.id.deliverytime_txt);
    }
}
