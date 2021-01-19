package com.example.newsapp;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NewsListAdapter extends RecyclerView.Adapter<NewsViewHolder> {

    Feed feed;

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {

    }

    public void setFeed(Feed feed) {
        this.feed = feed;
    }

    @Override
    public int getItemCount() {
        if (feed != null) {
            return feed.channel.newsList.size();
        } else {
            return 0;
        }
    }
}
