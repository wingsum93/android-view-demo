package com.ericho.androidexampledemo.base

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import com.ericho.androidexampledemo.R
import com.ericho.androidexampledemo.model.NavigationBo
import com.ericho.androidexampledemo.ui.main.MainAdapter
import kotlinx.android.synthetic.main.activity_main.*

abstract class BaseSelectionActivity : BaseActivity(), MainAdapter.NavigationClickListener {

    private var mLayoutManager: LinearLayoutManager? = null
    private var mAdapter: MainAdapter? = null

    private lateinit var mList: MutableList<NavigationBo>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mLayoutManager = GridLayoutManager(this, 2)

        recyclerView.layoutManager = mLayoutManager
        mList = getList()
        mAdapter = createAdapter()
        mAdapter?.setOnClickListener(this)

        recyclerView.adapter = mAdapter

    }

    override fun onItemClick(item: NavigationBo) {
        val a = item.targetClass
        val i = Intent(this, a)
        startActivity(i)
    }

    abstract fun getList(): MutableList<NavigationBo>
    fun createAdapter(): MainAdapter = MainAdapter(this, mList)
}