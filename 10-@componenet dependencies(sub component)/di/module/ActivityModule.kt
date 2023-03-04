package com.example.kotlin.di.module

import android.app.Activity
import android.app.Application
import android.content.Context
import com.example.kotlin.di.scope.ActivityScope
import com.example.kotlin.helper.NewServer
import com.example.kotlin.helper.Server
import dagger.Module
import dagger.Provides
@Module
class ActivityModule {
    @Provides
    @ActivityScope
    fun provideNavigator(activity: Activity,application: Application): Server = Server(activity,application)
}