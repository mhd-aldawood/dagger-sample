package com.example.kotlin.di.module

import android.content.Context
import com.example.kotlin.helper.MasterServer
import com.example.kotlin.helper.Server
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class ServerProvider {
//    @Provides
//     fun serverProvider(test: Test):Server=Server(test)


    @Module
    interface Bindings{
        @Binds
        fun bindServerToMaster(server:Server):MasterServer
    }


//  @Binds
//  abstract fun serverProvider(server:Server):MasterServer
}