package com.example.kotlin.helper

import android.util.Log
import javax.inject.Inject

class Test @Inject constructor(test1 :Test1){

init {
    val TAG = "Test"
    Log.i(TAG, "Test @Inject"+test1.toString()+this.toString())
}

}