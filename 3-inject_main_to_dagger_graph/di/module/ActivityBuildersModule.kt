package com.example.kotlin.di.module

import com.example.kotlin.ui.MainActivity
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

//    @ContributesAndroidInjector(modules = [ViewModelModule::class])
@ContributesAndroidInjector
internal abstract fun contributeMyActivity(): MainActivity
}