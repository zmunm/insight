package io.github.zmunm.insight.remote.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.zmunm.insight.remote.api.MovieApi
import io.github.zmunm.insight.remote.impl.MovieServiceImpl
import io.github.zmunm.insight.repository.service.MovieService
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.features.json.serializer.KotlinxSerializer.Companion.DefaultJson
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object NetworkModule {
    @Provides
    @Singleton
    fun provideMovieService(): MovieService = MovieServiceImpl(
        MovieApi(
            HttpClient(CIO) {
                install(JsonFeature) {
                    serializer = KotlinxSerializer(DefaultJson)
                }
            }
        )
    )
}
