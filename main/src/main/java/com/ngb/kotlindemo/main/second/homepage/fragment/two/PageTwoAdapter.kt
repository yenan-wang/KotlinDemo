package com.ngb.kotlindemo.main.second.homepage.fragment.two

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ngb.kotlindemo.main.R
import com.ngb.kotlindemo.main.second.homepage.fragment.two.holder.*

class PageTwoAdapter(list: MutableList<TemplateData>) : RecyclerView.Adapter<TemplateViewHolder>() {
    private val mTemplateList = list

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TemplateViewHolder {
        Log.d("ngb_log", "这里")
        //var viewHolder = getTemplateViewHolder(parent, viewType)
        /*var viewHolder = getTemplateViewHolder(parent, getTemplateTypeByInt(viewType))
        Log.d("ngb_log", "type:$viewHolder")
        return viewHolder*/
        when (viewType) {
            PageConstants.TEMPLATE_1_1 -> {
                return TemplateOneOneViewHolder(
                    DataBindingUtil.inflate(
                        LayoutInflater.from(parent.context),
                        R.layout.template_viewholder_one_one_layout,
                        parent,
                        false
                    )
                )
            }

            PageConstants.TEMPLATE_4_3 -> {
                return TemplateFourThreeViewHolder(
                    DataBindingUtil.inflate(
                        LayoutInflater.from(parent.context),
                        R.layout.template_viewholder_four_three_layout,
                        parent,
                        false
                    )
                )
            }
            PageConstants.TEMPLATE_16_9 -> {
                return TemplateSixteenNineViewHolder(
                    DataBindingUtil.inflate(
                        LayoutInflater.from(parent.context),
                        R.layout.template_viewholder_sixteen_nine_layout,
                        parent,
                        false
                    )
                )
            }
            PageConstants.TEMPLATE_3_4 -> {
                return TemplateThreeFourViewHolder(
                    DataBindingUtil.inflate(
                        LayoutInflater.from(parent.context),
                        R.layout.template_viewholder_three_four_layout,
                        parent,
                        false
                    )
                )
            }
            PageConstants.TEMPLATE_9_16 -> {
                return TemplateNineSixteenViewHolder(
                    DataBindingUtil.inflate(
                        LayoutInflater.from(parent.context),
                        R.layout.template_viewholder_nine_sixteen_layout,
                        parent,
                        false
                    )
                )
            }
            else -> {
                return TemplateOneOneViewHolder(
                    DataBindingUtil.inflate(
                        LayoutInflater.from(parent.context),
                        R.layout.template_viewholder_one_one_layout,
                        parent,
                        false
                    )
                )
            }
        }
    }

    override fun onBindViewHolder(holder: TemplateViewHolder, position: Int) {
        Log.d("ngb_log", "position:$position")
        /*when (holder) {
            is TemplateOneOneViewHolder -> {
                holder.bindData(mTemplateList[position], position)
            }
            is TemplateThreeFourViewHolder -> {
                holder.bindData(mTemplateList[position], position)
            }
            is TemplateNineSixteenViewHolder -> {
                holder.bindData(mTemplateList[position], position)
            }
            is TemplateFourThreeViewHolder -> {
                holder.bindData(mTemplateList[position], position)
            }
            is TemplateSixteenNineViewHolder -> {
                holder.bindData(mTemplateList[position], position)
            }
        }*/
        holder.bindData(mTemplateList[position], position)
    }

    override fun getItemCount(): Int {
        return mTemplateList.size
    }

    override fun getItemViewType(position: Int): Int {
        val tag = mTemplateList[position].mType
        //Log.d("ngb_log", "tag is $tag")
        return tag
    }

    fun addTemplateData(list: MutableList<TemplateData>, index: Int = mTemplateList.size) {
        if (list.isNotEmpty()) {
            mTemplateList.addAll(index, list)
            notifyItemRangeInserted(index, list.size)
        }
    }

    fun addTemplateData(data: TemplateData, index: Int = mTemplateList.size) {
        mTemplateList.add(index, data)
        notifyItemInserted(index)
    }
}