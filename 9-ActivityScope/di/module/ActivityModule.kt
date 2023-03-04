package com.example.kotlin.di.module

import android.app.Activity
import com.example.kotlin.di.scope.ActivityScope
import com.example.kotlin.helper.Server
import dagger.Module
import dagger.Provides
@Module
class ActivityModule {
    @Provides
    @ActivityScope
    fun provideNavigator(activity: Activity): Server = Server(activity)
}