package com.example.kotlin.di

import com.example.kotlin.di.module.ClassesProvider
import com.example.kotlin.di.module.RepoProvider
import com.example.kotlin.di.module.ServerProvider
import com.example.kotlin.helper.Server
import com.example.kotlin.ui.MainActivity
import dagger.Component

@Component(modules = [RepoProvider::class/*, ServerProvider::class*/,ClassesProvider::class])
interface AppComponent {
//    fun serverProvider(): Server
    fun inject(main : MainActivity)

}