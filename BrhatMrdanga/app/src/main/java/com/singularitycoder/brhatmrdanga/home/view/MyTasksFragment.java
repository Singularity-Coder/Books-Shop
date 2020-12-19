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

public class MyTasksFragment extends Fragment {
    int color;

    public MyTasksFragment() {
    }

    @SuppressLint("ValidFragment")
    public MyTasksFragment(int color) {
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

        ArrayList<PersonModel> memberList = new ArrayList<>();
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Position: Folk Member", "Availability: 9 AM to 3 PM"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Position: Folk Member", "Availability: 9 AM to 3 PM"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Position: Folk Member", "Availability: 9 AM to 3 PM"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Position: Folk Member", "Availability: 9 AM to 3 PM"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Position: Folk Member", "Availability: 9 AM to 3 PM"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Position: Folk Member", "Availability: 9 AM to 3 PM"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Position: Folk Member", "Availability: 9 AM to 3 PM"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Position: Folk Member", "Availability: 9 AM to 3 PM"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Position: Folk Member", "Availability: 9 AM to 3 PM"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Position: Folk Member", "Availability: 9 AM to 3 PM"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Position: Folk Member", "Availability: 9 AM to 3 PM"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Position: Folk Member", "Availability: 9 AM to 3 PM"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Position: Folk Member", "Availability: 9 AM to 3 PM"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Position: Folk Member", "Availability: 9 AM to 3 PM"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Position: Folk Member", "Availability: 9 AM to 3 PM"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Position: Folk Member", "Availability: 9 AM to 3 PM"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Position: Folk Member", "Availability: 9 AM to 3 PM"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Position: Folk Member", "Availability: 9 AM to 3 PM"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Position: Folk Member", "Availability: 9 AM to 3 PM"));
        memberList.add(new PersonModel(R.drawable.face3, "Miki Mathews", "Position: Folk Member", "Availability: 9 AM to 3 PM"));

        final MembersAdapter membersAdapter = new MembersAdapter(getContext(), memberList);
        membersAdapter.setHasStableIds(true);
        membersAdapter.setOnItemClickListener(new MembersAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(getContext(), position + " got clicked", Toast.LENGTH_LONG).show();
                // Start activity
                Intent callerIntent = new Intent(getContext(), ProfileView.class);
                callerIntent.putExtra("openCaller", "CALLER");
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
