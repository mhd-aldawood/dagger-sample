package com.example.kotlin.di

import android.app.Application
import com.example.kotlin.App
import com.example.kotlin.di.activities.main.MainActivityModule
import com.example.kotlin.di.module.NetworkingModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        NetworkingModule::class,
        MainActivityModule::class
    ]
)
@Singleton
interface AppComponent {


        @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: Application):
                AppComponent
    }
    fun inject(app: App)


}