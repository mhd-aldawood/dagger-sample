package com.example.kotlin.di.module

import com.example.kotlin.helper.*
import dagger.Binds
import dagger.Module

const val CLIENTA="clienta"
const val CLIENTB="clientb"

@Module
interface ClientModule {
    @Binds
    @A2Server
    fun clientAProvider(clientA:ClientA): NewServer

    @Binds
    @B2Server
    fun clientBProvider(clientB: ClientB): NewServer
}