package com.ngb.kotlindemo.main.second.homepage

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class HomePageAdapter(
    list: MutableList<Fragment>,
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle
) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    private var mLayoutList = list

    override fun createFragment(position: Int): Fragment {
        return mLayoutList[position]
    }

    override fun getItemCount(): Int {
        return mLayoutList.size
    }
}