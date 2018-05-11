package com.ericho.androidexampledemo

import com.ericho.androidexampledemo.base.BaseSelectionActivity
import com.ericho.androidexampledemo.extension.addOne
import com.ericho.androidexampledemo.model.NavigationBo
import com.ericho.androidexampledemo.ui.preference.MyPreferenceActivity
import com.ericho.androidexampledemo.ui.recyclerview.RecyclerViewHomeActivity
import com.ericho.androidexampledemo.ui.welcome.WelcomeActivity

class MainActivity : BaseSelectionActivity() {

    override fun getList(): MutableList<NavigationBo> {
        val list = mutableListOf<NavigationBo>()
        list addOne NavigationBo("Welcome", targetClass = WelcomeActivity::class.java)
        list addOne NavigationBo("RecyclerView", targetClass = RecyclerViewHomeActivity::class.java)
        list addOne NavigationBo("MyPreferenceActivity", targetClass = MyPreferenceActivity::class.java)
        return list
    }


}