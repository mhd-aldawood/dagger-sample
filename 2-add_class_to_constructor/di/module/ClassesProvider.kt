package com.example.kotlin.di.module

import android.util.Log
import com.example.kotlin.helper.Test
import com.example.kotlin.helper.Test1
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module

class ClassesProvider {
    @Provides

    fun provideTest(): Test1 {
        var t=Test1()
        Log.i("Test", "ClassesProvider"+t.toString())
        return t
    }
}