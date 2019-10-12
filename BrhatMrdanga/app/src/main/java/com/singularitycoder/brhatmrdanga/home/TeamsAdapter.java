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

public class TeamsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<TeamsModel> teamsList;
    Context context;

    public TeamsAdapter(ArrayList<TeamsModel> teamsList, Context context) {
        this.teamsList = teamsList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_team, parent, false);
        return new TeamsViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        TeamsModel teamsModel = teamsList.get(position);
        ((TeamsViewHolder) holder).imgTeamImage.setImageResource(teamsModel.getIntTeamImage());
        ((TeamsViewHolder) holder).tvTeamName.setText(teamsModel.getStrTeamName());
        ((TeamsViewHolder) holder).tvBooksSold.setText(teamsModel.getStrBooksSold());
        ((TeamsViewHolder) holder).tvLakshmiEarned.setText(teamsModel.getStrLakshmiEarned());
    }

    @Override
    public int getItemCount() {
        return teamsList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    class TeamsViewHolder extends RecyclerView.ViewHolder {

        ImageView imgTeamImage;
        TextView tvTeamName;
        TextView tvBooksSold;
        TextView tvLakshmiEarned;

        public TeamsViewHolder(@NonNull View itemView) {
            super(itemView);

            imgTeamImage = itemView.findViewById(R.id.img_team_image);
            tvTeamName = itemView.findViewById(R.id.tv_name);
            tvBooksSold = itemView.findViewById(R.id.tv_subtitle_1);
            tvLakshmiEarned = itemView.findViewById(R.id.tv_subtitle_2);
        }
    }
}

