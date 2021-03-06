package com.summer.dagger2androiddemo.di.component

import com.summer.dagger2androiddemo.MyApp
import com.summer.dagger2androiddemo.di.module.ActivityBuilder
import com.summer.dagger2androiddemo.di.module.AppModule
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
@Singleton
@Component(modules = [AppModule::class, AndroidInjectionModule::class, ActivityBuilder::class])
interface AppComponent : AndroidInjector<MyApp> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: MyApp): Builder

        fun build(): AppComponent
    }

}