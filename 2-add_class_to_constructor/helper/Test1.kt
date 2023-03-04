package com.example.kotlin.helper

import android.util.Log
import javax.inject.Inject

class Test1 {

    init {
        val TAG = "Test1"
        Log.i(TAG, "Test1 @Inject"+this.toString())
    }

}