package com.example.gudieappcairo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;



public class PublicPlacesFragment extends Fragment {


    public PublicPlacesFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view_public_place = inflater.inflate(R.layout.fragment_public_places, container, false);

        ArrayList<Location> Public_Places = new ArrayList<>();

        Public_Places.add(new Location(getResources().getString(R.string.cairo_tower) , getResources().getString(R.string.cairo_tower_details) , R.drawable.cairotower , getResources().getString(R.string.cairo_tower_address)));
        Public_Places.add(new Location(getResources().getString(R.string.el_moez_street) , getResources().getString(R.string.el_moez_street_details) , R.drawable.el_moez_street , getResources().getString(R.string.el_moez_street_address)));
        Public_Places.add(new Location(getResources().getString(R.string.khan) , getResources().getString(R.string.khan_details) , R.drawable.khan_el_khalili, getResources().getString(R.string.khan_address)));


        ListView public_places_list = view_public_place.findViewById(R.id.public_places_list);
        AdapterLocation adapter = new AdapterLocation(Public_Places,getActivity());
        public_places_list.setAdapter(adapter);
        return view_public_place ;
}

}
