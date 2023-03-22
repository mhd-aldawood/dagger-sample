package com.example.kotlin

import android.app.Application
import android.content.Context
import android.util.Log
import com.example.kotlin.di.AppComponent
import com.example.kotlin.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class App : Application(), HasAndroidInjector {
    @Inject
    lateinit var dispatchingAndroidInjector:
            DispatchingAndroidInjector<Any>
    private val TAG = "App"
    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.factory().create(this).inject(this)

        Log.i("MainActivity", applicationContext.toString())
    }

    override fun androidInjector(): AndroidInjector<Any> = dispatchingAndroidInjector
}