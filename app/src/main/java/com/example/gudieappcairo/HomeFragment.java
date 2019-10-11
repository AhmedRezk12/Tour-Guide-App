package com.example.gudieappcairo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;



public class HomeFragment extends Fragment {


    public HomeFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayList<Integer> Images = new ArrayList<>();
        Images.add(R.drawable.cairo1);
        Images.add(R.drawable.cairo2);
        Images.add(R.drawable.cairo3);
        Images.add(R.drawable.cairo4);
        Images.add(R.drawable.cairo5);
        Images.add(R.drawable.cairo6);

        View view_home = inflater.inflate(R.layout.fragment_home, container, false);

        final ListView ImageList = view_home.findViewById(R.id.home_list);

        ListAdapter adapter = new ListAdapter(Images);
        ImageList.setAdapter(adapter);
        return view_home ;
    }

    class ListAdapter extends BaseAdapter
    {
        ArrayList<Integer> images = new ArrayList<>();
        ListAdapter (ArrayList<Integer> images)
        {
            this.images = images ;
        }

        @Override
        public int getCount() {
            return images.size();
        }

        @Override
        public long getItemId(int position) {
            return position ;
        }

        @Override
        public Object getItem(int position) {
            return images.get(position);
        }

        @Override
        public View getView(int i, View convertView, ViewGroup parent) {
            LayoutInflater layoutInflater = getLayoutInflater();
            View view = layoutInflater.inflate(R.layout.row_of_image , null);

            ImageView imageView = (ImageView) view.findViewById(R.id.image_content_home);

            imageView.setImageResource(images.get(i));
            return view;
        }
    }

}
