package com.tjnuman.meaw.firstAid;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tjnuman.meaw.R;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    Context context;
    String [] title, desc;

    public RecyclerAdapter(Context context, String[] title, String[] desc) {
        this.context = context;
        this.title = title;
        this.desc = desc;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_layout,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

       holder.title.setText(title[position]);
       holder.detail.setText(desc[position]);
    }



    @Override
    public int getItemCount() {
        return title.length;
    }




    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView detail;
        TextView title;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            detail = itemView.findViewById(R.id.detail);
        }
    }

}
