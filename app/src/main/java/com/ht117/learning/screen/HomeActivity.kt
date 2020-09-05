package com.ht117.learning.screen

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.FontResourcesParserCompat
import com.ht117.learning.DemoApp
import com.ht117.learning.R
import com.ht117.learning.service.DataResource
import com.ht117.learning.service.OtherResource
import com.ht117.learning.service.ProvideResource
import kotlinx.android.synthetic.main.activity_home.*
import javax.inject.Inject
import javax.inject.Named

class HomeActivity: AppCompatActivity() {

    @Inject
    lateinit var resource: DataResource

    @Inject
    lateinit var otherResource: OtherResource

    @Inject
    @Named("resource_a")
    lateinit var resourceA: ProvideResource

    @Inject
    @Named("resource_b")
    lateinit var resourceB: ProvideResource

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as DemoApp).component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnData.setOnClickListener {
            Toast.makeText(this, "Call data resource", Toast.LENGTH_SHORT).show()
            resource.doSomething()
        }

        btnOther.setOnClickListener {
            Toast.makeText(this, "Other resource called", Toast.LENGTH_SHORT).show()
            otherResource.callService()
        }

        btnResourceA.setOnClickListener {
            Toast.makeText(this, "Resource a calling", Toast.LENGTH_SHORT).show()
            resourceA.doSomething()
        }

        btnResourceB.setOnClickListener {
            Toast.makeText(this, "Resource b calling", Toast.LENGTH_SHORT).show()
            resourceB.doSomething()
        }
    }

}