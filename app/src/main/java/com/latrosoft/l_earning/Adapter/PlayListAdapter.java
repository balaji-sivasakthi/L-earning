package com.latrosoft.l_earning.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.latrosoft.l_earning.Model.PlayList;
import com.latrosoft.l_earning.R;

import java.util.ArrayList;

public class PlayListAdapter extends RecyclerView.Adapter<PlayListAdapter.ViewHolder> {

    private ArrayList<PlayList> mPlayList;
    private Context mContext;

    public PlayListAdapter(ArrayList<PlayList> mPlayList, Context mContext) {
        this.mPlayList = mPlayList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.playlist_item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        PlayList playList =mPlayList.get(position);
        holder.title.setText(playList.getTitle());

    }

    @Override
    public int getItemCount() {
        return mPlayList.size();
    }

    public class  ViewHolder extends RecyclerView.ViewHolder{

        private TextView title;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.playlist_title);
        }
    }
}
