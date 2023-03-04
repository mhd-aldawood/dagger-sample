package com.example.kotlin.ui

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotlin.App
import com.example.kotlin.R
import com.example.kotlin.di.AppComponent
import com.example.kotlin.di.DaggerActivityComponent
import com.example.kotlin.helper.NewServer
import com.example.kotlin.helper.Server
import dagger.android.DaggerActivity
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    @Inject
    lateinit var server: Server
    override fun onCreate(savedInstanceState: Bundle?) {
//        App.appComponent.inject(this)

        DaggerActivityComponent.factory()
            .create(this,App.appComponent)
            .inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, server.getServer())
    }
}