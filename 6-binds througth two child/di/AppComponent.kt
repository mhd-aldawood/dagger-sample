package com.example.kotlin.di

import com.example.kotlin.di.module.ClientModule
import com.example.kotlin.di.module.ContextModule
import com.example.kotlin.ui.MainActivity
import dagger.Component
import javax.inject.Singleton

@Component(modules = [ContextModule::class,ClientModule::class])
@Singleton
interface AppComponent {
//    fun serverProvider(): Server
    fun inject(main : MainActivity)

}