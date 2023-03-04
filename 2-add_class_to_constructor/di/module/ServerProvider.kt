package com.example.kotlin.di.module

import com.example.kotlin.helper.MasterServer
import com.example.kotlin.helper.Server
import com.example.kotlin.helper.Test
import dagger.Module
import dagger.Provides

@Module
class ServerProvider {
//    @Provides
//     fun serverrProvider(test: Test):Server=Server(test)

//    @Provides
//    fun serverProvider(test: Test): MasterServer = Server(test)

    @Module
    interface Bindings{
        fun bindSequenceTest(server:Server):MasterServer
    }
}