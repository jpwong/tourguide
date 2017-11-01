package com.example.huangjianpeng.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;

public class DetailInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_info);

        Intent intent = getIntent();

        TextView nameText = (TextView) findViewById(R.id.tile);

        nameText.setText(intent.getIntExtra("name", R.string.none));

        ImageView imageView = (ImageView) findViewById(R.id.big_image);

        Glide.with(this).load(intent.getIntExtra("image", 0)).into(imageView);

        TextView addrText = (TextView) findViewById(R.id.address);

        addrText.setText(intent.getIntExtra("address", R.string.none));
    }
}
