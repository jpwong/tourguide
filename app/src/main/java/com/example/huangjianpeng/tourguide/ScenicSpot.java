package com.example.huangjianpeng.tourguide;

/**
 * Created by huangjianpeng on 2017/9/17.
 */

public class ScenicSpot {

    private int mNameId;
    private int mImageId;
    private int mAddressId;

    public ScenicSpot(int mNameId, int mImageId, int mAddressId) {
        this.mNameId = mNameId;
        this.mImageId = mImageId;
        this.mAddressId = mAddressId;
    }

    public int getmNameId() {
        return mNameId;
    }

    public void setmNameId(int mNameId) {
        this.mNameId = mNameId;
    }

    public int getmImageId() {
        return mImageId;
    }

    public void setmImageId(int mImageId) {
        this.mImageId = mImageId;
    }

    public int getmAddressId() {
        return mAddressId;
    }

    public void setmAddressId(int mAddressId) {
        this.mAddressId = mAddressId;
    }
}
