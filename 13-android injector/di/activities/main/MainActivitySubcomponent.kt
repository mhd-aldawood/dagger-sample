package com.example.kotlin.di.activities.main

import com.example.kotlin.di.activities.ActivityModule
import com.example.kotlin.di.scope.ActivityScope
import com.example.kotlin.ui.MainActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(
    modules = [
ActivityModule::class, // 1
]
)

@ActivityScope // 2
interface MainActivitySubcomponent :
    AndroidInjector<MainActivity> { // 3
    @Subcomponent.Factory // 4
    interface Factory : AndroidInjector.Factory<MainActivity> // 5
}