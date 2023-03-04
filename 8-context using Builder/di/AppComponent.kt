package com.example.kotlin.di

import android.app.Activity
import android.content.Context
import com.example.kotlin.di.module.ServerProvider
import com.example.kotlin.ui.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(modules = [ServerProvider::class])
@Singleton
interface AppComponent {
//    fun serverProvider(): Server
    fun inject(main : MainActivity)
//    @Component.Builder
//    interface Builder {
//        fun appModule(appModule: AppModule): Builder
//        fun networkModule(networkModule: NetworkModule): Builder
//        fun build(): AppComponent
//    }

    @Component.Builder
    interface Builder {
        @BindsInstance // 2
        fun context(context: Context): Builder
        fun build(): AppComponent // 3
    }
}