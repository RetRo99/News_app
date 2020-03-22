package com.retar.news_app.di

import dagger.Module

@Module(includes = [dagger.android.support.AndroidSupportInjectionModule::class, UiInjectorModule::class, AppAndroidBindModule::class, MainModule::class])
class AppModule
