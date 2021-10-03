package com.ngb.kotlindemo.main.second.homepage.fragment.one

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ngb.kotlindemo.main.R
import com.ngb.kotlindemo.main.second.homepage.fragment.HomePageFragment

class HomePageOneFragment(type: Int) : HomePageFragment(type) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return View.inflate(context, R.layout.home_page_one_layout, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}