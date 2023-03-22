package com.example.kotlin.di.activities.main

import com.example.kotlin.ui.MainActivity
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module(
    subcomponents = [MainActivitySubcomponent::class] // 1
)
interface MainActivityModule {
    @Binds
    @IntoMap
    @ClassKey(MainActivity::class) // 2
    fun bindMainActivitySubcomponentFactory(
        factory: MainActivitySubcomponent.Factory // 3
    ): AndroidInjector.Factory<*>
}