package io.github.zmunm.insight.remote.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.zmunm.insight.remote.api.GameApi
import io.github.zmunm.insight.remote.impl.GameServiceImpl
import io.github.zmunm.insight.repository.service.GameService
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.features.json.serializer.KotlinxSerializer.Companion.DefaultJson
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object NetworkModule {
    @Provides
    @Singleton
    fun provideGameService(): GameService = GameServiceImpl(
        GameApi(
            HttpClient(CIO) {
                install(JsonFeature) {
                    serializer = KotlinxSerializer(DefaultJson)
                }
            }
        )
    )
}
