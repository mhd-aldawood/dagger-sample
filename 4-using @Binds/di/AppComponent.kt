package com.example.kotlin.di

import com.example.kotlin.di.module.RepoProvider
import com.example.kotlin.di.module.ServerProvider
import com.example.kotlin.ui.MainActivity
import dagger.Component
import javax.inject.Singleton

@Component(modules = [RepoProvider::class,ServerProvider::class,ServerProvider.Bindings::class,])
@Singleton
interface AppComponent {
//    fun serverProvider(): Server
    fun inject(main : MainActivity)

}