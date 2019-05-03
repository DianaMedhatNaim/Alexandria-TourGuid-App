package com.example.diana.alexandriatourguideapp;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    private String tabTitles[] = new String[] { "Food", "Hotels", "Sights", "Beaches" };
    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantsFragment();} else if (position == 1){ return new HotelsFragment(); } else if(position == 2){
            return new sightseeingFragment(); }else { return new BeachesFragment(); } }
    @Override
    public int getCount() {
        return 4;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];}}
