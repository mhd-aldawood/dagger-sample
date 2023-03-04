package com.example.kotlin

import android.app.Application
import android.content.Context
import com.example.kotlin.di.AppComponent
import com.example.kotlin.di.DaggerAppComponent

class App : Application() {
//    companion object{
//      lateinit  var appComponent: AppComponent
//    }
    lateinit var appComponent: AppComponent
    public val Context.appComp: AppComponent
    public get() =(applicationContext).appComp
    private val TAG = "App"
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent
            .factory()
            .create(this)

//        appComponent = DaggerAppComponent
//            .builder()
//            .context(this)
//            .build()


    }


}