package com.example.kotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotlin.App
import com.example.kotlin.R
import com.example.kotlin.di.module.CLIENTA
import com.example.kotlin.di.module.CLIENTB
import com.example.kotlin.helper.NewServer
import com.example.kotlin.helper.Server
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
@Inject
lateinit var server:Server
@Inject
@Named(CLIENTA)
lateinit var clienta:NewServer
@Inject
@Named(CLIENTB)
lateinit var clientb:NewServer
    override fun onCreate(savedInstanceState: Bundle?) {
        App.appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, server.getServer())
        Log.i(TAG, clienta.printClient())
        Log.i(TAG, clientb.printClient())



    }
}