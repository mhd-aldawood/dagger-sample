package com.example.kotlin.helper

import android.content.Context
import javax.inject.Inject

class ClientA @Inject constructor() : NewServer(){
    override fun printClient():String="this is A"
}