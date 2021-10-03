package com.ngb.kotlindemo.main.second.homepage.fragment.two.holder

import android.util.Log
import android.view.View
import androidx.databinding.BindingAdapter
import com.ngb.kotlindemo.common.utils.ImageLoadUtil
import com.ngb.kotlindemo.main.BR
import com.ngb.kotlindemo.main.R
import com.ngb.kotlindemo.main.databinding.TemplateViewholderFourThreeLayoutBinding
import com.ngb.kotlindemo.main.second.homepage.fragment.two.TemplateData

class TemplateFourThreeViewHolder(binding: TemplateViewholderFourThreeLayoutBinding) : TemplateViewHolder(binding) {

    private var mBinding = binding

    override fun bindData(data: TemplateData, position: Int) {
        Log.d("ngb_log", "TemplateFourThreeViewHolder:$position")
        mBinding.setVariable(BR.fourThreeData, data)
        setCoverImageUrl(mBinding.root, data.mCoverUrl)
        setHeaderImage(mBinding.root, data.mUserPortraitUrl)
        mBinding.executePendingBindings()
    }

    companion object{
        @BindingAdapter(value = ["imageUrl"])
        @JvmStatic
        fun setCoverImageUrl(view: View, url: String) {
            ImageLoadUtil.startLoad(view.context, url, view.findViewById(R.id.image_view))
        }

        @BindingAdapter(value = ["headImage"])
        @JvmStatic
        fun setHeaderImage(view: View, url: String){
            ImageLoadUtil.startLoad(view.context, url, view.findViewById(R.id.user_header))
        }
    }
}