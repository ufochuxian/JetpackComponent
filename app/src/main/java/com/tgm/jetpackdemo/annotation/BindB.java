package com.tgm.jetpackdemo.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * @Author: chen
 * @datetime: 2022/12/11
 * @desc:
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface BindB {
}
