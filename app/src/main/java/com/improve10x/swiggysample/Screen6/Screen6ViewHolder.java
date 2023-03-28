package com.improve10x.swiggysample.Screen6;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.improve10x.swiggysample.R;

public class Screen6ViewHolder extends RecyclerView.ViewHolder {
    public ImageView biriyaniIv;
    public TextView discountTxt;
    public TextView itemNameTxt;
    public TextView subItemNameTxt;
    public TextView itemRatingTxt;
    public TextView itemDeliveryTimTxt;
    public Screen6ViewHolder(@NonNull View itemView) {
        super(itemView);
        biriyaniIv = itemView.findViewById(R.id.biriyani_Iv);
        discountTxt = itemView.findViewById(R.id.discount_txt);
        itemNameTxt = itemView.findViewById(R.id.itemname_txt);
        subItemNameTxt = itemView.findViewById(R.id.subitemname_txt);
        itemRatingTxt = itemView.findViewById(R.id.itemrating_txt);
        itemDeliveryTimTxt = itemView.findViewById(R.id.itemdeliverytim_txt);
    }
}
