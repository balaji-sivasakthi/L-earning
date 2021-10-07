package com.latrosoft.l_earning.Fragment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.material.circularreveal.cardview.CircularRevealCardView;
import com.latrosoft.l_earning.LoginActivity;
import com.latrosoft.l_earning.R;

public class ProfileFragment extends Fragment {
    public static final String TAG ="BALA_PROFILE_ID";
    ImageView profilePic;
    GoogleSignInAccount googleSignInAccount;
    TextView profileName;
    Button logout;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.profile,container,false);
        logout = view.findViewById(R.id.logout);
        profilePic=view.findViewById(R.id.profile_pic);
        profileName = view.findViewById(R.id.profile_name);
        googleSignInAccount =GoogleSignIn.getLastSignedInAccount(getContext());
        if(googleSignInAccount!=null){
           // Log.d(TAG, googleSignInAccount.getId());
            //Log.d(TAG, googleSignInAccount.getIdToken());

            profileName.setText(googleSignInAccount.getDisplayName().toString());

           Glide.with(getContext()).load(googleSignInAccount.getPhotoUrl()).into(profilePic);
        }
    logout.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            GoogleSignInOptions gso = new GoogleSignInOptions.
                    Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).
                    build();

            GoogleSignInClient googleSignInClient=GoogleSignIn.getClient(getContext(),gso);
            googleSignInClient.signOut();
            Intent i = new Intent(getActivity(), LoginActivity.class);
            startActivity(i);

        }
    });
        return view;

    }
}
