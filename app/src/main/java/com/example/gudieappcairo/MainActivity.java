package com.example.gudieappcairo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout MyTabs;
    private ViewPager MyPage;
    private int[] tabIcons = {
            R.drawable.ic_home_black_24dp,
            R.drawable.historical_icon,
            R.drawable.ic_public_black_24dp,
            R.drawable.ic_hotel_black_24dp,
            R.drawable.ic_restaurant_black_24dp
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        MyTabs = (TabLayout)findViewById(R.id.MyTabs);
        MyPage = (ViewPager)findViewById(R.id.MyPage);

        MyTabs.setupWithViewPager(MyPage);
        SetUpViewPager(MyPage);
        setupTabIcons();



    }
    private void setupTabIcons() {
        MyTabs.getTabAt(0).setIcon(tabIcons[0]);
        MyTabs.getTabAt(1).setIcon(tabIcons[1]);
        MyTabs.getTabAt(2).setIcon(tabIcons[2]);
        MyTabs.getTabAt(3).setIcon(tabIcons[3]);
        MyTabs.getTabAt(4).setIcon(tabIcons[4]);
    }


    public void SetUpViewPager (ViewPager viewpage){
        MyViewPageAdapter Adapter = new MyViewPageAdapter(getSupportFragmentManager());

        Adapter.AddFragmentPage(new HomeFragment(), "Home");
        Adapter.AddFragmentPage(new HistoricalSiteFragment(), "Historical Sites");
        Adapter.AddFragmentPage(new PublicPlacesFragment(), "Public Places");
        Adapter.AddFragmentPage(new HotelFragment(), "Hotels");
        Adapter.AddFragmentPage(new RestaurantFragment(), "Restaurants");
        //We Need Fragment class now

        viewpage.setAdapter(Adapter);

    }

    public class MyViewPageAdapter extends FragmentPagerAdapter {
        private List<Fragment> MyFragment = new ArrayList<>();
        private List<String> MyPageTittle = new ArrayList<>();

        public MyViewPageAdapter(FragmentManager manager){
            super(manager);
        }

        public void AddFragmentPage(Fragment Frag, String Title){
            MyFragment.add(Frag);
            MyPageTittle.add(Title);
        }

        @Override
        public Fragment getItem(int position) {
            return MyFragment.get(position);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return MyPageTittle.get(position);
        }

        @Override
        public int getCount() {
            return 5;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
