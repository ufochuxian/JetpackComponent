package com.tgm.jetpackdemo;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

/**
 * @Author: chen
 * @datetime: 2022/12/11
 * @desc:
 */


public class HttpObject {

    private static final String TAG = "HttpObject";

    public HttpObject getHttpObject() {
        return new HttpObject();
    }


    public void post(String url) {
        Log.i(TAG,"httpObject [post]:" + url);
    }

}
