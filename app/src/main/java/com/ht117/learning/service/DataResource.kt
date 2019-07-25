package com.ht117.learning.service

import android.util.Log
import javax.inject.Inject

/*
 * This resource for dependency module
 */
class DataResource @Inject constructor() {

    fun doSomething() {
        Log.d("Debug", "Do somethings")
    }
}

class OtherResource @Inject constructor() {

    fun callService() {
        Log.d("Debug", "Calling service")
    }
}