package io.github.zmunm.insight.repository.module

import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.zmunm.insight.repository.MovieRepository
import io.github.zmunm.insight.repository.datasource.MovieDataSource
import io.github.zmunm.insight.repository.service.MovieCache
import io.github.zmunm.insight.repository.service.MovieService

@Module
@InstallIn(SingletonComponent::class)
internal object RepositoryModule {

    @Reusable
    @Provides
    fun provideMovieRepository(
        movieService: MovieService,
        movieCache: MovieCache,
    ): MovieRepository = MovieDataSource(
        movieService,
        movieCache,
    )
}
