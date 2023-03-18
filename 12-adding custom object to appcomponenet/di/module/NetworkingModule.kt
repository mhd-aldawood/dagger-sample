package com.example.kotlin.di.module

import android.app.Application
import com.example.kotlin.config.NetworkingConfiguration
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
object NetworkingModule {
    @Provides
    @Singleton
    fun provideCache(
        networkingConfiguration: NetworkingConfiguration, // 1
        application: Application
    ): Cache =
        Cache(
            application.cacheDir,
            networkingConfiguration.cacheSize // 1
        )

    @Provides
    @Singleton
    fun provideHttpClient(cache: Cache): OkHttpClient =
        OkHttpClient.Builder()
            .cache(cache)
            .build()


    @Provides
    @Singleton
    fun provideRetrofit(
        networkingConfiguration: NetworkingConfiguration, // 2
        httpClient: OkHttpClient
    ): Retrofit =
        Retrofit.Builder()
            .baseUrl(networkingConfiguration.serverBaseUrl) // 2
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(
                GsonConverterFactory.create(
                    GsonBuilder()
                        .setDateFormat(networkingConfiguration.dateFormat)
                        .create()
                )
            )
            .client(httpClient)
            .build()
}