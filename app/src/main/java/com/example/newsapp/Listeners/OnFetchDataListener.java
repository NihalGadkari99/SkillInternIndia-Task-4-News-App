package com.example.newsapp.Listeners;

import com.example.newsapp.Models.APIStatus;
import com.example.newsapp.Models.NewsHeadline;

import java.util.List;

public interface OnFetchDataListener<T> {
    void onFetchData(List<NewsHeadline> data,  String message);
    void onError(String message);

}
