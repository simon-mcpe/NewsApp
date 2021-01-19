package com.example.newsapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NewsViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView titleTextView;
    TextView teaserTextView;

    public NewsViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.image);
        titleTextView = itemView.findViewById(R.id.title);
        teaserTextView = itemView.findViewById(R.id.teaser);
    }
}
