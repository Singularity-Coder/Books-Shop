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

import com.singularitycoder.brhatmrdanga.R;
import com.singularitycoder.brhatmrdanga.home.adapter.MembersAdapter;
import com.singularitycoder.brhatmrdanga.home.model.PersonModel;
import com.singularitycoder.brhatmrdanga.profileview.ProfileView;

import java.util.ArrayList;

public class AdminFragment extends Fragment {
    int color;

    public AdminFragment() {
    }

    @SuppressLint("ValidFragment")
    public AdminFragment(int color) {
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

        final FrameLayout frameLayout = view.findViewById(R.id.frame_lay_person);
        frameLayout.setBackgroundColor(color);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_person);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity().getBaseContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(20);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

        final ArrayList<PersonModel> adminList = new ArrayList<>();
        adminList.add(new PersonModel(R.drawable.face2, "Xie Xaifu", "Books Sold: 413", "Money Earned: 4,32,423"));
        adminList.add(new PersonModel(R.drawable.face1, "Bang Baifu", "Books Sold: 413", "Money Earned: 4,32,423"));
        adminList.add(new PersonModel(R.drawable.face3, "Dang Daifu", "Books Sold: 413", "Money Earned: 4,32,423"));

        final MembersAdapter membersAdapter = new MembersAdapter(getContext(), adminList);
        membersAdapter.setHasStableIds(true);
        membersAdapter.setOnItemClickListener((view1, position) -> {
            Toast.makeText(getContext(), position + " got clicked", Toast.LENGTH_LONG).show();
            // Start activity
            Intent adminIntent = new Intent(getContext(), ProfileView.class);
            adminIntent.putExtra("openAdmin", "ADMIN");
            startActivity(adminIntent);
        });
        recyclerView.setAdapter(membersAdapter);


        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_admin, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }
}
