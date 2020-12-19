package com.singularitycoder.brhatmrdanga.home.view;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.firestore.FirebaseFirestore;
import com.singularitycoder.brhatmrdanga.R;
import com.singularitycoder.brhatmrdanga.home.adapter.MembersAdapter;
import com.singularitycoder.brhatmrdanga.home.model.PersonModel;
import com.singularitycoder.brhatmrdanga.profileview.ProfileView;

import java.util.ArrayList;

public  class MemberFragment extends Fragment {
    int color;

    private FirebaseFirestore db;

    public MemberFragment() {
    }

    @SuppressLint("ValidFragment")
    public MemberFragment(int color) {
        this.color = color;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_person, container, false);

        db = FirebaseFirestore.getInstance();

        final FrameLayout frameLayout = view.findViewById(R.id.frame_lay_person);
        frameLayout.setBackgroundColor(color);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_person);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity().getBaseContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(20);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

         ArrayList<PersonModel> memberList = new ArrayList<>();
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Books Sold: 234", "Money Earned: 52,352"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Books Sold: 234", "Money Earned: 52,352"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Books Sold: 234", "Money Earned: 52,352"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Books Sold: 234", "Money Earned: 52,352"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Books Sold: 234", "Money Earned: 52,352"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Books Sold: 234", "Money Earned: 52,352"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Books Sold: 234", "Money Earned: 52,352"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Books Sold: 234", "Money Earned: 52,352"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Books Sold: 234", "Money Earned: 52,352"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Books Sold: 234", "Money Earned: 52,352"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Books Sold: 234", "Money Earned: 52,352"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Books Sold: 234", "Money Earned: 52,352"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Books Sold: 234", "Money Earned: 52,352"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Books Sold: 234", "Money Earned: 52,352"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Books Sold: 234", "Money Earned: 52,352"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Books Sold: 234", "Money Earned: 52,352"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Books Sold: 234", "Money Earned: 52,352"));

        // Get Member data from Firestore
//            db.collection("users")
//                    .get()
//                    .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
//                        @Override
//                        public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
//                            if (!queryDocumentSnapshots.isEmpty()) {
//                                List<DocumentSnapshot> list = queryDocumentSnapshots.getDocuments(); // got all documents in DocumentSnapshot format
//                                for (DocumentSnapshot c : list) {
//                                    PersonModel person = c.toObject(PersonModel.class);
//                                    memberList.add(person);
//                                }
////                                sDashAdapter.notifyDataSetChanged();
//                            }
//                        }
//                    });

        final MembersAdapter membersAdapter = new MembersAdapter(getContext(), memberList);
        membersAdapter.setHasStableIds(true);
        membersAdapter.setOnItemClickListener(new MembersAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(getContext(), position + " got clicked", Toast.LENGTH_LONG).show();
                // Start activity
                Intent callerIntent = new Intent(getContext(), ProfileView.class);
                callerIntent.putExtra("Open Member", "MEMBER");
                startActivity(callerIntent);
            }
        });
        recyclerView.setAdapter(membersAdapter);

        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_callers, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }
}
