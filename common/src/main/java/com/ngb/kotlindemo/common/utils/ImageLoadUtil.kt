package com.ngb.kotlindemo.common.utils

import android.content.Context
import android.graphics.drawable.Drawable
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.DrawableImageViewTarget
import com.bumptech.glide.request.target.Target
import com.bumptech.glide.request.transition.Transition
import java.lang.Exception
import java.net.URL

object ImageLoadUtil {

    fun startLoad(context: Context, url: String, imageView: ImageView) {
        Glide.with(context).load(url).into(imageView)
    }

    fun startLoad(context: Context, url: String, listener: DownloadListener, imageView: ImageView) {
        Glide.with(context).load(url).into(object : DrawableImageViewTarget(imageView) {
            override fun onResourceReady(resource: Drawable, transition: Transition<in Drawable>?) {
                super.onResourceReady(resource, transition)
                listener.loadSuccess(resource)
            }
        })
    }
}

interface DownloadListener {
    fun loadSuccess(drawable: Drawable)
}