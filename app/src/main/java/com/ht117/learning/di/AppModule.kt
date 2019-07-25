package com.ht117.learning.di

import android.app.Application
import android.content.Context
import com.ht117.learning.service.DataResource
import com.ht117.learning.service.OtherResource
import dagger.Module
import dagger.Provides

@Module
class AppModule(private val app: Application) {

    @Provides
    fun provideApp(): Application =
        app

    @Provides
    fun provideContext(): Context =
        app

    @Provides
    fun provideDataResource(): DataResource =
        DataResource()

    @Provides
    fun provideOtherResource(): OtherResource =
        OtherResource()
}