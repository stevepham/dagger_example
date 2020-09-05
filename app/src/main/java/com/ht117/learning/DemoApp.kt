package com.ht117.learning

import android.app.Application
import com.ht117.learning.di.AppComponent
import com.ht117.learning.di.DaggerAppComponent

class DemoApp: Application() {

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent.create()
    }
}