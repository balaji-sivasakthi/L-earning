package com.latrosoft.l_earning.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
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
    private TextView profileName;

private  GoogleSignInAccount account;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.home,container,false);
        mBannerRecyler = view.findViewById(R.id.banner);
        mFeatureRecylcer=view.findViewById(R.id.feature_recyler);
        profileName=view.findViewById(R.id.name);
        account = GoogleSignIn.getLastSignedInAccount(getContext());

        ArrayList<Banner> mBannerList = new ArrayList<>();
        ArrayList<Feature> mFeatureList = new ArrayList<>();
        if(account!=null){
            profileName.setText(account.getDisplayName());
        }

       mBannerList.add(new Banner("https://i.ytimg.com/vi/nqMiCdfrIx8/maxresdefault.jpg","qwe12fe2"));
       mBannerList.add(new Banner("https://i.ytimg.com/vi/XHIdvyu3pfE/hqdefault.jpg?sqp=-oaymwEjCPYBEIoBSFryq4qpAxUIARUAAAAAGAElAADIQj0AgKJDeAE=&rs=AOn4CLC0oxF0BcQSC1OBy_G7WWUzzlYXgQ","qwe12e2"));

        mFeatureList.add(new Feature("web-dev","Web development Html, CSS, Javascript","https://i.ytimg.com/vi/g1k9Xo2fQpw/maxresdefault.jpg","2599","599"));
        mFeatureList.add(new Feature("web-dev","Web development Html, CSS, Javascript","https://i.ytimg.com/vi/VaqLRdel5FE/maxresdefault.jpg","1999","499"));
        mFeatureList.add(new Feature("web-dev","Web development Html, CSS, Javascript","https://i.ytimg.com/vi/UHNcLUek7bA/hqdefault.jpg?sqp=-oaymwEjCPYBEIoBSFryq4qpAxUIARUAAAAAGAElAADIQj0AgKJDeAE=&rs=AOn4CLDLJbJ06zHJ1T6mB5EpmS0m779wYA","4476","36700"));
        mBannerRecyler.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        mFeatureRecylcer.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        mBannerRecyler.setAdapter(new BannerAdapter(mBannerList,getContext()));
        mFeatureRecylcer.setAdapter(new FeatureAdapter(mFeatureList,getContext()));

        return view;
    }
}
