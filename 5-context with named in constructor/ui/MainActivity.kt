package com.example.kotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotlin.App
import com.example.kotlin.R
import com.example.kotlin.helper.Server
import com.example.kotlin.helper.Test
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
@Inject
lateinit var server:Server
@Inject
lateinit var test: Test
    override fun onCreate(savedInstanceState: Bundle?) {
        App.appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, server.getServer())
        Log.i(TAG, test.getTest())
//        Log.i(TAG, server.returnMaster())

    }
}