package com.example.kotlin.helper

import javax.inject.Inject

class ClientB @Inject constructor():NewServer() {
    override fun printClient(): String {
        return "This is B"
    }
}