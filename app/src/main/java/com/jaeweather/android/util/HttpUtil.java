package com.jaeweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 10961 on 2018/6/20.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
