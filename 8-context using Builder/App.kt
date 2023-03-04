package com.example.kotlin

import android.app.Application
import com.example.kotlin.di.AppComponent
import com.example.kotlin.di.DaggerAppComponent

class App : Application() {
    companion object{
      lateinit  var appComponent: AppComponent
    }

    private val TAG = "App"
    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent
            .builder()
            .context(this)
            .build()


    }


}