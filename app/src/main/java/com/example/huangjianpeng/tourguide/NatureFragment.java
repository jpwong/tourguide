package com.example.huangjianpeng.tourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by huangjianpeng on 2017/9/17.
 */

public class NatureFragment extends Fragment {
    private String tag = "nature";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Log.i(tag,"onCreateView");
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
