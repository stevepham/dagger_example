package com.ht117.learning.screen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ht117.learning.DemoApp
import com.ht117.learning.R
import com.ht117.learning.service.DataResource
import com.ht117.learning.service.OtherResource
import javax.inject.Inject

class HomeActivity: AppCompatActivity() {

    @Inject
    lateinit var resource: DataResource

    @Inject
    lateinit var otherResource: OtherResource

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as DemoApp).component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        resource.doSomething()
        otherResource.callService()
    }

}