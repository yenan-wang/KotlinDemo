package com.ngb.kotlindemo.main.second.homepage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.ngb.kotlindemo.main.R
import com.ngb.kotlindemo.main.second.homepage.fragment.one.HomePageOneFragment
import com.ngb.kotlindemo.main.second.homepage.fragment.three.HomePageThreeFragment
import com.ngb.kotlindemo.main.second.homepage.fragment.two.HomePageTwoFragment

class HomePageActivity : AppCompatActivity() {
    private var mAppBarLayout: AppBarLayout? = null
    private var mCoordinatorLayout: CoordinatorLayout? = null
    private var mTabLayout: TabLayout? = null
    private var mViewPager: ViewPager2? = null
    private var mTitle = arrayOf("我的快递", "模板", "专题")
    private var mFragmentList = mutableListOf<Fragment>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        initData()
        initView()
    }

    private fun initData() {
        mFragmentList.add(HomePageOneFragment(HomePageConstants.LayoutType.TYPE_LAYOUT_ONE))
        mFragmentList.add(HomePageTwoFragment(HomePageConstants.LayoutType.TYPE_LAYOUT_TWO))
        mFragmentList.add(HomePageThreeFragment(HomePageConstants.LayoutType.TYPE_LAYOUT_THREE))
    }

    private fun initView() {
        mTabLayout = findViewById(R.id.tab_layout)
        mViewPager = findViewById(R.id.view_pager_2)
        mTabLayout?.let {
            mViewPager?.apply {
                adapter = HomePageAdapter(mFragmentList, supportFragmentManager, lifecycle)
                TabLayoutMediator(
                    it, this
                ) { tab, position ->
                    tab.text = mTitle[position]
                }.attach()
            }
        }

    }
}