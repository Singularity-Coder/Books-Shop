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

import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.singularitycoder.brhatmrdanga.R;
import com.singularitycoder.brhatmrdanga.home.adapter.DashAdapter;
import com.singularitycoder.brhatmrdanga.profileview.ProfileView;
import com.singularitycoder.brhatmrdanga.rankings.MemberRankingsActivity;

import java.util.ArrayList;
import java.util.List;

public class DashboardFragment extends Fragment {

    private static final String TAG = "DashboardFragment";

    ArrayList<HomeActivity.DashModel> dashList;
    DashAdapter sDashAdapter;

    private FirebaseFirestore db;

    public DashboardFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dash, container, false);

        db = FirebaseFirestore.getInstance();

        RecyclerView recyclerView = view.findViewById(R.id.recycler_dash);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity().getBaseContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(20);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

        dashList = new ArrayList<>();
        dashList.add(new HomeActivity.DashModel("300"));
        dashList.add(new HomeActivity.DashModel(R.drawable.ic_book_black_24dp, "Total Books Sold", "6500"));
        dashList.add(new HomeActivity.DashModel(R.drawable.ic_attach_money_black_24dp, "Total Money Earned", "24"));
        dashList.add(new HomeActivity.DashModel(R.drawable.ic_location_on_black_24dp, "Total Places Targeted", "3"));
        dashList.add(new HomeActivity.DashModel(R.drawable.ic_target_black_24dp, "This month's target", "6500"));
        dashList.add(new HomeActivity.DashModel(R.drawable.ic_tasks_finished_black_24dp, "Tasks finished", "24"));
        dashList.add(new HomeActivity.DashModel(R.drawable.ic_pending_black_24dp, "Tasks pending", "3"));
        dashList.add(new HomeActivity.DashModel(R.drawable.ic_hourspent_black_24dp, "Hours spent", "54"));
        dashList.add(new HomeActivity.DashModel(R.drawable.ic_emoji_events_24px, "Member Rank", "3"));
        dashList.add(new HomeActivity.DashModel(R.drawable.ic_group_work_black_24dp, "Team Rank", "2"));

        // Get Dashboard data from Firestore
        db.collection("dashboard")
                .get()
                .addOnSuccessListener(queryDocumentSnapshots -> {
                    if (!queryDocumentSnapshots.isEmpty()) {
                        List<DocumentSnapshot> list = queryDocumentSnapshots.getDocuments(); // got all documents in DocumentSnapshot format
                        for (DocumentSnapshot d : list) {
                            HomeActivity.DashModel dash = d.toObject(HomeActivity.DashModel.class);
                            dashList.add(dash);
                        }
//                                sDashAdapter.notifyDataSetChanged();
                    }
                });

        sDashAdapter = new DashAdapter(dashList, getContext());
        sDashAdapter.setHasStableIds(true);
        recyclerView.setAdapter(sDashAdapter);
        sDashAdapter.notifyDataSetChanged();

        return view;
    }

    // Fetch all documents inside the "Users" collection n put them in a list

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
            case R.id.action_team_rankings:
                Intent rankIntent = new Intent(getActivity(), MemberRankingsActivity.class);
                startActivity(rankIntent);
                return true;
            case R.id.action_my_profile:
                Intent profileIntent = new Intent(getActivity(), ProfileView.class);
                profileIntent.putExtra("openMyProfile", "MYPROFILE");
                startActivity(profileIntent);
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
