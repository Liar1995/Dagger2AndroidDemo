package com.summer.dagger2androiddemo

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.summer.dagger2androiddemo.di.component.DaggerAppComponent
import com.summer.dagger2androiddemo.di.module.AppModule
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var stu: Student

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerAppComponent.builder().appModule(AppModule()).build().inject(this)
        setContentView(R.layout.activity_main)
        txt_hello.text = stu.name + " " + stu.age
    }

}
