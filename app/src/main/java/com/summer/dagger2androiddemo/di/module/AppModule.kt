package com.summer.dagger2androiddemo.di.module

import com.summer.dagger2androiddemo.MyApp
import com.summer.dagger2androiddemo.di.component.MainActivityComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by sunmeng on 2018/8/24.
 * Email:sunmeng995@gmail.com
 * Description:提供全局级别的application
 */
@Module
class AppModule {

    @Singleton
    @Provides
    fun provideContext(app: MyApp) = app

}