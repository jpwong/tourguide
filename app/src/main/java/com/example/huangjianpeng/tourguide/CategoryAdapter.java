package com.example.huangjianpeng.tourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by huangjianpeng on 2017/9/17.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new NatureFragment();
            case 1:
                return new AmusementFragment();
            case 2:
                return new MuseumFragment();
            case 3:
                return new ShoppingFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "自然";
            case 1:
                return "娱乐";
            case 2:
                return "博物馆";
            case 3:
                return "购物";
            default:
                return null;
        }
    }
}
