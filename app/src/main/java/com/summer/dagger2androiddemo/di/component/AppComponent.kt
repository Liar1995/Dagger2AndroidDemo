package com.summer.dagger2androiddemo.di.component

import com.summer.dagger2androiddemo.MainActivity
import com.summer.dagger2androiddemo.MyApp
import com.summer.dagger2androiddemo.di.module.AppModule
import com.summer.dagger2androiddemo.di.scoped.ActivityScoped
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

/**
 * Created by sunmeng on 2018/8/22.
 * Email:sunmeng995@gmail.com
 * Description:
 */
@ActivityScoped
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
}