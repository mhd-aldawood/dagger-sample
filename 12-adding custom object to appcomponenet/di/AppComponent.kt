package com.example.kotlin.di

import android.app.Application
import com.example.kotlin.config.NetworkingConfiguration
import com.example.kotlin.di.module.NetworkingModule
import com.example.kotlin.ui.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(
    dependencies = [NetworkingConfiguration::class],
    modules = [NetworkingModule::class])
@Singleton
interface AppComponent {

fun inject (mainActivity: MainActivity)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: Application,
                   networkingConfiguration: NetworkingConfiguration):
                AppComponent
    }

}