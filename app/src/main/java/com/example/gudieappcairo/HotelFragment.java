package com.example.gudieappcairo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class HotelFragment extends Fragment {


    public HotelFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view_hotel = inflater.inflate(R.layout.fragment_hotel, container, false);
        ArrayList<Location> Hotels = new ArrayList<>();

        Hotels.add(new Location(getResources().getString(R.string.ritz_carlton) , getResources().getString(R.string.ritz_carlton_details) , R.drawable.the_nile_ritz_carlton , getResources().getString(R.string.ritz_carlton_address)));
        Hotels.add(new Location(getResources().getString(R.string.four_season) , getResources().getString(R.string.four_season_details) , R.drawable.four_season , getResources().getString(R.string.four_season_address)));
        Hotels.add(new Location(getResources().getString(R.string.fairmont_nile) , getResources().getString(R.string.fairmont_nile_details) , R.drawable.fairmont_nile , getResources().getString(R.string.fairmont_nile_address)));


        ListView hotels_list = view_hotel.findViewById(R.id.hotel_list);
        AdapterLocation adapter = new AdapterLocation(Hotels,getActivity());
        hotels_list.setAdapter(adapter);

        return view_hotel;
    }

}
