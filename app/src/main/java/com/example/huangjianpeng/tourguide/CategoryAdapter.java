package com.example.huangjianpeng.tourguide;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by huangjianpeng on 2017/9/17.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    public static final int TAB_COUNT = 4;
    public static final int PARKS_INDEX = 0;
    public static final int AMUSEMENT_INDEX = 1;
    public static final int MUSEUM_INDEX = 2;
    public static final int SHOPPING_INDEX = 3;

    private Context context;

    public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case PARKS_INDEX:
                return new ParksFragment();
            case AMUSEMENT_INDEX:
                return new AmusementFragment();
            case MUSEUM_INDEX:
                return new MuseumFragment();
            case SHOPPING_INDEX:
                return new ShoppingFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return TAB_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case PARKS_INDEX:
                return context.getString(R.string.category_parks);
            case AMUSEMENT_INDEX:
                return context.getString(R.string.category_amusement);
            case MUSEUM_INDEX:
                return context.getString(R.string.category_museum);
            case SHOPPING_INDEX:
                return context.getString(R.string.category_shopping);
            default:
                return null;
        }
    }
}
