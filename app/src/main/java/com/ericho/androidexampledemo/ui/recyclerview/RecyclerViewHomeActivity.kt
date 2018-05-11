package com.ericho.androidexampledemo.ui.recyclerview

import android.support.v7.widget.RecyclerView
import com.ericho.androidexampledemo.base.BaseSelectionActivity
import com.ericho.androidexampledemo.extension.addOne
import com.ericho.androidexampledemo.model.NavigationBo

class RecyclerViewHomeActivity : BaseSelectionActivity() {


    override fun getList(): MutableList<NavigationBo> {
        val list = mutableListOf<NavigationBo>()
//        list addOne NavigationBo("Welcome",targetClass = WelcomeActivity::class.java)
        list addOne NavigationBo("ItemAnimator", targetClass = RecyclerView.ItemAnimator::class.java)
        return list
    }
}