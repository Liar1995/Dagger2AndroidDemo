package com.summer.dagger2androiddemo.di.module

import dagger.Module
import com.summer.dagger2androiddemo.di.component.MainActivityComponent
import android.app.Activity
import dagger.android.AndroidInjector
import com.summer.dagger2androiddemo.MainActivity
import dagger.android.ActivityKey
import dagger.multibindings.IntoMap
import dagger.Binds


/**
 * Created by sunmeng on 2018/8/24.
 * Email:sunmeng995@gmail.com
 * Description:
 * 这个类的作用就是让Dagger知道我们所有的使用地（activity）
 * @Binds 就类似于 @Provides
 */
@Module(subcomponents = [MainActivityComponent::class])
abstract class ActivityBuilder {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    internal abstract fun bindMainActivity(builder: MainActivityComponent.Builder): AndroidInjector.Factory<out Activity>

}