package com.latrosoft.l_earning.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.latrosoft.l_earning.Model.Banner;
import com.latrosoft.l_earning.R;

import java.util.ArrayList;

public class BannerAdapter extends PagerAdapter {

        private ArrayList<Banner> mBannerList;
        private Context mContext;
        private LayoutInflater mLayoutInflator;

    public BannerAdapter(ArrayList<Banner> mBannerList,Context mContext) {
        this.mBannerList = mBannerList;
        this.mContext =mContext;
        mLayoutInflator =(LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }


    @Override
    public int getCount() {
        return mBannerList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
      View view=  mLayoutInflator.inflate(R.layout.banner_item,container,false);
      ImageView banner_img= view.findViewById(R.id.banner_image);
      Glide.with(mContext).load(mBannerList.get(position).getImageLink()).into(banner_img);
      container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeAllViews();
    }
}