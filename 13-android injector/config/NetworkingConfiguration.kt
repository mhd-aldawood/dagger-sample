package com.example.kotlin.config

interface NetworkingConfiguration {
    val cacheSize: Long // 1
    val serverBaseUrl: String // 2
    val dateFormat: String // 3
}