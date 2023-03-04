package com.example.kotlin.helper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.App

 open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        App.appComponent.inject(this)
        super.onCreate(savedInstanceState)
    }
}