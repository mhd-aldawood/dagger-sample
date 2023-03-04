package com.example.kotlin.helper

import android.content.Context
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Server @Inject constructor (context:Context){

    fun getServer(): String{
        return "Server"
    }

}