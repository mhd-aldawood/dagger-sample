package com.example.kotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotlin.App
import com.example.kotlin.R
import com.example.kotlin.helper.A2Server
import com.example.kotlin.helper.B2Server
import com.example.kotlin.helper.NewServer
import com.example.kotlin.helper.Server
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    @Inject
    lateinit var server: Server

    @Inject
    @A2Server
    lateinit var clientA: NewServer

    @Inject
    @B2Server
    lateinit var clientB: NewServer
    override fun onCreate(savedInstanceState: Bundle?) {
        App.appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, server.getServer())
        Log.i(TAG, clientA.printClient())
        Log.i(TAG, clientB.printClient())


    }
}