package com.foodcup.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;

import com.foodcup.R;
import com.foodcup.fragment.DishListFragment;
import com.foodcup.fragment.RestaurantInfoFragment;


public class RestaurantInfoActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_info);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        Fragment resInfoFragment = fm.findFragmentById(R.id.res_base_info_container);
        Fragment dishInfoFragment = fm.findFragmentById(R.id.res_dish_info_container);
        if (resInfoFragment == null || dishInfoFragment == null) {
            // TODO change me
            resInfoFragment = new RestaurantInfoFragment();
            dishInfoFragment = new DishListFragment();
            transaction.add(R.id.res_base_info_container, resInfoFragment, "Frag_base_info_tag");
            transaction.add(R.id.res_dish_info_container, dishInfoFragment, "Frag_dish_info_tag");
            transaction.add(R.id.res_review_info_container, new DishListFragment(), "Frag_review_info_tag");

            transaction.commit();
        }
    }

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.restaurant_info, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
*/
}
