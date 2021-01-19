package com.example.newsapp;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NewsService {

    @GET("/feeds/topnews.rss")
    Call<Feed> fetchTopNews();

    @GET("/feeds/section/politik.rss")
    Call<Feed> fetchPolitics();

    @GET("/feeds/section/wirtschaft.rss")
    Call<Feed> fetchEconomics();

    @GET("/feeds/section/wirtschaft/webwelt.rss")
    Call<Feed> fetchDigitalNews();

    @GET("/feeds/section/wissenschaft.rss")
    Call<Feed> fetchScienceNews();

    @GET("/feeds/section/sport.rss")
    Call<Feed> fetchSportNews();

}
