package com.latrosoft.l_earning.Adapter;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.latrosoft.l_earning.Model.Feature;
import com.latrosoft.l_earning.R;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class FeatureAdapter extends RecyclerView.Adapter<FeatureAdapter.ViewHolder> {

    private ArrayList<Feature> mFeatureList;
    private Context mContext;

    public FeatureAdapter(ArrayList<Feature> mFeatureList,Context mContext) {
        this.mFeatureList = mFeatureList;
        this.mContext =mContext;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.feature_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            Feature feature = mFeatureList.get(position);
        holder.title.setText(feature.getTitle());
        holder.price.setText("Rs."+feature.getPrice());
        holder.originalPrice.setPaintFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        holder.originalPrice.setText("Rs."+feature.getOriginalPrice());
            Glide.with(mContext).load(feature.getImgeLink()).into(holder.courseImage);

    }

    @Override
    public int getItemCount() {
        return mFeatureList.size();
    }

    public   class ViewHolder extends  RecyclerView.ViewHolder{
        private ImageView courseImage;
        private TextView title;
        private TextView price;
        private TextView originalPrice;


      public ViewHolder(@NonNull View itemView) {
          super(itemView);
          courseImage=itemView.findViewById(R.id.course_image);
          title=itemView.findViewById(R.id.title);
          price=itemView.findViewById(R.id.price);
          originalPrice=itemView.findViewById(R.id.original_price);
      }
  }
}
