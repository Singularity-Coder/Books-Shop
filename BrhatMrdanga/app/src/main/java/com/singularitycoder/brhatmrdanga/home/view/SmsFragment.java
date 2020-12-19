package com.singularitycoder.brhatmrdanga.home.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.singularitycoder.brhatmrdanga.R;
import com.singularitycoder.brhatmrdanga.home.model.PersonModel;
import com.singularitycoder.brhatmrdanga.home.adapter.SmsAdapter;

import java.util.ArrayList;

public class SmsFragment extends Fragment {
    ArrayList<PersonModel> smsList;
    SmsAdapter smsAdapter;

    public SmsFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_person, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_person);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity().getBaseContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(20);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

        smsList = new ArrayList<>();
        smsList.add(new PersonModel("Jasmin Jamon", R.drawable.face3, "Hey Jasmin, what happened to the 2 million contacts i told u to call in 3 minutes? Huhahahahah huahahaha huahahahahahahahaaaaaaaaa!", "19/2/19", null));
        smsList.add(new PersonModel("Marvin Michael", R.drawable.face2, "Hey Marvin, what happened to the 2 million contacts i told u to call in 3 minutes? Huhahahahah huahahaha huahahahahahahahaaaaaaaaa!", "21/6/20", "7"));
        smsList.add(new PersonModel("Juniper Jupiter", R.drawable.face1, "Hey Juniper, what happened to the 2 million contacts i told u to call in 3 minutes? Huhahahahah huahahaha huahahahahahahahaaaaaaaaa!", "7/2/20", null));
        smsList.add(new PersonModel("Jasmin Jamon", R.drawable.face3, "Hey Jasmin, what happened to the 2 million contacts i told u to call in 3 minutes? Huhahahahah huahahaha huahahahahahahahaaaaaaaaa!", "19/2/19", "3"));
        smsList.add(new PersonModel("Marvin Michael", R.drawable.face2, "Hey Marvin, what happened to the 2 million contacts i told u to call in 3 minutes? Huhahahahah huahahaha huahahahahahahahaaaaaaaaa!", "21/6/20", "7"));
        smsList.add(new PersonModel("Juniper Jupiter", R.drawable.face1, "Hey Juniper, what happened to the 2 million contacts i told u to call in 3 minutes? Huhahahahah huahahaha huahahahahahahahaaaaaaaaa!", "7/2/20", null));
        smsList.add(new PersonModel("Jasmin Jamon", R.drawable.face3, "Hey Jasmin, what happened to the 2 million contacts i told u to call in 3 minutes? Huhahahahah huahahaha huahahahahahahahaaaaaaaaa!", "19/2/19", "3"));
        smsList.add(new PersonModel("Marvin Michael", R.drawable.face2, "Hey Marvin, what happened to the 2 million contacts i told u to call in 3 minutes? Huhahahahah huahahaha huahahahahahahahaaaaaaaaa!", "21/6/20", "7"));
        smsList.add(new PersonModel("Juniper Jupiter", R.drawable.face1, "Hey Juniper, what happened to the 2 million contacts i told u to call in 3 minutes? Huhahahahah huahahaha huahahahahahahahaaaaaaaaa!", "7/2/20", "1"));
        smsList.add(new PersonModel("Jasmin Jamon", R.drawable.face3, "Hey Jasmin, what happened to the 2 million contacts i told u to call in 3 minutes? Huhahahahah huahahaha huahahahahahahahaaaaaaaaa!", "19/2/19", "3"));
        smsList.add(new PersonModel("Marvin Michael", R.drawable.face2, "Hey Marvin, what happened to the 2 million contacts i told u to call in 3 minutes? Huhahahahah huahahaha huahahahahahahahaaaaaaaaa!", "21/6/20", "7"));
        smsList.add(new PersonModel("Juniper Jupiter", R.drawable.face1, "Hey Juniper, what happened to the 2 million contacts i told u to call in 3 minutes? Huhahahahah huahahaha huahahahahahahahaaaaaaaaa!", "7/2/20", "1"));


        smsAdapter = new SmsAdapter(smsList, getContext());
        smsAdapter.setHasStableIds(true);

        recyclerView.setAdapter(smsAdapter);

        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_callers, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }
}
