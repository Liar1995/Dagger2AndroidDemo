package com.summer.dagger2androiddemo.di.component

import com.summer.dagger2androiddemo.MyApp
import com.summer.dagger2androiddemo.di.module.ActivityBuilder
import com.summer.dagger2androiddemo.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by sunmeng on 2018/8/22.
 * Email:sunmeng995@gmail.com
 * Description:
 */
@Component(modules = [AppModule::class, AndroidSupportInjectionModule::class, ActivityBuilder::class])
interface AppComponent : AndroidInjector<MyApp> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<MyApp>()

}