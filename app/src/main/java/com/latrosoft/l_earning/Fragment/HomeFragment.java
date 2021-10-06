package com.latrosoft.l_earning.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.latrosoft.l_earning.Adapter.BannerAdapter;
import com.latrosoft.l_earning.Adapter.FeatureAdapter;
import com.latrosoft.l_earning.Model.Banner;
import com.latrosoft.l_earning.Model.Feature;
import com.latrosoft.l_earning.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
 private  View view;
  private RecyclerView mBannerRecyler;
  private RecyclerView mFeatureRecylcer;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.home,container,false);
        mBannerRecyler = view.findViewById(R.id.banner);
        mFeatureRecylcer=view.findViewById(R.id.feature_recyler);
        ArrayList<Banner> mBannerList = new ArrayList<>();
        ArrayList<Feature> mFeatureList = new ArrayList<>();

       mBannerList.add(new Banner("https://www.pngkey.com/png/full/776-7769033_pink-orange-gradient-banner-white-dot-with-abstract.png","qwe12fe2"));
       mBannerList.add(new Banner("https://www.pngkey.com/png/full/776-7769033_pink-orange-gradient-banner-white-dot-with-abstract.png","qwe12e2"));
//
//        mFeatureList.add(new Feature("link","asdfg","12345"));
        mBannerRecyler.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        mBannerRecyler.setAdapter(new BannerAdapter(mBannerList,getContext()));
//        mFeatureRecylcer.setAdapter(new FeatureAdapter(mFeatureList));

        return view;
    }
}
