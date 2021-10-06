package com.latrosoft.l_earning;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;
import com.latrosoft.l_earning.Fragment.CourseFragment;
import com.latrosoft.l_earning.Fragment.HomeFragment;
import com.latrosoft.l_earning.Fragment.MyCourseFragment;
import com.latrosoft.l_earning.Fragment.ProfileFragment;
import com.latrosoft.l_earning.databinding.ActivityDashBoardBinding;

public class DashBoard extends AppCompatActivity {

    private ChipNavigationBar mChipNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new HomeFragment()).commit();
        mChipNavigation = findViewById(R.id.chip_nav);
        mChipNavigation.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {
                Fragment fragment=null ;
                switch (i){
                    case R.id.home:
                        fragment = new HomeFragment();
                        break;
                    case R.id.course:
                        fragment = new CourseFragment();
                        break;
                    case R.id.profile:
                        fragment=new ProfileFragment();
                        break;
                    case R.id.my_course:
                        fragment=new MyCourseFragment();
                        break;

                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,fragment).commit();
            }
        });

    }



}