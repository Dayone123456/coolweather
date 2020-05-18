package com.example.coolweather.util;


import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {

        //第一步永远是创建一个HttpClient的实例
        OkHttpClient client = new OkHttpClient();
        //第二步是创建一个Request实例
        Request request = new Request
                .Builder()
                .url(address)
                .build();
        //enqueue是入队列的意思
        client.newCall(request).enqueue(callback);
    }
}
