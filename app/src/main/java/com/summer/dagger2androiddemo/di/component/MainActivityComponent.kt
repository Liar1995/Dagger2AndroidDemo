package com.summer.dagger2androiddemo.di.component

import com.summer.dagger2androiddemo.MainActivity
import com.summer.dagger2androiddemo.di.module.MainActivityModule
import com.summer.dagger2androiddemo.di.scoped.ActivityScoped
import dagger.Component
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by sunmeng on 2018/8/24.
 * Email:sunmeng995@gmail.com
 * Description:
 */
@ActivityScoped
@Subcomponent(modules = [MainActivityModule::class])
interface MainActivityComponent : AndroidInjector<MainActivity> {

    //dagger-android 的固定写法 为ActivityBuilder中的bindMainActivity配套使用
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()

}