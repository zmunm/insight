package io.github.zmunm.insight.remote.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.zmunm.insight.Const
import io.github.zmunm.insight.remote.api.GameApi
import io.github.zmunm.insight.remote.impl.GameServiceImpl
import io.github.zmunm.insight.repository.service.GameService
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object NetworkModule {
    private const val BASE_URL = "https://api.rawg.io/api/"
    @Provides
    @Singleton
    fun provideGameService(
        @Named(Const.API_KEY)
        apiKey: String,
    ): GameService = GameServiceImpl(
        GameApi(
            BASE_URL,
            apiKey,
        )
    )
}
