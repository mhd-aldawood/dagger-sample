package com.example.kotlin.di.module

import com.example.kotlin.helper.ClientA
import com.example.kotlin.helper.ClientB
import com.example.kotlin.helper.NewServer
import com.example.kotlin.helper.Server
import dagger.Binds
import dagger.Module
import javax.inject.Named
const val CLIENTA="clienta"
const val CLIENTB="clientb"

@Module
interface ClientModule {
    @Binds
    @Named(CLIENTA)
    fun clientAProvider(clientA:ClientA): NewServer
    @Binds
    @Named(CLIENTB)
    fun clientBProvider(clientB: ClientB): NewServer
}