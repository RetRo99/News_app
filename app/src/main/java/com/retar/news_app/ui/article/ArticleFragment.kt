package com.retar.news_app.ui.article

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.retar.news_app.R
import com.retar.news_app.ui.article.model.UiArticle
import kotlinx.android.synthetic.main.fragment_article.*

/**
 * A fragment representing a list of Items.
 */
class ArticleFragment : Fragment() {

    private var articleTopic: String? = null
    private var articleType: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            articleTopic = it.getString(ARG_TYPE_ARTICLE_TOPIC)
            articleType = it.getString(ARG_TYPE_ARTICLE_TYPE)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_article, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val data = listOf(
            UiArticle("https://www.android.com/static/2016/img/share/andy-lg.png","Europe > Portugal", "This is absctact shoudl be longer it the future but this is just a test", "19/03/1996"),
            UiArticle("https://www.android.com/static/2016/img/share/andy-lg.png","Europe > Portugal", "This is absctact shoudl be longer it the future but this is just a test", "19/03/1996"),
            UiArticle("https://www.android.com/static/2016/img/share/andy-lg.png","Europe > Portugal", "This is absctact shoudl be longer it the future but this is just a test", "19/03/1996"),
            UiArticle("https://www.android.com/static/2016/img/share/andy-lg.png","Europe > Portugal", "This is absctact shoudl be longer it the future but this is just a test", "19/03/1996"),
            UiArticle("https://www.android.com/static/2016/img/share/andy-lg.png","Europe > Portugal", "This is absctact shoudl be longer it the future but this is just a test", "19/03/1996"))
        recycleView.adapter = ArticleAdapter(data)
    }

    companion object {

        const val ARG_TYPE_ARTICLE_TOPIC = "article_topic"
        const val ARG_TYPE_ARTICLE_TYPE = "article_type"

        @JvmStatic
        fun newInstance(articleTopic: String, articleType: String) =
            ArticleFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_TYPE_ARTICLE_TOPIC, articleTopic)
                    putString(ARG_TYPE_ARTICLE_TYPE, articleType)
                }
            }

        fun newInstance() = ArticleFragment()
    }
}
