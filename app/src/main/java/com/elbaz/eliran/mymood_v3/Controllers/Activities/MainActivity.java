package com.elbaz.eliran.mymood_v3.Controllers.Activities;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;

import com.elbaz.eliran.mymood_v3.Controllers.MoodFragments.HappyFragment;
import com.elbaz.eliran.mymood_v3.Controllers.MoodFragments.SuperHappyFragment;
import com.elbaz.eliran.mymood_v3.R;

public class MainActivity extends AppCompatActivity {

    static final int NUMBER_OF_PAGES = 5;

    MyAdapter mAdapter;
    VerticalViewPager mPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdapter = new MyAdapter(getSupportFragmentManager());
        mPager = findViewById(R.id.viewpager);
        mPager.setAdapter(mAdapter);
    }

    public static class MyAdapter extends FragmentPagerAdapter {
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

//    public static class FragmentOne extends Fragment {
//
//        private static final String MY_NUM_KEY = "num";
//    private static final String MY_COLOR_KEY = "color";
//
//    private int mNum;
//    private int mColor;
//
//    // You can modify the parameters to pass in whatever you want
//    static FragmentOne newInstance(int num, int color) {
//        FragmentOne f = new FragmentOne();
//        Bundle args = new Bundle();
//        args.putInt(MY_NUM_KEY, num);
//        args.putInt(MY_COLOR_KEY, color);
//        f.setArguments(args);
//        return f;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        mNum = getArguments() != null ? getArguments().getInt(MY_NUM_KEY) : 0;
//        mColor = getArguments() != null ? getArguments().getInt(MY_COLOR_KEY) : Color.BLACK;
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        View v = inflater.inflate(R.layout.fragment_normal, container, false);
//        v.setBackgroundColor(mColor);
//        TextView textView = v.findViewById(R.id.textview);
//        textView.setText("Page " + mNum);
//        return v;
//    }
//}
}