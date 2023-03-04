package com.example.kotlin

import android.app.Application
import android.util.Log
import com.example.kotlin.di.AppComponent
import com.example.kotlin.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class App : Application() {
    companion object{
      lateinit  var appComponent: AppComponent
    }

    private val TAG = "App"
    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent
            .create()

       var server= appComponent.serverProvider()
        Log.i(TAG, server.getServer())


    }


}