package com.elbaz.eliran.mymood_v3.Controllers.Adapters;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.elbaz.eliran.mymood_v3.Controllers.MoodFragments.HappyFragment;
import com.elbaz.eliran.mymood_v3.Controllers.MoodFragments.SuperHappyFragment;

/**
 * Created by Eliran Elbaz on 25-Apr-19.
 */
public class MyAdapter extends FragmentPagerAdapter {

    static final int NUMBER_OF_PAGES = 5;

    public MyAdapter(FragmentManager fm) {
        super(fm);


    }

    @Override
    public int getCount() {
        return NUMBER_OF_PAGES;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return SuperHappyFragment.newInstance(0, Color.YELLOW);
            case 1:
                return HappyFragment.newInstance(1, Color.GREEN);
            case 2:
                //Need to change fragment
                return HappyFragment.newInstance(2, Color.CYAN);
            case 3:
                //Need to change fragment
                return HappyFragment.newInstance(3, Color.GRAY);
            case 4:
                //Need to change fragment
                return HappyFragment.newInstance(4, Color.RED);
            default:
                return HappyFragment.newInstance(1, Color.GREEN);

        }
    }
}