package com.example.kotlin.config

const val BUSSO_SERVER_BASE_URL = "https://busso-server.herokuapp.com/api/v1/"
object BussoConfiguration : NetworkingConfiguration { // 1
    override val cacheSize: Long
        get() = 100 * 1024L // 100K // 2
    override val serverBaseUrl: String
        get() = BUSSO_SERVER_BASE_URL // 3
    override val dateFormat: String
        get() = "yyyy-MM-dd'T'HH:mm:ssZ" // 4
}