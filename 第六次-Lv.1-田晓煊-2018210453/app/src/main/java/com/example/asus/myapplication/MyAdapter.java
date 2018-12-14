package com.example.asus.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<Steam> msteam;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item,viewGroup,false);
            MyViewHolder holder = new MyViewHolder(view);
            return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int i) {
        Steam steam = msteam.get(i);
        viewHolder.img.setImageResource(steam.getImageId());
    }

    @Override
    public int getItemCount() {

        return 7;
    }
    static class MyViewHolder extends RecyclerView.ViewHolder{
        public ImageView img;
        public MyViewHolder(View itemView){
            super(itemView);
            img = itemView.findViewById(R.id.img);
        }
    }
    public MyAdapter(List<Steam>gameList){
        msteam = gameList;
    }
}
