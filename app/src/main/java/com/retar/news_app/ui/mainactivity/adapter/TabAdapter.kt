package com.retar.news_app.ui.mainactivity.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.retar.news_app.R
import com.retar.news_app.ui.article.ArticleFragment


class TabAdapter(fm: FragmentManager, val context: Context) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val tabTitles = arrayOf(
        R.string.stories_top,
        R.string.stories_popular,
        R.string.stories_business
    )

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                ArticleFragment.newInstance()
            }
            1 -> ArticleFragment.newInstance()
            else -> {
                return ArticleFragment.newInstance()
            }
        }
    }

    override fun getCount(): Int {
        return tabTitles.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(tabTitles[position])
    }
}
