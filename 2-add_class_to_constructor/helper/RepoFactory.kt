package com.example.kotlin.helper

import android.util.Log
import javax.inject.Inject

class RepoFactory @Inject constructor() :Repository {

companion object{
    private val TAG = "RepoFactory"
    init {
        Log.i(TAG, "this is Repo factory ")
    }
}
}