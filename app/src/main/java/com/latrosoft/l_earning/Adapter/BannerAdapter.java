package com.latrosoft.l_earning.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.latrosoft.l_earning.Model.Banner;
import com.latrosoft.l_earning.R;

import java.util.ArrayList;

public class BannerAdapter extends RecyclerView.Adapter<BannerAdapter.ViewHoder> {

        private ArrayList<Banner> mBannerList;
        private Context mContext;

    public BannerAdapter(ArrayList<Banner> mBannerList,Context mContext) {
        this.mBannerList = mBannerList;
        this.mContext =mContext;

    }



    @NonNull
    @Override
    public ViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.banner_item,parent,false);

        return new ViewHoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoder holder, int position) {
        Banner  banner = mBannerList.get(position);
        Glide.with(mContext).load(banner.getImageLink()).into(holder.bannerImg);


    }

    @Override
    public int getItemCount() {
        return mBannerList.size();
    }

    public  class ViewHoder extends RecyclerView.ViewHolder{
        private ImageView bannerImg;
      public ViewHoder(@NonNull View itemView)
      {
          super(itemView);
          bannerImg = itemView.findViewById(R.id.banner_image);
      }
  }
}
