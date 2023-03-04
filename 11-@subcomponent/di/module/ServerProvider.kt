package com.example.kotlin.di.module

import android.content.Context
import android.util.Log
import com.example.kotlin.helper.NewServer
import com.example.kotlin.helper.Server
import dagger.Module
import dagger.Provides

@Module
class ServerProvider {
    val TAG = "ServerProvider"
//    @Provides
//    fun serverProvider(a:Int,b:String,context:Context):Server {
//        Log.i(TAG, "serverProvider: $a$b")
//        return Server(context)
//    }


//    @Provides
//    fun newServerProvider(): NewServer = NewServer()


    @Provides
    fun intProvider(): Int = 0

    @Provides
    fun stringProvider(): String = "String"

}