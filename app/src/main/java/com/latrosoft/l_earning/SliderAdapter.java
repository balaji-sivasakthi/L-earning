package com.latrosoft.l_earning;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public SliderAdapter(Context mContext){

        this.mContext = mContext;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    public int[] slide_img={
            R.drawable.elearning,
            R.drawable.illus3,
            R.drawable.ilustration1
    };
    public  String[] slide_title={
            "Learn Code",
            "Easy Way to Learn",
            "Everying in Tamil"
    };
    public  String[] slide_dis={
            "Lorem ipsum dolor sit",
            "Lorem ipsum dolor sit",
            "Lorem ipsum dolor sit"
    };

    @Override
    public int getCount() {
        return slide_title.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (RelativeLayout)object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        View view = mLayoutInflater.inflate(R.layout.slide_layout,container,false);

        ImageView slideImg= view.findViewById(R.id.slide_image);
        TextView slideTitle = view.findViewById(R.id.slide_title);
        TextView slideDis = view.findViewById(R.id.slide_dis);

        slideImg.setImageResource(slide_img[position]);
        slideTitle.setText(slide_title[position]);
        slideDis.setText(slide_dis[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
