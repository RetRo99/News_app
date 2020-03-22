package com.retar.news_app.ui

import com.retar.news_app.ui.article.ArticleFragment
import com.retar.news_app.ui.article.ArticleViewModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal interface UiModule {

    @ContributesAndroidInjector(modules = [ArticleViewModule::class])
     fun contributeUsersFragmentFragmentInjector(): ArticleFragment

}
