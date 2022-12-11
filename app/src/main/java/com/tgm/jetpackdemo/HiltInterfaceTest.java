package com.tgm.jetpackdemo;

import android.util.Log;

import com.tgm.jetpackdemo.annotation.BindA;

import javax.inject.Inject;

/**
 * @Author: chen
 * @datetime: 2022/12/11
 * @desc:
 */
public class HiltInterfaceTest implements HiltInterface {

    private static final String TAG = "HiltInterfaceTest";

    @Inject
    public HiltInterfaceTest() {

    }

    @Override
    public void printLogger() {
        Log.i(TAG, "provide an meituan logan tool");
    }
}
