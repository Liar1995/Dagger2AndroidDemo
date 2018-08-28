package com.summer.dagger2androiddemo

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.HasActivityInjector
import dagger.android.DispatchingAndroidInjector
import javax.inject.Inject


/**
 * Created by sunmeng on 2018/8/22.
 * Email:sunmeng995@gmail.com
 * Description:
 */
class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
    }

}