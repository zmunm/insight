package io.github.zmunm.insight.repository.module

import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.zmunm.insight.repository.MovieRepository
import io.github.zmunm.insight.repository.impl.MovieRepositoryImpl

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Reusable
    @Provides
    internal fun provideABRepository(): MovieRepository = MovieRepositoryImpl()
}