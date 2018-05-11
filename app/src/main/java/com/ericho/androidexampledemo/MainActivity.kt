package com.ericho.androidexampledemo

import android.app.Activity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.ericho.androidexampledemo.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity:BaseActivity() {

    private var mLayoutManager:LinearLayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mLayoutManager = LinearLayoutManager(this)

        recyclerView.layoutManager = mLayoutManager
    }
}