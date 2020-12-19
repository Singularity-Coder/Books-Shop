package com.singularitycoder.brhatmrdanga.home.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.firestore.FirebaseFirestore;
import com.singularitycoder.brhatmrdanga.R;
import com.singularitycoder.brhatmrdanga.home.model.TeamModel;
import com.singularitycoder.brhatmrdanga.home.adapter.TeamsAdapter;

import java.util.ArrayList;

public class TeamsFragment extends Fragment {
    ArrayList<TeamModel> teamsList;
    TeamsAdapter mTeamsAdapter;

    private FirebaseFirestore db;

    public TeamsFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_team, container, false);

        db = FirebaseFirestore.getInstance();

        final FrameLayout frameLayout = view.findViewById(R.id.frame_lay_team);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_team);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity().getBaseContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(20);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

        teamsList = new ArrayList<>();

        teamsList.add(new TeamModel(R.drawable.b1,"Phoenix", "Books Sold: 343", "Money Earned: Rs 13,414,232"));
        teamsList.add(new TeamModel(R.drawable.books,"Bronx", "Books Sold: 343", "Money Earned: Rs 13,414,232"));
        teamsList.add(new TeamModel(R.drawable.b1,"Phoenix", "Books Sold: 343", "Money Earned: Rs 13,414,232"));
        teamsList.add(new TeamModel(R.drawable.books,"Bronx", "Books Sold: 343", "Money Earned: Rs 13,414,232"));
        teamsList.add(new TeamModel(R.drawable.b1,"Phoenix", "Books Sold: 343", "Money Earned: Rs 13,414,232"));
        teamsList.add(new TeamModel(R.drawable.books,"Bronx", "Books Sold: 343", "Money Earned: Rs 13,414,232"));
        teamsList.add(new TeamModel(R.drawable.b1,"Phoenix", "Books Sold: 343", "Money Earned: Rs 13,414,232"));
        teamsList.add(new TeamModel(R.drawable.books,"Bronx", "Books Sold: 343", "Money Earned: Rs 13,414,232"));
        teamsList.add(new TeamModel(R.drawable.b1,"Phoenix", "Books Sold: 343", "Money Earned: Rs 13,414,232"));
        teamsList.add(new TeamModel(R.drawable.books,"Bronx", "Books Sold: 343", "Money Earned: Rs 13,414,232"));


        mTeamsAdapter = new TeamsAdapter(teamsList, getContext());
        mTeamsAdapter.setHasStableIds(true);
//            mPlaceAdapter.setOnItemClickListener(new MembersAdapter.OnItemClickListener() {
//                @Override
//                public void onItemClick(View view, int position) {
//                    Toast.makeText(getContext(), position + " got clicked", Toast.LENGTH_LONG).show();
//                    // Start activity
//                    Intent contactIntent = new Intent(getContext(), ProfileView.class);
//                    contactIntent.putExtra("openContact", "CONTACT");
//                    startActivity(contactIntent);
//                }
//            });
        recyclerView.setAdapter(mTeamsAdapter);

        // Get Team data from Firestore
//            db.collection("teams")
//                    .get()
//                    .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
//                        @Override
//                        public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
//                            if (!queryDocumentSnapshots.isEmpty()) {
//                                List<DocumentSnapshot> list = queryDocumentSnapshots.getDocuments(); // got all documents in DocumentSnapshot format
//                                for (DocumentSnapshot t : list) {
//                                    TeamModel team = t.toObject(TeamModel.class);
//                                    teamsList.add(team);
//                                }
//                                mTeamsAdapter.notifyDataSetChanged();
//                            }
//                        }
//                    });


        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_admin, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }
}
