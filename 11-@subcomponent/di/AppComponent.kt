package com.example.kotlin.di

import android.app.Activity
import android.app.Application
import android.content.Context
import com.example.kotlin.di.module.ServerProvider
import com.example.kotlin.ui.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(modules = [ServerProvider::class])
@Singleton
interface AppComponent {

    /*
    * you need a bit more because ActivityComponent
    needs an Activity. So what if, instead of creating a method that returns the
    ActivityComponent, you define a method to get the Factory or the Builder for it?
    This is what you can use to create or build the ActivityComponent given an
    Activity.
    * */
    /*. Because ActivityComponent needs an Activity, you’ve defined a factory method for its Factory*/
    fun activityComponentFactory(): ActivityComponent.Factory

//    fun contextProvider(): Application

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: Application):
                AppComponent
    }

}