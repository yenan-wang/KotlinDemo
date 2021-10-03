package com.ngb.kotlindemo.main.second.homepage.fragment.two

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.ngb.kotlindemo.main.R
import com.ngb.kotlindemo.main.databinding.*
import com.ngb.kotlindemo.main.second.homepage.fragment.two.holder.*

sealed class TemplateType {
    object ONE_ONE : TemplateType()
    object FOUR_THREE : TemplateType()
    object SIXTEEN_NINE : TemplateType()
    object THREE_FOUR : TemplateType()
    object NINE_SIXTEEN : TemplateType()
}

/*fun getTemplateViewHolder(parent: ViewGroup, viewType: Int): TemplateViewHolder {
    return TemplateViewHolder(getTemplateViewHolderByInt(parent, getTemplateTypeByInt(viewType)))
}*/

fun getTemplateViewHolderByInt(parent: ViewGroup, type: TemplateType): ViewDataBinding =
    when (type) {
        TemplateType.ONE_ONE -> {
            DataBindingUtil.inflate<TemplateViewholderOneOneLayoutBinding>(
                LayoutInflater.from(parent.context),
                R.layout.template_viewholder_one_one_layout,
                parent,
                false
            )
        }

        TemplateType.FOUR_THREE ->
            DataBindingUtil.inflate<TemplateViewholderFourThreeLayoutBinding>(
                LayoutInflater.from(parent.context),
                R.layout.template_viewholder_four_three_layout,
                parent,
                false
            )

        TemplateType.SIXTEEN_NINE ->
            DataBindingUtil.inflate<TemplateViewholderSixteenNineLayoutBinding>(
                LayoutInflater.from(parent.context),
                R.layout.template_viewholder_sixteen_nine_layout,
                parent,
                false
            )

        TemplateType.THREE_FOUR ->
            DataBindingUtil.inflate<TemplateViewholderThreeFourLayoutBinding>(
                LayoutInflater.from(parent.context),
                R.layout.template_viewholder_three_four_layout,
                parent,
                false
            )

        TemplateType.NINE_SIXTEEN ->
            DataBindingUtil.inflate<TemplateViewholderNineSixteenLayoutBinding>(
                LayoutInflater.from(parent.context),
                R.layout.template_viewholder_nine_sixteen_layout,
                parent,
                false
            )
    }

fun getTemplateViewHolder(parent: ViewGroup, type: TemplateType) =
    when (type) {
        TemplateType.ONE_ONE -> {
            TemplateOneOneViewHolder(
                DataBindingUtil.inflate<TemplateViewholderOneOneLayoutBinding>(
                    LayoutInflater.from(parent.context),
                    R.layout.template_viewholder_one_one_layout,
                    parent,
                    false
                )
            )
        }

        TemplateType.FOUR_THREE -> {
            TemplateFourThreeViewHolder(
                DataBindingUtil.inflate<TemplateViewholderFourThreeLayoutBinding>(
                    LayoutInflater.from(parent.context),
                    R.layout.template_viewholder_four_three_layout,
                    parent,
                    false
                )
            )
        }


        TemplateType.SIXTEEN_NINE -> {
            TemplateSixteenNineViewHolder(
                DataBindingUtil.inflate<TemplateViewholderSixteenNineLayoutBinding>(
                    LayoutInflater.from(parent.context),
                    R.layout.template_viewholder_sixteen_nine_layout,
                    parent,
                    false
                )
            )
        }

        TemplateType.THREE_FOUR -> TemplateThreeFourViewHolder(
            DataBindingUtil.inflate<TemplateViewholderThreeFourLayoutBinding>(
                LayoutInflater.from(parent.context),
                R.layout.template_viewholder_three_four_layout,
                parent,
                false
            )
        )


        TemplateType.NINE_SIXTEEN -> TemplateNineSixteenViewHolder(
            DataBindingUtil.inflate<TemplateViewholderNineSixteenLayoutBinding>(
                LayoutInflater.from(parent.context),
                R.layout.template_viewholder_nine_sixteen_layout,
                parent,
                false
            )
        )
    }

fun getTemplateTypeByInt(type: Int): TemplateType {
    return when (type) {
        PageConstants.TEMPLATE_1_1 -> {
            TemplateType.ONE_ONE
        }
        PageConstants.TEMPLATE_3_4 -> {
            TemplateType.THREE_FOUR
        }
        PageConstants.TEMPLATE_4_3 -> {
            TemplateType.FOUR_THREE
        }
        PageConstants.TEMPLATE_16_9 -> {
            TemplateType.SIXTEEN_NINE
        }
        PageConstants.TEMPLATE_9_16 -> {
            TemplateType.NINE_SIXTEEN
        }
        else -> {
            TemplateType.SIXTEEN_NINE
        }
    }
}
