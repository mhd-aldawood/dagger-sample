package com.example.kotlin.helper

import android.content.Context
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Server @Inject constructor ():MasterServer() {
// @Inject lateinit var repository:RepoFactory // this need inject in constructor
//    @Inject lateinit var repo:Repository//this need module with provider for it

    fun getServer(): String{
        return "Server"
    }

}