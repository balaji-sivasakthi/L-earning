package com.latrosoft.l_earning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.latrosoft.l_earning.Common.SliderAdapter;

public class MainActivity extends AppCompatActivity {
    private ViewPager slider;
    private SliderAdapter mSliderAdapter;
    private LinearLayout mDotsLayout;
    private TextView[] mTextView;
    private TextView getstart;
    private TextView next;
    int current =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slider = findViewById(R.id.slide_view_pager);
        mDotsLayout = findViewById(R.id.dotLayout);
        getstart=findViewById(R.id.getstart);
        next = findViewById(R.id.next);
        mSliderAdapter= new SliderAdapter(this);
        slider.setAdapter(mSliderAdapter);
        addDots(current);
        slider.addOnPageChangeListener(mOnPageChangeListener);


        getstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,SplashScreen.class);
                startActivity(i);
                finish();
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    slider.setCurrentItem(  current+1);

            }
        });
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
            mTextView[position].setTextColor(getResources().getColor(R.color.blue_200));
        }
        if(position==0){
            getstart.setVisibility(View.INVISIBLE);;
            next.setVisibility(View.VISIBLE);
        } else if(position==1){
            getstart.setVisibility(View.INVISIBLE);
            next.setVisibility(View.VISIBLE);
        }else{
            getstart.setVisibility(View.VISIBLE);
            next.setVisibility(View.INVISIBLE);
        }

    }
    ViewPager.OnPageChangeListener mOnPageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            addDots(current);
            current = position;
            addDots(current);
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}