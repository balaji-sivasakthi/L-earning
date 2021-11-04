package com.latrosoft.l_earning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Paint;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.latrosoft.l_earning.Adapter.PlayListAdapter;
import com.latrosoft.l_earning.Model.PlayList;

import java.util.ArrayList;

public class SignleActivity extends AppCompatActivity {
    private String id,link,title,price,original;
    private ImageView courseImage;
    private TextView courseTitle,coursePrice,courseOriginalPrice;
    private Intent intent;
    private Button buy;
    private RecyclerView playlistRecycler;
    ArrayList<PlayList> mPlaylist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signle);
        intent=getIntent();
        courseImage =findViewById(R.id.single_img);
        courseTitle=findViewById(R.id.single_title);
        coursePrice=findViewById(R.id.single_price);
        courseOriginalPrice=findViewById(R.id.single_original_price);
        buy = findViewById(R.id.buy);
        playlistRecycler=findViewById(R.id.playlist);
        playlistRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        ArrayList<PlayList> mPlaylist=new ArrayList<>();
        mPlaylist.add(new PlayList("link","Introducing to Web Development"));
        mPlaylist.add(new PlayList("link","How Internet Works?"));
        mPlaylist.add(new PlayList("link","What is Html?"));

        playlistRecycler.setAdapter(new PlayListAdapter(mPlaylist,this));

                id=intent.getExtras().getString("id");
                title= intent.getStringExtra("title");
                link= intent.getStringExtra("link");
                price= intent.getExtras().getString("price");
                original=intent.getExtras().getString("original");;

       // Log.d("TAG", link);
        Glide.with(this).load(link).into(courseImage);
       courseTitle.setText(title);
        coursePrice.setText("Rs."+price);
        courseOriginalPrice.setText("Rs."+original);
        courseOriginalPrice.setPaintFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignleActivity.this,CheckOut.class);
                intent.putExtra("id",id);
                intent.putExtra("title",title);
                intent.putExtra("link",link);
                intent.putExtra("price",price);
                intent.putExtra("original",original);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

    }
}