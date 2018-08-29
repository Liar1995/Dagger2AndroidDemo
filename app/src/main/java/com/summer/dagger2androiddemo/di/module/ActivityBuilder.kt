package com.summer.dagger2androiddemo.di.module

import dagger.Module
import com.summer.dagger2androiddemo.MainActivity
import com.summer.dagger2androiddemo.di.scoped.ActivityScoped
import dagger.android.ContributesAndroidInjector


/**
 * Created by sunmeng on 2018/8/24.
 * Email:sunmeng995@gmail.com
 * Description:
 * 这个类的作用就是让Dagger知道我们所有的使用地（activity）
 * @Binds 就类似于 @Provides
 */
@Module
abstract class ActivityBuilder {

    @ActivityScoped
    @ContributesAndroidInjector(modules = [(MainActivityModule::class)])
    internal abstract fun bindMainActivity(): MainActivity

}