package com.ericho.androidexampledemo

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.ericho.androidexampledemo.R.id.recyclerView
import com.ericho.androidexampledemo.base.BaseActivity
import com.ericho.androidexampledemo.model.NavigationBo
import com.ericho.androidexampledemo.ui.main.MainAdapter
import com.ericho.androidexampledemo.ui.recyclerview.RecyclerViewHomeActivity
import com.ericho.androidexampledemo.ui.welcome.WelcomeActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity:BaseActivity() ,MainAdapter.NavigationClickListener{

    private var mLayoutManager:LinearLayoutManager? = null
    private var mAdapter:MainAdapter? = null

    private lateinit var mList:MutableList<NavigationBo>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mLayoutManager = GridLayoutManager(this,2)

        recyclerView.layoutManager = mLayoutManager

        mList = getList()
        mAdapter = MainAdapter(this,mList)
        mAdapter?.setOnClickListener(this)

        recyclerView.adapter = mAdapter

    }

    override fun onItemClick(item: NavigationBo) {
        val a = item.targetClass
        val i = Intent(this,a)
        startActivity(i)
    }

    private fun getList(): MutableList<NavigationBo> {
        val n = NavigationBo("Welcome",targetClass = WelcomeActivity::class.java)
        val b = NavigationBo("RecyclerView",targetClass = RecyclerViewHomeActivity::class.java)
        return arrayListOf(n,b)
    }
}