package com.latrosoft.l_earning.Fragment;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.material.circularreveal.cardview.CircularRevealCardView;
import com.latrosoft.l_earning.R;

public class ProfileFragment extends Fragment {

    ImageView profilePic;
    GoogleSignInAccount googleSignInAccount;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.profile,container,false);
        profilePic=view.findViewById(R.id.profile_pic);
        googleSignInAccount =GoogleSignIn.getLastSignedInAccount(getContext());
        if(googleSignInAccount!=null){
           Glide.with(getContext()).load(googleSignInAccount.getPhotoUrl()).into(profilePic);
        }

        return view;

    }
}
