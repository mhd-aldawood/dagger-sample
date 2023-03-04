package com.example.kotlin.di.module

import com.example.kotlin.helper.RepoFactory
import com.example.kotlin.helper.Repository
import dagger.Module
import dagger.Provides
//repo provider
@Module
class RepoProvider {
    @Provides
    fun repoProvider(): Repository = RepoFactory()
}