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
 class Server @Inject constructor (application: Application){

    init {
        Log.i("MainActivity", application.applicationContext.toString())
    }
    fun getServer(): String{
        return "Server"
    }

}