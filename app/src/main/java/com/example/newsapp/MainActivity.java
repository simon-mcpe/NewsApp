package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements Callback<Feed> {

    NewsService newsService = new NewsServiceBuilder().build();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        Call<Feed> call = newsService.fetchTopNews();
        call.enqueue(this);
    }

    protected void initViews() {
        recyclerView = findViewById(R.id.list);
    }

    @Override
    public void onResponse(Call<Feed> call, Response<Feed> response) {
        if (response.isSuccessful()) {
            Feed feed = response.body();
            onFeedReceived(feed);
        } else {
            Log.e("MainActivity", "onResponse was not successful");
            onError();
        }
    }

    @Override
    public void onFailure(Call<Feed> call, Throwable throwable) {
        Log.e("MainActivity", "onFailure: " + throwable.getMessage());
        onError();
    }

    protected void onFeedReceived(Feed feed) {
        Log.d("MainActivity", "Feed received: " + feed.toString());
    }

    protected void onError() {
        Log.e("MainActivity", "Feed request error");
    }
}