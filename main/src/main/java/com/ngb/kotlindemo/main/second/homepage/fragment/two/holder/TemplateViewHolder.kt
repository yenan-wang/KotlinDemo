package com.ngb.kotlindemo.main.second.homepage.fragment.two.holder

import android.view.View
import androidx.databinding.BindingAdapter
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.ngb.kotlindemo.common.utils.ImageLoadUtil
import com.ngb.kotlindemo.main.R
import com.ngb.kotlindemo.main.second.homepage.fragment.two.TemplateData

abstract class TemplateViewHolder(binding: ViewDataBinding) :
    RecyclerView.ViewHolder(binding.root) {

    abstract fun bindData(data: TemplateData, position: Int)

}