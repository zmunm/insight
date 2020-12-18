package io.github.zmunm.insight.remote.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.zmunm.insight.remote.RetrofitBuilder
import io.github.zmunm.insight.remote.api.MovieApi
import io.github.zmunm.insight.remote.impl.MovieServiceImpl
import io.github.zmunm.insight.repository.service.MovieService
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    private val retrofit = RetrofitBuilder.build()

    @Provides
    @Singleton
    internal fun provideMovieService(): MovieService = MovieServiceImpl(
        retrofit.create(MovieApi::class.java)
    )
}