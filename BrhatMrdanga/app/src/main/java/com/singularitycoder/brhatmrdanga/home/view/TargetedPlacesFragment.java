package com.singularitycoder.brhatmrdanga.home.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.firestore.FirebaseFirestore;
import com.singularitycoder.brhatmrdanga.R;
import com.singularitycoder.brhatmrdanga.home.adapter.PlaceAdapter;
import com.singularitycoder.brhatmrdanga.home.model.PlaceModel;

import java.util.ArrayList;

public class TargetedPlacesFragment extends Fragment {
    ArrayList<PlaceModel> placeList;
    PlaceAdapter mPlaceAdapter;

    private FirebaseFirestore db;

    public TargetedPlacesFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_place, container, false);

        db = FirebaseFirestore.getInstance();

        final FrameLayout frameLayout = view.findViewById(R.id.frame_lay_place);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_place);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity().getBaseContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(20);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

        placeList = new ArrayList<>();
        placeList.add(new PlaceModel("Koramangala Metro", "Books Sold: 343", "Money Earned: Rs 13,414,232", "13/03/19"));
        placeList.add(new PlaceModel("Bingo Plaza", "Books Sold: 343", "Money Earned: Rs 13,414,232", "13/03/19"));
        placeList.add(new PlaceModel("Fhattinad", "Books Sold: 343", "Money Earned: Rs 13,414,232", "13/03/19"));
        placeList.add(new PlaceModel("Gisny Land", "Books Sold: 343", "Money Earned: Rs 13,414,232", "13/03/19"));
        placeList.add(new PlaceModel("VVR Cinemas", "Books Sold: 343", "Money Earned: Rs 13,414,232", "13/03/19"));
        placeList.add(new PlaceModel("Kello Street", "Books Sold: 343", "Money Earned: Rs 13,414,232", "13/03/19"));
        placeList.add(new PlaceModel("Bla Bla Beach", "Books Sold: 343", "Money Earned: Rs 13,414,232", "13/03/19"));
        placeList.add(new PlaceModel("Trivi Metro", "Books Sold: 343", "Money Earned: Rs 13,414,232", "13/03/19"));
        placeList.add(new PlaceModel("Bela Binja", "Books Sold: 343", "Money Earned: Rs 13,414,232", "13/03/19"));
        placeList.add(new PlaceModel("Steam Punk Road", "Books Sold: 343", "Money Earned: Rs 13,414,232", "13/03/19"));
        placeList.add(new PlaceModel("Mahatma Gandhi Road", "Books Sold: 343", "Money Earned: Rs 13,414,232", "13/03/19"));


        // Get Place data from Firestore
//            db.collection("placesVisited")
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
////                                mPlaceAdapter.notifyDataSetChanged();
//                            }
//                        }
//                    });


        mPlaceAdapter = new PlaceAdapter(placeList, getContext());
        mPlaceAdapter.setHasStableIds(true);
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
        recyclerView.setAdapter(mPlaceAdapter);

        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_contacts, menu);
        super.onCreateOptionsMenu(menu, inflater);
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
