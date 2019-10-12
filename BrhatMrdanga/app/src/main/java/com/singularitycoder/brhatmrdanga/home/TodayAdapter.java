package com.singularitycoder.brhatmrdanga.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.singularitycoder.brhatmrdanga.R;

import java.util.ArrayList;

public class TodayAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<HomeActivity.TodayModel> todayList;
    Context context;

    public TodayAdapter(ArrayList<HomeActivity.TodayModel> todayList, Context context) {
        this.todayList = todayList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        v = layoutInflater.inflate(R.layout.item_today_header, parent, false);
        return new TodayViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        HomeActivity.TodayModel todayModel = todayList.get(position);
        ((TodayViewHolder) holder).todayImage.setImageResource(todayModel.getIntTodayImage());
        ((TodayViewHolder) holder).todayTitle.setText(todayModel.getStrTodayTitle());
        ((TodayViewHolder) holder).todayCount.setText(todayModel.getStrTodayCount());

    }

    @Override
    public int getItemCount() {
        return todayList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    public class TodayViewHolder extends RecyclerView.ViewHolder {

        ImageView todayImage;
        TextView todayTitle;
        TextView todayCount;

        public TodayViewHolder(@NonNull View itemView) {
            super(itemView);

            todayImage = itemView.findViewById(R.id.img_dash_stat_icon);
            todayTitle = itemView.findViewById(R.id.tv_dash_stat_title);
            todayCount = itemView.findViewById(R.id.tv_dash_stat_count);
        }
    }
}
