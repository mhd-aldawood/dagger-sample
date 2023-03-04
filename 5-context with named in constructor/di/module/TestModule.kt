package com.example.kotlin.di.module

import com.example.kotlin.helper.Test
import dagger.Module
import dagger.Provides
import javax.inject.Named
const val START_VALUE = "StartValue" // 1

@Module
class TestModule {
//    @Provides
//    @Named(START_VALUE)
//    fun testProvider():Int=0

    @Provides
//    @Named(START_VALUE)
    fun testProvider():Test= Test(0)

}