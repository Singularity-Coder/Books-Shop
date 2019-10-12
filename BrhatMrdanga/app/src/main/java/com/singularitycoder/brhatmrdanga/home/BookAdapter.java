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

public class BookAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<BookModel> bookList;
    Context context;

    public BookAdapter(ArrayList<BookModel> bookList, Context context) {
        this.bookList = bookList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_book, parent, false);
        return new BookViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        BookModel bookModel = bookList.get(position);
        ((BookViewHolder) holder).imgBookImage.setImageResource(bookModel.getImgBookImage());
        ((BookViewHolder) holder).tvBookName.setText(bookModel.getStrBookName());
        ((BookViewHolder) holder).tvBooksAvailable.setText(bookModel.getStrBooksAvailable());
        ((BookViewHolder) holder).tvBooksSold.setText(bookModel.getStrBooksSold());
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    class BookViewHolder extends RecyclerView.ViewHolder {

        ImageView imgBookImage;
        TextView tvBookName;
        TextView tvBooksAvailable;
        TextView tvBooksSold;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);

            imgBookImage = itemView.findViewById(R.id.img_book_pic);
            tvBookName = itemView.findViewById(R.id.tv_name);
            tvBooksAvailable = itemView.findViewById(R.id.tv_subtitle_1);
            tvBooksSold = itemView.findViewById(R.id.tv_subtitle_2);
        }
    }
}

