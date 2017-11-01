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

public class MuseumFragment extends Fragment {
    private String tag = "museum";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Log.i(tag,"onCreateView");

        View rootView = inflater.inflate(R.layout.scenic_spot_list, container, false);

        final ArrayList<ScenicSpot> scenicSpotArrayList = new ArrayList<>();

        scenicSpotArrayList.add(new ScenicSpot(R.string.museum_zhuhaibowuguan,
                R.drawable.zhuhaibowuguan, R.string.museum_zhuhaibowuguan_ad));
        scenicSpotArrayList.add(new ScenicSpot(R.string.museum_guyuan,
                R.drawable.guyuan, R.string.museum_guyuan_ad));
        scenicSpotArrayList.add(new ScenicSpot(R.string.museum_yishu,
                R.drawable.yishu, R.string.museum_yishu_ad));
        scenicSpotArrayList.add(new ScenicSpot(R.string.museum_haiyang,
                R.drawable.haiyang, R.string.museum_haiyang_ad));
        scenicSpotArrayList.add(new ScenicSpot(R.string.museum_feiyi,
                R.drawable.feiyi, R.string.museum_feiyi_ad));

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

    public MuseumFragment() {

    }
}
