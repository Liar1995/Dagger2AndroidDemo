package com.summer.dagger2androiddemo.di.module

import com.summer.dagger2androiddemo.Student
import com.summer.dagger2androiddemo.di.scoped.ActivityScoped
import dagger.Module
import dagger.Provides

/**
 * Created by sunmeng on 2018/8/24.
 * Email:sunmeng995@gmail.com
 * Description:
 */
@Module
class MainActivityModule {

    @ActivityScoped
    @Provides
    fun provideStudent() = Student("sm", "1995")
}