package com.ht117.learning.di

import com.ht117.learning.screen.HomeActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, ResourceModule::class])
interface AppComponent {

    fun inject(activity: HomeActivity)
}