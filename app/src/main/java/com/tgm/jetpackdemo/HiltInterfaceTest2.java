package com.tgm.jetpackdemo;

import android.util.Log;

import com.tgm.jetpackdemo.annotation.BindA;
import com.tgm.jetpackdemo.annotation.BindB;

import javax.inject.Inject;

/**
 * @Author: chen
 * @datetime: 2022/12/11
 * @desc:
 */
public class HiltInterfaceTest2 implements HiltInterface {

    private static final String TAG = "HiltInterfaceTest2";


    @Inject
    public HiltInterfaceTest2() {
    }

    @Override
    public void printLogger() {
        Log.i(TAG, "provide an dingping logan tool");

    }
}
