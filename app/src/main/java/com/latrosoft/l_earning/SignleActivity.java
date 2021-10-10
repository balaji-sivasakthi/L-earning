package com.latrosoft.l_earning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class SignleActivity extends AppCompatActivity {
    private String id,link,title,price,original;
    private ImageView courseImage;
    private TextView courseTitle,coursePrice,courseOriginalPrice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signle);
        courseImage =findViewById(R.id.course_item_image);
        courseTitle=findViewById(R.id.course_item_title);
        coursePrice=findViewById(R.id.course_item_price);
        courseOriginalPrice=findViewById(R.id.course_original_price);


                id=getIntent().getExtras().getString("id");
                title= getIntent().getExtras().getString("title");
                link= getIntent().getStringExtra("link");
                price= getIntent().getExtras().getString("price");
                original=getIntent().getExtras().getString("original");;

       // Log.d("TAG", link);
        Glide.with(this).load(link).into(courseImage);
//       courseTitle.setText(title);
//        coursePrice.setText("Rs."+price);
//        courseOriginalPrice.setText("Rs."+original);

    }
}