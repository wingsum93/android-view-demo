package com.ericho.androidexampledemo.ui.welcome

import android.os.Bundle
import com.ericho.androidexampledemo.R
import com.ericho.androidexampledemo.base.BaseActivity

class WelcomeActivity :BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
    }
}