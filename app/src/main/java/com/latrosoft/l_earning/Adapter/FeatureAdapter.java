package com.latrosoft.l_earning.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.latrosoft.l_earning.Model.Feature;

import java.util.ArrayList;


public class FeatureAdapter extends RecyclerView.Adapter<FeatureAdapter.ViewHolder> {

    private ArrayList<Feature> mFeatureList;
    private Context mContext;

    public FeatureAdapter(ArrayList<Feature> mFeatureList) {
        this.mFeatureList = mFeatureList;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public   class ViewHolder extends  RecyclerView.ViewHolder{

      public ViewHolder(@NonNull View itemView) {
          super(itemView);
      }
  }
}
