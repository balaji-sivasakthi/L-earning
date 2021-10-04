package com.latrosoft.l_earning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ViewPager slider;
    SliderAdapter mSliderAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        slider = findViewById(R.id.slide_view_pager);
        mSliderAdapter= new SliderAdapter(this);
        slider.setAdapter(mSliderAdapter);
    }
}