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

import com.singularitycoder.brhatmrdanga.R;
import com.singularitycoder.brhatmrdanga.home.adapter.BookAdapter;
import com.singularitycoder.brhatmrdanga.home.model.BookModel;

import java.util.ArrayList;

public class BookVaultFragment extends Fragment {
    ArrayList<BookModel> bookList;
    BookAdapter mBookAdapter;

    public BookVaultFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_place, container, false);

        final FrameLayout frameLayout = view.findViewById(R.id.frame_lay_place);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_place);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity().getBaseContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(20);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

        bookList = new ArrayList<>();
        bookList.add(new BookModel(R.drawable.b1, "Hallow Be Thy Face", "Books Available: 3,35,23", "Books Sold: 3,35,23,32,243"));
        bookList.add(new BookModel(R.drawable.b2, "Rumble In the Teeth", "Books Available: 4,35,2", "Books Sold: 3,35,23,32,243"));
        bookList.add(new BookModel(R.drawable.b1, "Hallow Be Thy Face", "Books Available: 3,35,23", "Books Sold: 3,35,23,32,243"));
        bookList.add(new BookModel(R.drawable.b2, "Rumble In the Teeth", "Books Available: 4,35,2", "Books Sold: 3,35,23,32,243"));
        bookList.add(new BookModel(R.drawable.b1, "Hallow Be Thy Face", "Books Available: 3,35,23", "Books Sold: 3,35,23,32,243"));
        bookList.add(new BookModel(R.drawable.b2, "Rumble In the Teeth", "Books Available: 4,35,2", "Books Sold: 3,35,23,32,243"));
        bookList.add(new BookModel(R.drawable.b1, "Hallow Be Thy Face", "Books Available: 3,35,23", "Books Sold: 3,35,23,32,243"));
        bookList.add(new BookModel(R.drawable.b2, "Rumble In the Teeth", "Books Available: 4,35,2", "Books Sold: 3,35,23,32,243"));
        bookList.add(new BookModel(R.drawable.b1, "Hallow Be Thy Face", "Books Available: 3,35,23", "Books Sold: 3,35,23,32,243"));
        bookList.add(new BookModel(R.drawable.b2, "Rumble In the Teeth", "Books Available: 4,35,2", "Books Sold: 3,35,23,32,243"));

        mBookAdapter = new BookAdapter(bookList, getContext());
        mBookAdapter.setHasStableIds(true);
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
        recyclerView.setAdapter(mBookAdapter);

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
