package com.example.kotlin.helper

import javax.inject.Inject

class ClientA @Inject constructor():NewServer() {
    override fun printClient(): String {
        return "This is A"
    }
}