package com.ngb.kotlindemo.main.second.homepage.fragment.two

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.google.android.material.tabs.TabLayout
import com.ngb.kotlindemo.main.R
import com.ngb.kotlindemo.main.second.homepage.fragment.HomePageFragment

class HomePageTwoFragment(type: Int) : HomePageFragment(type) {
    private var mRecyclerView: RecyclerView? = null
    private var mViewModel: PageTwoViewModel? = null
    private var mAdapter = PageTwoAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return View.inflate(context, R.layout.home_page_two_layout, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //mViewModel = ViewModelProviders.of(this).get(PageTwoViewModel::class.java)
        mViewModel = ViewModelProvider(this)[PageTwoViewModel::class.java]
        mViewModel?.mTemplateListLiveData?.observe(viewLifecycleOwner, {
            mAdapter.addTemplateData(it)
        })
        mViewModel?.getData()


        view.apply {
            mRecyclerView = findViewById(R.id.recycler_view)
            mRecyclerView?.apply {
                adapter = mAdapter
                layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            }
            findViewById<Button>(R.id.add_button).setOnClickListener { mViewModel?.getData() }
            findViewById<Button>(R.id.decs_button).setOnClickListener { mAdapter.removeDataAll() }
        }
    }
}