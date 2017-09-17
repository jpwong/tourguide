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
import java.util.List;

/**
 * Created by huangjianpeng on 2017/9/17.
 */

public class ParksFragment extends Fragment {
    private String tag = "parks";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Log.i(tag,"onCreateView");

        View rootView = inflater.inflate(R.layout.scenic_spot_list, container, false);

        final ArrayList<ScenicSpot> scenicSpotArrayList = new ArrayList<>();

        scenicSpotArrayList.add(new ScenicSpot(R.string.parks_yunv,R.drawable.yunv,R.string.parks_yunv_ad));

        ScenicSpotAdapter scenicSpotAdapter = new ScenicSpotAdapter(getActivity(), scenicSpotArrayList);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(scenicSpotAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                ScenicSpot scenicSpot = scenicSpotArrayList.get(i);

                Intent intent = new Intent(getContext(),DetailInfoActivity.class);

                intent.putExtra("name",scenicSpot.getmNameId());
                intent.putExtra("image",scenicSpot.getmImageId());
                intent.putExtra("address",scenicSpot.getmAddressId());

                startActivity(intent);
            }
        });

        return rootView;
    }
}
