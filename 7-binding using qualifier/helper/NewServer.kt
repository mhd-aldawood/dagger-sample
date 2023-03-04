package com.example.kotlin.helper

import javax.inject.Inject

open class NewServer @Inject constructor() {
    open fun printClient():String=""
}