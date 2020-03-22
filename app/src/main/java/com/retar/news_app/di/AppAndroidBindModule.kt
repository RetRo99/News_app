package com.retar.news_app.di

import android.content.Context
import dagger.Binds
import dagger.Module

@Module
interface AppAndroidBindModule {

    @Binds
    fun bindContext(app: BaseApplication): Context

}
