package io.github.zmunm.insight.repository.module

import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.zmunm.insight.repository.MovieRepository
import io.github.zmunm.insight.repository.datasource.MovieDataSource
import io.github.zmunm.insight.repository.service.MovieService

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Reusable
    @Provides
    internal fun provideMovieRepository(
        movieService: MovieService
    ): MovieRepository = MovieDataSource(
        movieService
    )
}