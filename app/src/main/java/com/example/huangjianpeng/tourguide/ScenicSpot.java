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

    public int getNameId() {
        return mNameId;
    }

    public void setNameId(int mNameId) {
        this.mNameId = mNameId;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int mImageId) {
        this.mImageId = mImageId;
    }

    public int getAddressId() {
        return mAddressId;
    }

    public void setAddressId(int mAddressId) {
        this.mAddressId = mAddressId;
    }
}
