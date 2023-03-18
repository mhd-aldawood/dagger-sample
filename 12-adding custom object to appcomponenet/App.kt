package com.example.kotlin

import android.app.Application
import android.content.Context
import android.util.Log
import com.example.kotlin.config.BussoConfiguration
import com.example.kotlin.di.AppComponent
import com.example.kotlin.di.DaggerAppComponent

class App : Application() {
    lateinit var appComponent: AppComponent
    private val TAG = "App"
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent
            .factory()
            .create(this, BussoConfiguration)
        Log.i("MainActivity", applicationContext.toString())
    }
}

 val Context.appComp: AppComponent
 get() = (applicationContext as App).appComponent
