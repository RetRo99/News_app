package com.retar.news_app.di

import com.retar.news_app.ui.mainactivity.MainActivity
import com.retar.news_app.ui.mainactivity.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal interface UiInjectorModule {

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    fun contributeMainActivity(): MainActivity

}
