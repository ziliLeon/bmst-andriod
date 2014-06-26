package com.foodcup.fragment;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.foodcup.R;
import com.foodcup.model.DishInfo;

import java.util.ArrayList;

/**
 * Created by yhu on 6/25/14.
 */
public class DishListFragment extends ListFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // TODO get data from server
        ArrayList<DishInfo> dishes = new ArrayList<DishInfo>();
        for (int i = 0;i < 4 ;i++) {
            dishes.add(new DishInfo("Dish " + i, i, i % 2 == 0));
        }
        DishAdapter adapter = new DishAdapter(dishes);
        setListAdapter(adapter);
    }

    private class DishAdapter extends ArrayAdapter<DishInfo> {

        public DishAdapter(ArrayList<DishInfo> dishes) {
            super(getActivity(), 0, dishes);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getActivity().getLayoutInflater()
                        .inflate(R.layout.list_item_dish, null);
            }

            DishInfo dish = getItem(position);

            TextView dishNameText = (TextView) convertView.findViewById(R.id.dish_name);
            dishNameText.setText(dish.getName());

            return convertView;
        }
    }
}
