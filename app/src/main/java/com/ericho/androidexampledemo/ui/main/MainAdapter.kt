package com.ericho.androidexampledemo.ui.main

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.ericho.androidexampledemo.R
import com.ericho.androidexampledemo.base.BaseRecyclerViewAdapter
import com.ericho.androidexampledemo.model.NavigationBo

class MainAdapter(var c: Context, list:MutableList<NavigationBo>) :BaseRecyclerViewAdapter<NavigationBo,MainAdapter.ViewHolder>(list) {

    private var mClickListener:NavigationClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(c).inflate(R.layout.grid_main,parent,false)
        val holder = ViewHolder(view)
        return holder
    }



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = mItem.get(position)
        holder.title.text = item.name
        holder.description.text = item.description
        holder.total.setOnClickListener {
            mClickListener?.onItemClick(item)
        }
    }


    fun setOnClickListener(listener:NavigationClickListener){
        mClickListener = listener
    }
    interface NavigationClickListener{
        fun onItemClick(item:NavigationBo)
    }

    class ViewHolder(v:View): RecyclerView.ViewHolder(v){

        val title:TextView = v.findViewById(R.id.title)
        val description:TextView = v.findViewById(R.id.description)
        val total:ViewGroup = v.findViewById(R.id.layer)

    }
}