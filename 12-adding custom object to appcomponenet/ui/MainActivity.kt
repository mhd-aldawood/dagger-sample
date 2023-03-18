package com.example.kotlin.ui

//import com.example.kotlin.di.DaggerActivityComponent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.R
import com.example.kotlin.appComp
import com.example.kotlin.helper.Server
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    @Inject
    lateinit var server: Server
    override fun onCreate(savedInstanceState: Bundle?) {
//        application.appComp.activityComponentFactory()
//            .create(this)
//            .inject(this)
        appComp.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, server.getServer())
    }
}