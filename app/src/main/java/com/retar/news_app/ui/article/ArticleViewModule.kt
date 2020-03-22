package com.retar.news_app.ui.article

import dagger.Binds
import dagger.Module

@Module
interface ArticleViewModule {

    @Binds
    fun bindView(fragment: ArticleFragment): ArticleView

    @Binds
    fun bindPresenter(presenterImpl: ArticleViewPresenterImpl): ArticleViewPresenter


}
