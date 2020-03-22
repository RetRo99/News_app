package com.retar.news_app.ui.mainactivity

import android.app.Activity
import com.retar.news_app.ui.UiModule
import dagger.Binds
import dagger.Module

@Module(includes = [UiModule::class])
internal interface MainActivityModule {

    @Binds
    fun bindActivity(activity: MainActivity): Activity

    @Binds
    fun bindView(activity: MainActivity): MainView

    @Binds
    fun bindPresenter(presenterImpl: MainViewPresenterImpl): MainViewPresenter

}
