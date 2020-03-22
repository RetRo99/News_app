package com.retar.news_app.ui.article.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.retar.news_app.R
import com.retar.news_app.base.loadImage
import com.retar.news_app.ui.article.model.UiArticle
import kotlinx.android.synthetic.main.item_fragment_article.view.*

class ArticleAdapter(
    private val values: List<UiArticle>
) : RecyclerView.Adapter<ArticleAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_fragment_article, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(values[position])
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        fun bind(article: UiArticle) {
            view.apply {
                with(article) {
                    tvAbstract.text = abstract
                    tvSection.text = section
                    tvDate.text = date
                    ivArticle.loadImage(imageUrl)
                }

            }

        }
    }
}
