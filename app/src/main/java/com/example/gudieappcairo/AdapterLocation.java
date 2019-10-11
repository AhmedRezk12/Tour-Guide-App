package com.example.gudieappcairo;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AdapterLocation extends BaseAdapter
{
    Activity context ;
    ArrayList<Location> locations = new ArrayList<>();

    AdapterLocation (ArrayList<Location> locations , Activity context )
    {
        this.locations = locations ;
        this.context = context ;
    }

    @Override
    public int getCount()
    {
        return locations.size();
    }

    @Override
    public long getItemId(int position) {
        return position ;
    }

    @Override
    public Object getItem(int position) {
        return locations.get(position);
    }

    @Override
    public View getView(final int i, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.row_of_location , null);

        final ImageView LocationImage = (ImageView) view.findViewById(R.id.location_image);
        TextView LocationName = (TextView) view.findViewById(R.id.location_name);
        TextView LocationAddress = (TextView) view.findViewById(R.id.location_address);
        TextView LocationDetails = (TextView) view.findViewById(R.id.location_details);




        LocationName.setText(String.valueOf(locations.get(i).LocationName));
        LocationDetails.setText(locations.get(i).LocationDetails);
        LocationAddress.setText(locations.get(i).Address);
        LocationImage.setImageResource(locations.get(i).LocationImage);

        return view;
    }
}
