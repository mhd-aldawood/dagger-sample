package com.example.kotlin.helper

import javax.inject.Inject

class Server @Inject constructor (){
 @Inject lateinit var repository:RepoFactory
    @Inject lateinit var repo:Repository
    fun getServer(): String{
        return "Server"
    }

}