package com.foodcup.fragment;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.foodcup.R;

/**
 * A RestaurantInfoFragment fragment containing detail information about the restaurant.
 */
@SuppressLint("NewApi")
public class RestaurantInfoFragment extends Fragment {
    public RestaurantInfoFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_restaurant_info, container, false);
        return rootView;
    }
}
