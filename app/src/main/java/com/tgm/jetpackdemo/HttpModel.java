package com.tgm.jetpackdemo;


import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

/**
 * @Author: chen
 * @datetime: 2022/12/11
 * @desc:用于对外提供httpobjecct对象的
 */

@InstallIn(ActivityComponent.class)
@Module
public class HttpModel {

    @Provides
    public HttpObject getHttpObject() {

        //这里可以根据业务需求定义复杂的生成对象
        return new HttpObject();
    }
}
