package com.example.kotlin.helper

import android.app.Activity
import android.content.Context
import com.example.kotlin.ui.MainActivity
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
 class Server @Inject constructor (activity: Activity){

    fun getServer(): String{
        return "Server"
    }

}