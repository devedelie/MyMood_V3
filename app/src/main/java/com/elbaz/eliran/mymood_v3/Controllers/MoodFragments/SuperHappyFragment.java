package com.elbaz.eliran.mymood_v3.Controllers.MoodFragments;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.elbaz.eliran.mymood_v3.R;

/**
 * Created by Eliran Elbaz on 24-Apr-19.
 */
public class SuperHappyFragment extends Fragment {

    private static final String MY_NUM_KEY = "num";
    private static final String MY_COLOR_KEY = "color";
    SharedPreferences mSharedPreferences;

    ImageView mSmiley, mCommentBtn, mEmailBtn, mHistoryBtn;

    private int mNum;
    private int mColor;

    // You can modify the parameters to pass in whatever you want
    public static SuperHappyFragment newInstance(int num, int color) {
        SuperHappyFragment f = new SuperHappyFragment();
        Bundle args = new Bundle();
        args.putInt(MY_NUM_KEY, num);
        args.putInt(MY_COLOR_KEY, color);
        f.setArguments(args);
        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mNum = getArguments() != null ? getArguments().getInt(MY_NUM_KEY) : 0;
        mColor = getArguments() != null ? getArguments().getInt(MY_COLOR_KEY) : Color.BLACK;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_supper_happy, container, false);
        v.setBackgroundColor(mColor);
//        TextView textView = v.findViewById(R.id.textview);
//        textView.setText("Page " + mNum);

        mSmiley = (ImageView) v.findViewById(R.id.activity_super_happy);
        mCommentBtn = (ImageView) v.findViewById(R.id.super_happy_note_btn);
        mEmailBtn = (ImageView) v.findViewById(R.id.super_happy_email_btn);
        mHistoryBtn = (ImageView) v.findViewById(R.id.super_happy_history_btn);


        return v;
    }
}
