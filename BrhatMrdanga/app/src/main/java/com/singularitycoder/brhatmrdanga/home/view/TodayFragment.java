package com.singularitycoder.brhatmrdanga.home.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.singularitycoder.brhatmrdanga.R;
import com.singularitycoder.brhatmrdanga.home.adapter.TodayAdapter;
import com.singularitycoder.brhatmrdanga.profileview.ProfileView;
import com.singularitycoder.brhatmrdanga.rankings.MemberRankingsActivity;
import com.singularitycoder.brhatmrdanga.rankings.TeamRankingsActivity;

import java.util.ArrayList;

public class TodayFragment extends Fragment {
    ArrayList<HomeActivity.TodayModel> todayList;
    TodayAdapter mTodayAdapter;

    public TodayFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_today, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_today);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity().getBaseContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(20);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

        todayList = new ArrayList<>();
        todayList.add(new HomeActivity.TodayModel(R.drawable.ic_attach_money_black_24dp, "Money Earned", "26,500"));
        todayList.add(new HomeActivity.TodayModel(R.drawable.ic_book_black_24dp, "Books Sold", "550"));
        todayList.add(new HomeActivity.TodayModel(R.drawable.ic_collections_bookmark_black_24dp, "Books Taken", "900"));
        todayList.add(new HomeActivity.TodayModel(R.drawable.ic_target_black_24dp, "Total Target Places", "13"));
        todayList.add(new HomeActivity.TodayModel(R.drawable.ic_people_black_24dp, "Total Teams", "42"));
        todayList.add(new HomeActivity.TodayModel(R.drawable.ic_person_black_24dp, "Total Members", "161"));

        mTodayAdapter = new TodayAdapter(todayList, getContext());
        mTodayAdapter.setHasStableIds(true);
        recyclerView.setAdapter(mTodayAdapter);
        mTodayAdapter.notifyDataSetChanged();

        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_today, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            // Home Menu
            case R.id.action_notifications:
                new HomeActivity().dialogNotifications(getActivity());
                return true;
            case R.id.action_my_profile:
                Intent profileIntent = new Intent(getActivity(), ProfileView.class);
                profileIntent.putExtra("openMyProfile", "MYPROFILE");
                startActivity(profileIntent);
                return true;
            case R.id.action_team_rankings:
                Intent rankIntent = new Intent(getActivity(), TeamRankingsActivity.class);
                startActivity(rankIntent);
                return true;
            case R.id.action_member_rankings:
                Intent teamRankIntent = new Intent(getActivity(), MemberRankingsActivity.class);
                startActivity(teamRankIntent);
                return true;
            case R.id.action_about:
                new HomeActivity().aboutDialog(getActivity());
                return true;
            case R.id.action_change_password:
                return true;
            case R.id.action_delete_account:
                return true;
            case R.id.action_log_out:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
