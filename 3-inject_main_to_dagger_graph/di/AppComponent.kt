package com.example.kotlin.di

import com.example.kotlin.di.module.RepoProvider
import com.example.kotlin.helper.BaseActivity
import com.example.kotlin.helper.Server
import com.example.kotlin.ui.MainActivity
import dagger.Component

@Component(modules = [RepoProvider::class])
interface AppComponent {
    fun serverProvider(): Server
    fun inject(main : BaseActivity)
    fun inject(main : MainActivity)

}