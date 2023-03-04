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


    @Component.Factory
    interface Builder {
        fun create(@BindsInstance application: Application):
                AppComponent
    }

//    @Component.Builder
//    interface Builder {
//        @BindsInstance // 2
//        fun context(context: Context): Builder
//        fun build(): AppComponent // 3
//    }
}