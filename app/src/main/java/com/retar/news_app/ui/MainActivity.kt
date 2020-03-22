package com.retar.news_app.ui

import android.os.Bundle
import com.retar.news_app.R
import dagger.android.DaggerActivity
import dagger.android.DaggerApplication

class MainActivity : DaggerActivity(), MainView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
