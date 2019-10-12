package com.singularitycoder.brhatmrdanga.profileview;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.singularitycoder.brhatmrdanga.R;
import com.singularitycoder.brhatmrdanga.home.PlaceModel;

import java.util.ArrayList;

public class PlacesVisitedAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<PlaceModel> placeList;
    Context context;

    public PlacesVisitedAdapter(ArrayList<PlaceModel> placeList, Context context) {
        this.placeList = placeList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_profile_place, parent, false);
        return new PlaceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        PlaceModel placeModel = placeList.get(position);
        ((PlaceViewHolder) holder).tvPlaceName.setText(placeModel.getStrName());
        ((PlaceViewHolder) holder).tvDate.setText(placeModel.getStrDate());
    }

    @Override
    public int getItemCount() {
        return placeList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    class PlaceViewHolder extends RecyclerView.ViewHolder {

        TextView tvPlaceName;
        TextView tvDate;

        public PlaceViewHolder(@NonNull View itemView) {
            super(itemView);

            tvPlaceName = itemView.findViewById(R.id.tv_name);
            tvDate = itemView.findViewById(R.id.tv_subtitle_1);
        }
    }
}

