package com.example.gudieappcairo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class HistoricalSiteFragment extends Fragment {


    public HistoricalSiteFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view_historical_site = inflater.inflate(R.layout.fragment_historical_site, container, false);

        ArrayList<Location> Historical_Sites = new ArrayList<>();

        Historical_Sites.add(new Location(getResources().getString(R.string.pyramids) , getResources().getString(R.string.pyramids_details) , R.drawable.pyramids , getResources().getString(R.string.pyramids_address)));
        Historical_Sites.add(new Location(getResources().getString(R.string.salah_el_din_castle) , getResources().getString(R.string.salah_el_din_castle_details) , R.drawable.salah_el_din_castle , getResources().getString(R.string.salah_el_din_castle_address)));
        Historical_Sites.add(new Location(getResources().getString(R.string.egyptian_museum) , getResources().getString(R.string.egyptian_museum_details) , R.drawable.egyption_mussum , getResources().getString(R.string.egyptian_museum_address)));


        ListView hotels_list = view_historical_site.findViewById(R.id.historical_list);
        AdapterLocation adapter = new AdapterLocation(Historical_Sites,getActivity());
        hotels_list.setAdapter(adapter);

        return view_historical_site ;
    }

}
