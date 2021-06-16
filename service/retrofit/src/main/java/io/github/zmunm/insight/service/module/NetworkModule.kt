package io.github.zmunm.insight.service.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.zmunm.insight.ApiKey
import io.github.zmunm.insight.repository.service.GameService
import io.github.zmunm.insight.service.RetrofitInstance
import io.github.zmunm.insight.service.api.GameRetrofitApi
import io.github.zmunm.insight.service.impl.GameRetrofitService
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object NetworkModule {
    private const val BASE_URL = "https://api.rawg.io/api/"

    @Provides
    @Singleton
    fun provideGameService(
        @ApiKey
        apiKey: String,
    ): GameService = GameRetrofitService(
        RetrofitInstance(BASE_URL, apiKey).create(GameRetrofitApi::class.java)
    )
}
