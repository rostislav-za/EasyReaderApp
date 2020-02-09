package com.example.easyreader3.presentation.fragments.library

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.easyreader3.R
import com.example.easyreader3.bases.BaseAdapter
import com.example.easyreader3.bases.BaseViewHolder
import kotlinx.android.synthetic.main.item_text.view.*


class BooksAdapter() : BaseAdapter<Book>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_text, parent, false)
        )



    class ViewHolder(itemView: View): BaseViewHolder<Book>(itemView) {
        override fun bind(model: Book) {
            itemView.it_title.text=model.title()
            itemView.it_text.text=model.text()
            itemView.it_info.text=model.text2()
        }
    }

}