package com.example.kotlin.helper

import com.example.kotlin.di.module.START_VALUE
import javax.inject.Inject
import javax.inject.Named

class Test @Inject constructor(/*@Named(START_VALUE)*/ private var start:Int)  {
    fun getTest():String="Test"
}