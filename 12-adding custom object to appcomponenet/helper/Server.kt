package com.example.kotlin.helper

import android.app.Activity
import android.app.Application
import android.content.Context
import android.util.Log
import com.example.kotlin.ui.MainActivity
import java.lang.Appendable
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
 class Server @Inject constructor (){

    init {
        Log.i("MainActivity","" )
    }
    fun getServer(): String{
        return "Server"
    }

}