package com.retar.news_app.ui.mainactivity

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.viewpager.widget.ViewPager
import com.retar.news_app.R
import com.retar.news_app.ui.mainactivity.adapter.TabAdapter
import dagger.android.*
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : FragmentActivity(), MainView, HasAndroidInjector {
    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar.title = getString(R.string.app_title)

        storiesTabs.setupWithViewPager(viewPager)
        viewPager.adapter = TabAdapter(supportFragmentManager, this)

    }

    override fun androidInjector(): AndroidInjector<Any?>? {
        return androidInjector
    }
}


