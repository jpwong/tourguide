package com.example.huangjianpeng.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangjianpeng on 2017/9/17.
 */

public class ScenicSpotAdapter extends ArrayAdapter<ScenicSpot> {

    public ScenicSpotAdapter(Context context, ArrayList<ScenicSpot> ScenicSpots) {
        super(context, 0, ScenicSpots);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.scenic_spot, parent,false);
        }

        ScenicSpot currentItem = getItem(position);

        ImageView imageView = listItemView.findViewById(R.id.image);

        Glide.with(getContext()).load(currentItem.getImageId()).into(imageView);

        TextView nameText = listItemView.findViewById(R.id.name_text);

        nameText.setText(currentItem.getNameId());

        TextView addrText = listItemView.findViewById(R.id.addr_text);

        addrText.setText(currentItem.getAddressId());

        return listItemView;
    }
}
