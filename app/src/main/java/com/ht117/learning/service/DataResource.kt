package com.ht117.learning.service

import android.util.Log
import javax.inject.Inject

/*
 * Declare @Inject in constructor for default
 * get instance of DataResource
 * If you remove @Inject here, you have to provide
 * it via @Module with @Provide
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

class ProvideResource(private val depend: String) {
    fun doSomething() {
        Log.d("Debug", "Do something from provide resource with $depend")
    }
}