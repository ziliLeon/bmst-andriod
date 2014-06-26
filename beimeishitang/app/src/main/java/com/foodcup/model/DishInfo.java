package com.foodcup.model;

/**
 * Created by yhu on 6/25/14.
 */
public class DishInfo {

    /** Dish name */
    private String mName;

    /** Dish picture id */
    private int mPicture;

    /** Dish like */
    private boolean mIsLike;

    public DishInfo() {}

    public DishInfo(String name, int picture, boolean isLike) {
        mName = name;
        mPicture = picture;
        mIsLike = isLike;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public void setPicture(int picture) {
        mPicture = picture;
    }

    public int getPicture() {
        return mPicture;
    }

    public void setIsLike(boolean isLike) {
        mIsLike = isLike;
    }

    public boolean getIsLike() {
        return mIsLike;
    }
}
