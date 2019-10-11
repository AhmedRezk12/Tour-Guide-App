package com.example.gudieappcairo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;



public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view_restaurant = inflater.inflate(R.layout.fragment_restaurant, container, false);

        ArrayList<Location> Restaurants = new ArrayList<>();

        Restaurants.add(new Location(getResources().getString(R.string.el_gahsh) , getResources().getString(R.string.el_gahsh_details) , R.drawable.foul_and_falafel , getResources().getString(R.string.el_gahsh_address)));
        Restaurants.add(new Location(getResources().getString(R.string.sayed_hanfey) , getResources().getString(R.string.sayed_hanfey_details) , R.drawable.sayed_hanfey , getResources().getString(R.string.sayed_hanfey_address)));
        Restaurants.add(new Location(getResources().getString(R.string.sobhy_kaber) , getResources().getString(R.string.sobhy_kaber_details) , R.drawable.sobhy_kaber, getResources().getString(R.string.sobhy_kaber_address)));


        ListView restaurant_list = view_restaurant.findViewById(R.id.restaurant_list);
        AdapterLocation adapter = new AdapterLocation(Restaurants,getActivity());
        restaurant_list.setAdapter(adapter);
        return view_restaurant ;
    }

}
