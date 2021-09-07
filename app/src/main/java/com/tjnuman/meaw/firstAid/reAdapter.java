package com.tjnuman.meaw.firstAid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tjnuman.meaw.R;

import java.util.ArrayList;
import java.util.List;

public class reAdapter extends RecyclerView.Adapter<reAdapter.MyViewHolder> implements Filterable {

 Context context;
 ArrayList<FirstAidModel> titleArray;
 ArrayList<FirstAidModel> getTitleArrayfull;

    public reAdapter(Context context, ArrayList<FirstAidModel> titleArray) {
        this.context = context;
        this.titleArray = titleArray;
        getTitleArrayfull = new ArrayList<>(titleArray);
    }

    @Override
    public Filter getFilter() {
        return exampleFilter;
    }

    @NonNull
    @Override
    public reAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(context).inflate(R.layout.task_layout,parent,false);
    MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull reAdapter.MyViewHolder holder, int position) {

        FirstAidModel getData = titleArray.get(position);

         holder.title.setText(getData.getTitle());
         holder.detail.setText(getData.getDes());

    }

    @Override
    public int getItemCount() {
        return titleArray.size();
    }

    private Filter exampleFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {
            List<FirstAidModel> filterList = new ArrayList<>();
            if (charSequence == null || charSequence.length() == 0)
            {
                filterList.addAll(getTitleArrayfull);
            }
            else {
                String filterPattern = charSequence.toString().toLowerCase().trim();

                for (FirstAidModel item:getTitleArrayfull)
                {
                    if (item.getTitle().toLowerCase().contains(filterPattern))
                    {
                        filterList.add(item);
                    }
                }
            }
            FilterResults results = new FilterResults();
            results.values = filterList;
            return  results;
        }

        @Override
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
            titleArray.clear();
            titleArray.addAll((List)filterResults.values);
            notifyDataSetChanged();
        }
    };



    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView detail;
        TextView title;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            detail = itemView.findViewById(R.id.detail);

        }

    }
}
