package com.example.huangjianpeng.tourguide;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by huangjianpeng on 2017/9/17.
 */

public class AmusementFragment extends Fragment {
    private String tag = "amusement";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Log.i(tag,"onCreateView");

        View rootView = inflater.inflate(R.layout.scenic_spot_list, container, false);

        final ArrayList<ScenicSpot> scenicSpotArrayList = new ArrayList<>();

        scenicSpotArrayList.add(new ScenicSpot(R.string.amusement_changlong,
                R.drawable.changlong, R.string.amusement_changlong_ad));
        scenicSpotArrayList.add(new ScenicSpot(R.string.amusement_yuwenquan,
                R.drawable.yuwenquan, R.string.amusement_yuwenquan_ad));
        scenicSpotArrayList.add(new ScenicSpot(R.string.amusement_menghuanshuicheng,
                R.drawable.menghuanshuicheng, R.string.amusement_menghuanshuicheng_ad));
        scenicSpotArrayList.add(new ScenicSpot(R.string.amusement_saichechang,
                R.drawable.saichechang, R.string.amusement_saichechang_ad));
        scenicSpotArrayList.add(new ScenicSpot(R.string.amusement_yuchang,
                R.drawable.yuchang, R.string.amusement_yuwenquan_ad));

        ScenicSpotAdapter scenicSpotAdapter = new ScenicSpotAdapter(getActivity(), scenicSpotArrayList);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(scenicSpotAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                ScenicSpot scenicSpot = scenicSpotArrayList.get(i);

                Intent intent = new Intent(getContext(),DetailInfoActivity.class);

                intent.putExtra("name",scenicSpot.getNameId());
                intent.putExtra("image",scenicSpot.getImageId());
                intent.putExtra("address",scenicSpot.getAddressId());

                startActivity(intent);
            }
        });

        return rootView;
    }
}
