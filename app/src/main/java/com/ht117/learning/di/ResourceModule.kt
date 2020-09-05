package com.ht117.learning.di

import com.ht117.learning.service.ProvideResource
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
object ResourceModule {

    @Provides
    @Named("resource_a")
    fun provideResource() = ProvideResource("A")

    @Provides
    @Named("resource_b")
    fun provideResourceB() = ProvideResource("B")
}