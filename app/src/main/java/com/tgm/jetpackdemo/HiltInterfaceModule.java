package com.tgm.jetpackdemo;

import com.tgm.jetpackdemo.annotation.BindA;
import com.tgm.jetpackdemo.annotation.BindB;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

/**
 * @Author: chen
 * @datetime: 2022/12/11
 * @desc:
 */
@InstallIn(ActivityComponent.class)
@Module
public abstract class HiltInterfaceModule {


   // 这里如果是接口，需要多实现的情况下，在依赖注入的时候，为了进行区分，这里需要使用Qualifier自定义限定符来进行区分
   // 这里有个小的注意点就是，HiltInterfaceTest类的构造函数需要使用@inject来进行处理一下
   @BindA
   @Binds
   public abstract HiltInterface bindAHiltInterface(HiltInterfaceTest hiltInterfaceTest);

   @BindB
   @Binds
   public abstract HiltInterface bindBHiltInterface(HiltInterfaceTest2 hiltInterfaceTest);

}
