package com.example.kotlin.di.module

import android.content.Context
import com.example.kotlin.helper.Server
import dagger.Module
import dagger.Provides

@Module
class ServerProvider {
    @Provides
    fun serverProvider(context:Context):Server= Server(context)
}