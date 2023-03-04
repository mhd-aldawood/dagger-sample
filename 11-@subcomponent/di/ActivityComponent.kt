package com.example.kotlin.di

import android.app.Activity
import com.example.kotlin.di.module.ActivityModule
import com.example.kotlin.di.scope.ActivityScope
import com.example.kotlin.ui.MainActivity
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(
    modules = [ActivityModule::class]
)
@ActivityScope // 2
interface ActivityComponent {
    fun inject(activity: MainActivity) // 3
    @Subcomponent.Factory
    interface Factory {
        /* because it needs an Activity that it doesn’t inherit from its parent, ApplicationComponent.
        To handle this we pass the activity using this way*/
        fun create(@BindsInstance activity: Activity):
        /*
        if we want to pass object from app graph to to activity graph in this way add AppComponent

        */
                ActivityComponent
    }
}