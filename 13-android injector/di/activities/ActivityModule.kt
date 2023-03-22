package com.example.kotlin.di.activities

import android.app.Application
import com.example.kotlin.di.scope.ActivityScope
import com.example.kotlin.helper.Server
import dagger.Module
import dagger.Provides
@Module
class ActivityModule {
    @Provides
    @ActivityScope // 2
    fun provideNavigator(application: Application): Server = Server(application)
}