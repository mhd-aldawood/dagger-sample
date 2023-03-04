package com.example.kotlin.helper

import javax.inject.Inject

class Server @Inject constructor () {
// @Inject lateinit var repository:RepoFactory // this need inject in constructor
//    @Inject lateinit var repo:Repository//this need module with provider for it
    @Inject
    lateinit var test:Test
    @Inject
    lateinit var test1:Test1
    fun getServer(): String{
        return "Server"
    }

}