package com.tjnuman.meaw.breed.breedRes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tjnuman.meaw.R;

import java.util.ArrayList;
import java.util.List;

public class BreedAdapter extends RecyclerView.Adapter<BreedAdapter.MyViewHolder> implements Filterable {

    Context context;
    ArrayList<BreedResponse> BreedNameArray;
    ArrayList<BreedResponse> getBreedNameArrayFull;

    public BreedAdapter(Context context, ArrayList<BreedResponse> cityNames) {
        this.context = context;
        this.BreedNameArray = cityNames;
        getBreedNameArrayFull = new ArrayList<>(cityNames);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.child_layout,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        // holder.cityName.setText(cityNamesArray.get(position));

        BreedResponse getData = BreedNameArray.get(position);

        holder.breedName.setText(getData.getName());
        holder.origin.setText(getData.getOrigin());
        holder.lifeSpan.setText(getData.getLifeSpan());
        holder.description.setText(getData.getDescription());
      //  holder.img.setImageResource(getData.getImage().getUrl());




    }


    @Override
    public int getItemCount() {
        return BreedNameArray.size();
    }

    @Override
    public Filter getFilter() {
        return exampleFilter;
    }

    private Filter exampleFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {
            List<BreedResponse> filterList = new ArrayList<>();
            if (charSequence == null || charSequence.length() == 0)
            {
                filterList.addAll(getBreedNameArrayFull);
            }
            else {
                java.lang.String filterPattern = charSequence.toString().toLowerCase().trim();

                for (BreedResponse item:getBreedNameArrayFull)
                {
                    if (item.getName().toLowerCase().contains(filterPattern))
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
            BreedNameArray.clear();
            BreedNameArray.addAll((List)filterResults.values);
            notifyDataSetChanged();
        }
    };


    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView breedName,origin,lifeSpan,description;
        ImageView img;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            breedName = itemView.findViewById(R.id.breedName);
            origin = itemView.findViewById(R.id.breedOrigin);
            lifeSpan = itemView.findViewById(R.id.breedLifeSpan);
            description = itemView.findViewById(R.id.breedDescription);
            img = itemView.findViewById(R.id.image_id);

        }

    }

}
