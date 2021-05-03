package io.github.zmunm.insight.remote.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.zmunm.insight.remote.RetrofitInstance
import io.github.zmunm.insight.remote.ServiceConst
import io.github.zmunm.insight.remote.api.GameApi
import io.github.zmunm.insight.remote.impl.GameServiceImpl
import io.github.zmunm.insight.repository.service.GameService
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object NetworkModule {
    @Provides
    @Singleton
    fun provideGameService(
        @Named(ServiceConst.API_KEY)
        apiKey: String,
    ): GameService = GameServiceImpl(
        RetrofitInstance(apiKey).create(GameApi::class.java)
    )
}
