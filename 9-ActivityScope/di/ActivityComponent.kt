package com.example.kotlin.di

import android.app.Activity
import com.example.kotlin.di.module.ActivityModule
import com.example.kotlin.di.scope.ActivityScope
import com.example.kotlin.ui.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [ActivityModule::class] // 1
)
@ActivityScope // 2
interface ActivityComponent {
    fun inject(activity: MainActivity) // 3
    @Component.Factory
    interface Factory {
        // 5
        fun create(@BindsInstance activity: Activity,):
        /*
        if we want to pass object from app graph to to activity graph in this way add AppComponent

        */
                ActivityComponent
    }
}