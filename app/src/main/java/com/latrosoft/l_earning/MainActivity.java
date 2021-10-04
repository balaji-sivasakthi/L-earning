package com.latrosoft.l_earning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.latrosoft.l_earning.Common.SliderAdapter;

public class MainActivity extends AppCompatActivity {
    private ViewPager slider;
    private SliderAdapter mSliderAdapter;
    private LinearLayout mDotsLayout;
    private TextView[] mTextView;
    int current =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slider = findViewById(R.id.slide_view_pager);
        mDotsLayout = findViewById(R.id.dotLayout);

        mSliderAdapter= new SliderAdapter(this);
        slider.setAdapter(mSliderAdapter);
        addDots(0);
        slider.addOnPageChangeListener(mOnPageChangeListener);

    }

    public void addDots(int position){

        mTextView=new TextView[3];
        mDotsLayout.removeAllViews();
        for(int i=0;i<mTextView.length;i++){
                mTextView[i]=new TextView(this);
                mTextView[i].setText(Html.fromHtml("&#8226"));
                mTextView[i].setTextSize(35);
                mDotsLayout.addView(mTextView[i]);
        }
        if(mTextView.length>0){
            mTextView[position].setTextColor(Color.BLUE);
        }
    }
    ViewPager.OnPageChangeListener mOnPageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            current = position;
            addDots(position);
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}