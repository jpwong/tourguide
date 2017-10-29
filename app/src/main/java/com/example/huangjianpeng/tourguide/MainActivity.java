package com.example.huangjianpeng.tourguide;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.TabLayout;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        CategoryAdapter categoryAdapter = new CategoryAdapter(getSupportFragmentManager());

        viewPager.setAdapter(categoryAdapter);

        tabLayout.setupWithViewPager(viewPager);
    }

}
