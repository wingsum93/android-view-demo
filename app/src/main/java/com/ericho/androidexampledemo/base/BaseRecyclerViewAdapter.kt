package com.ericho.androidexampledemo.base

import android.content.Context
import android.support.v7.widget.RecyclerView

abstract class  BaseRecyclerViewAdapter<T,Holder:RecyclerView.ViewHolder>(var mItem:MutableList<T>) :RecyclerView.Adapter<Holder>() {

    override fun getItemCount(): Int {
        return mItem.size
    }
}