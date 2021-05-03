package io.github.zmunm.insight.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.zmunm.insight.BuildConfig
import io.github.zmunm.insight.remote.ServiceConst
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object SingletonModule {

    @Provides
    @Singleton
    @Named(ServiceConst.API_KEY)
    fun provideApiKey(): String = BuildConfig.RAWG_KEY
}
