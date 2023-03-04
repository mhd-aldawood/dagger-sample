package com.example.kotlin.helper

import javax.inject.Inject

public open class MasterServer @Inject constructor() {
    fun returnMaster():String="Master"
}