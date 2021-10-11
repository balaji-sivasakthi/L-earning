package com.latrosoft.l_earning.Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.latrosoft.l_earning.DashBoard;
import com.latrosoft.l_earning.Model.Course;
import com.latrosoft.l_earning.R;
import com.latrosoft.l_earning.SignleActivity;

import org.json.JSONObject;

import java.util.ArrayList;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.ViewHolder> {
    private ArrayList<Course> mCourseList ;
    private Context mContext;

    public CourseAdapter(ArrayList<Course> mCourseList, Context mContext) {
        this.mCourseList = mCourseList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            Course course = mCourseList.get(position);
        Glide.with(mContext).load(course.getImgLink()).into(holder.courseImage);
        holder.courseTitle.setText(course.getTitle());
        holder.coursePrice.setText("Rs."+course.getPrice());
        holder.courseOriginal.setText("Rs."+course.getOrginalPrice());
        holder.courseOriginal.setPaintFlags(Paint.STRIKE_THRU_TEXT_FLAG);

    }

    @Override
    public int getItemCount() {
        return mCourseList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView courseImage;
        private RelativeLayout courseLayout;
        private TextView courseTitle,coursePrice,courseOriginal;
        ViewHolder(View itemview){
            super(itemview);
            courseLayout = itemview.findViewById(R.id.course_layout);
            courseImage =itemview.findViewById(R.id.course_item_image);
            courseTitle=itemview.findViewById(R.id.course_item_title);
            coursePrice =itemview.findViewById(R.id.course_item_price);
            courseOriginal=itemview.findViewById(R.id.course_original_price);
           courseLayout.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Course course = mCourseList.get(getAdapterPosition());
                   Intent i = new Intent(mContext.getApplicationContext(), SignleActivity.class);
                   i.putExtra("id",course.getId());
                   i.putExtra("link",course.getImgLink());
                   i.putExtra("title",course.getTitle());
                   i.putExtra("price",course.getPrice());
                   i.putExtra("original",course.getOrginalPrice());

                   mContext.startActivity(i);
               }
           });
        }
    }
}
