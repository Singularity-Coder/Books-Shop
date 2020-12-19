package com.singularitycoder.brhatmrdanga.home.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.singularitycoder.brhatmrdanga.R;
import com.singularitycoder.brhatmrdanga.home.model.PlaceModel;

import java.util.ArrayList;

public class PlaceAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<PlaceModel> placeList;
    Context context;

    public PlaceAdapter(ArrayList<PlaceModel> placeList, Context context) {
        this.placeList = placeList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_place, parent, false);
        return new PlaceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        PlaceModel placeModel = placeList.get(position);
        ((PlaceViewHolder) holder).tvPlaceName.setText(placeModel.getPlaceName());
        ((PlaceViewHolder) holder).tvBooksSold.setText(placeModel.getBooksSold());
        ((PlaceViewHolder) holder).tvLakshmiEarned.setText(placeModel.getMoneyEarned());
        ((PlaceViewHolder) holder).tvDate.setText(placeModel.getDateVisited());
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
        TextView tvBooksSold;
        TextView tvLakshmiEarned;
        TextView tvDate;

        public PlaceViewHolder(@NonNull View itemView) {
            super(itemView);

            tvPlaceName = itemView.findViewById(R.id.tv_name);
            tvBooksSold = itemView.findViewById(R.id.tv_subtitle_1);
            tvLakshmiEarned = itemView.findViewById(R.id.tv_subtitle_2);
            tvDate = itemView.findViewById(R.id.tv_date);
        }
    }
}
