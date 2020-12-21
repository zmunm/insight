package io.github.zmunm.insight.remote.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.zmunm.insight.remote.RetrofitInstance
import io.github.zmunm.insight.remote.api.MovieApi
import io.github.zmunm.insight.remote.impl.MovieServiceImpl
import io.github.zmunm.insight.repository.service.MovieService
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object NetworkModule {
    @Provides
    @Singleton
    fun provideMovieService(): MovieService = MovieServiceImpl(
        RetrofitInstance().create(MovieApi::class.java)
    )
}
