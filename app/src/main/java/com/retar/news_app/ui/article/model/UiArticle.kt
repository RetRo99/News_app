package com.retar.news_app.ui.article.model

data class UiArticle(
    val imageUrl: String?,
    val section: String,
    val abstract: String,
    val date: String,
    val articleId:String? = null
)

