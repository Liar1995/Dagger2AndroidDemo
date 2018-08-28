package com.summer.dagger2androiddemo.di.scoped

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Scope

/**
 * Created by sunmeng on 2018/8/24.
 * Email:sunmeng995@gmail.com
 * Description:
 */
@Documented
@Scope
@Retention(RetentionPolicy.RUNTIME)
annotation class ActivityScoped
